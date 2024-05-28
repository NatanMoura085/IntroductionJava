package classes.campoMinadoSwing.visao;



import classes.campoMinadoSwing.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {
    PainelTabuleiro(Tabuleiro tabuleiro){

        setLayout(new GridLayout(tabuleiro.getLinhas(),tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(c->add(new BotaoCampo(c)));

        SwingUtilities.invokeLater(()->{
            tabuleiro.registraObservador(e->{
                if (e.isGanhou()){
                    JOptionPane.showMessageDialog(this,"Voce ganhou");
                }else{
                    JOptionPane.showMessageDialog(this,"Voce perdeu");
                }
            });
        });

    }


}
