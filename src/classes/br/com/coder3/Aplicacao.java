package classes.br.com.coder3;

import classes.br.com.coder3.modelo.Tabuleiro;
import classes.br.com.coder3.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro t1 = new Tabuleiro(6,6,6);
        new TabuleiroConsole(t1);
    }
}
