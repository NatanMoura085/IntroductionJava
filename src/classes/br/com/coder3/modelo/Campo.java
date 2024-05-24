package classes.br.com.coder3.modelo;

import classes.br.com.coder3.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;
    private boolean minado = false;
    private boolean aberto = false;
    private boolean marcado = false;

    private List<Campo> campoList = new ArrayList<>();



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

    void alternaMarcacao(){
        if (!aberto){
            marcado = !marcado;
        }
    }

    boolean abrir(){
        if (!aberto && !marcado){
             aberto = true;

            if (minado) {
                throw new ExplosaoException();

            }



        if(vizinhacaSegura()){
            campoList.forEach(v->v.abrir());
        }
            return true;


       }else{
            return false;
        }
    }

    boolean vizinhacaSegura(){
       return campoList.stream().noneMatch(v->v.minado);

    }

        void  minar(){
         minado = true;
       }

       void setAberto(boolean aberto){
        this.aberto =aberto;
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

     void  reniciar(){
        minado = false;
        marcado = false;
        aberto = false;
     }

       public  long minasVizinhaca(){
         long contador = campoList.stream().filter(v->v.minado).count();

            return contador;
        }
     public String toString(){
        if (marcado){
            return "x";
        }else if(aberto && minado){
            return "*";

        }else if(aberto && minasVizinhaca() >0){
            return Long.toString(minasVizinhaca());

        }else if(aberto){
                return " ";
            }else {
            return "?";
        }

     }

}
