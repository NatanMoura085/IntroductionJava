package classes.br.com.coder3.modelo;

import classes.br.com.coder3.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

    Campo campo = new Campo(0,0);
    private int linhas;
    private int colunas;
    private int minas;

    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas){
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        gerarCampos();
        associarOsVizinhos();
        sotearMinas();

    }



    private void gerarCampos() {
        for (int linha = 0; linha <linhas; linha++){
           for (int coluna = 0; coluna <colunas;coluna++){
                   campos.add(new Campo(linha,coluna));
           }

        }
    }
    private void associarOsVizinhos() {
        for (Campo c1:campos){
            for (Campo c2:campos){
                c1.adicionarVizinhos(c2);
            }
        }
    }
    private void sotearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = (m)  ->m.IsMinar();

        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        }while (minasArmadas < minas);
    }

    public boolean objetivoAlcacado(){
        return campos.stream().allMatch(c->c.objetivoAlcancado());
    }

    public void reiniciar(){
        campos.stream().forEach(c->c.reniciar());
        sotearMinas();
    }


    public int getLinhas(){
        return linhas;
    }

    public int getColunas(){
        return colunas;
    }

    public boolean getObjetivo(){
        return campo.objetivoAlcancado();
    }

    public int getMinas(){
        return minas;
    }


    public void abrir(int linha,int coluna){
       try{
           campos.parallelStream().filter(c->c.getLinha() == linha && c.getColuna() ==coluna)
                   .findFirst().ifPresent(c->c.abrir());
       }catch(ExplosaoException e){
           campos.forEach(c->c.setAberto(true));
         throw e;

       }


    }

    public void marcar(int linha, int coluna){
        campos.parallelStream().filter(c->c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst().ifPresent(c->c.alternaMarcacao());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("  ");
        for (int c = 0; c <colunas; c++){
             sb.append(" ");
             sb.append(c);
             sb.append(" ");
        }
        sb.append("\n");
        int i = 0;

        for (int l = 0; l <linhas;l++){
            sb.append(l);
            sb.append(" ");
            for (int c = 0; c <colunas;c++){
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }


}
