package classes.br.com.coder3.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

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
            minasArmadas = campos.stream().filter(minado).count();
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
        }while (minasArmadas < minas);
    }

    public boolean objetivoAlcacado(){
        return campos.stream().allMatch(c->c.objetivoAlcancado());
    }

    public void reiniciar(){
        campos.stream().forEach(c->c.reniciar());
        sotearMinas();
    }


}
