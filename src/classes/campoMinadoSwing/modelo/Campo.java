package classes.campoMinadoSwing.modelo;



import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;
    private boolean minado = false;
    private boolean aberto = false;
    private boolean marcado = false;

    private List<Campo> campoList = new ArrayList<>();
    private List<CampoObservador> Observadors = new ArrayList<>();

    public void  registraObservador(CampoObservador observador){
        Observadors.add(observador);
    }
    private void notificarObservador(CampoEvento Evento){
        Observadors.stream().forEach(o->o.eventoOcorreu(this,Evento));
    }


    Campo(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;

    }

    boolean adicionarVizinhos(Campo vizinhos){

        boolean linhaDiferente = linha != vizinhos.linha;
        boolean colunaDiferente = coluna != vizinhos.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;
        int deltaLinha = Math.abs(linha - vizinhos.linha);
        int deltaColuna = Math.abs(coluna - vizinhos.coluna);
        int deltaGeral = deltaLinha + deltaColuna;

        if ( deltaGeral ==1 && !diagonal){
            campoList.add(vizinhos);
            return true;
        }else if (deltaGeral == 2 && diagonal){
           campoList.add(vizinhos);
            return true;
        }else{
            return false;
        }

    }

    public void alternaMarcacao(){
        if (!aberto){
            marcado = !marcado;
            if (marcado){
                notificarObservador(CampoEvento.MARCAR);
            }else{
                notificarObservador(CampoEvento.DESMARCAR);
            }
        }
    }

    public boolean abrir(){
        if (!aberto && !marcado){


            if (minado) {
              notificarObservador(CampoEvento.EXPLODIR);
              return true;

            }
           setAberto(true);



        if(vizinhacaSegura()){
            campoList.forEach(v->v.abrir());
        }
            return true;


       }else{
            return false;
        }
    }

    public boolean vizinhacaSegura(){
       return campoList.stream().noneMatch(v->v.minado);

    }

        void  minar(){
         minado = true;
       }

       void setAberto(boolean aberto){
        this.aberto =aberto;
        if (aberto){
            notificarObservador(CampoEvento.ABRIR);
        }

       }
     public boolean IsAberto(){
        return  aberto;
     }

     public boolean IsFechado(){
        return !IsAberto();
     }

     public boolean IsMinar(){
        return minado;
     }

     public boolean IsMarcado(){
        return marcado;
     }

     public int getLinha(){
        return linha;
     }
     public int getColuna(){
        return coluna;

     }

     public boolean objetivoAlcancado(){
        boolean desvendando = !minado && aberto;
        boolean protegido = minado && marcado;
        return  protegido || desvendando;
     }

     public void  reniciar(){
        minado = false;
        marcado = false;
        aberto = false;
        notificarObservador(CampoEvento.RENICIAR);
     }

       public  int minasVizinhaca(){
         long contador = campoList.stream().filter(v->v.minado).count();

            return (int) contador;
        }


}
