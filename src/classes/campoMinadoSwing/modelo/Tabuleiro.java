package classes.campoMinadoSwing.modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador{

    Campo campo = new Campo(0,0);
    private final int linhas;
    private final int colunas;
    private final int minas;

    private final List<Campo> campos = new ArrayList<>();
    private final List<Consumer<ResultadoGanhou>> observadores = new ArrayList<>();

    public void registraObservador(Consumer<ResultadoGanhou> resultado){
       observadores.add(resultado);
    }
    public void notificarObservadores(boolean result){
        observadores.stream().forEach(o->o.accept(new ResultadoGanhou(result)));
    }

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
                 Campo campo = new Campo(linha,coluna);
                 campo.registraObservador(this);
                   campos.add(campo);
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
    public void paraCadaCampo(Consumer<Campo> funcao){
        campos.forEach(funcao);
    }

    public void abrir(int linha,int coluna){
           campos.parallelStream().filter(c->c.getLinha() == linha && c.getColuna() ==coluna)
                   .findFirst().ifPresent(c->c.abrir());
    }

    public void marcar(int linha, int coluna){
        campos.parallelStream().filter(c->c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst().ifPresent(c->c.alternaMarcacao());
    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento campoEvento) {
        if(campoEvento == CampoEvento.EXPLODIR){
            System.out.print("Perdeu");
            notificarObservadores(false);
        }else if(objetivoAlcacado()){
            System.out.print("Ganhou");
            notificarObservadores(true);

        }
    }

    private void mostrarMinas(){
                 campos.stream()
                .filter(c->c.IsMinar())
                         .filter(c-> !c.IsMarcado())
                .forEach(c->c.setAberto(true));
    }

    public void alternaMarcacao(int linha,int coluna){
        campos.stream().filter(c-> c.getLinha() == linha && c.getColuna() == coluna).findFirst();
    }
}
