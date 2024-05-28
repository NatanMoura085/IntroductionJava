package classes.campoMinadoSwing.visao;

import classes.campoMinadoSwing.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    TelaPrincipal(){
        Tabuleiro tabuleiro = new Tabuleiro(16,30,50);
        add(new PainelTabuleiro(tabuleiro));
        setVisible(true);
        setTitle("Campo-Minado");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(690,438);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
