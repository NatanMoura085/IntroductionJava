package classes.swingg;

import javax.swing.*;
import java.awt.*;

public class Observador {
    public static void main(String[] args) {
     JFrame janela = new JFrame("Observador");
     janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     janela.setSize(600,200);
     janela.setLocationRelativeTo(null);
     janela.setVisible(true);


     JButton botao = new JButton("Clika");

     janela.add(botao);

     botao.addActionListener(e->System.out.print( "\n" + "Evento deu certo !!!"));
    }
}
