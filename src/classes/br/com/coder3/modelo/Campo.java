package classes.br.com.coder3.modelo;

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
}
