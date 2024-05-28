package classes.campoMinadoSwing.visao;

import classes.campoMinadoSwing.modelo.Campo;
import classes.campoMinadoSwing.modelo.CampoEvento;
import classes.campoMinadoSwing.modelo.CampoObservador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BotaoCampo extends JButton  implements CampoObservador, MouseListener {
    private Color BG_PADRAO = new Color(184,184,184);
    private Color BG_MARCAR = new Color(8,179,247);
    private Color BG_EXPLODIR = new Color(189,66,68);
    private Color TEXTO_VERDE = new Color(0,100,0);

    private Campo campo;
    public BotaoCampo(Campo campo){
        this.campo = campo;
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));
        addMouseListener(this);
        campo.registraObservador(this);
    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch (evento){
            case ABRIR:  aplicarEstiloAbrir();
            case MARCAR:
                aplicarEstiloMarca();
                break;

            case DESMARCAR:
                aplicarEstiloDesmarcar();
                break;

            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
            default: aplicaEstiloPadrao();


        }
    }

    private void aplicaEstiloPadrao() {
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));
        setText("");
    }

    private void aplicarEstiloExplodir() {
        setBackground(BG_EXPLODIR);
        setForeground(Color.white);
        setText("X");
    }

    private void aplicarEstiloDesmarcar() {
    }

    private void aplicarEstiloMarca() {
        setBackground(BG_MARCAR);
        setForeground(Color.BLACK);
        setText("M");
    }

    private void aplicarEstiloAbrir() {
        setBorder(BorderFactory.createLineBorder(Color.gray));

        if (campo.IsMinar()){
            setBackground(BG_EXPLODIR);
            return;
        }
        setBackground(BG_PADRAO);
        switch (campo.minasVizinhaca()){
            case 1: setForeground(TEXTO_VERDE);
            break;
            case 2: setForeground(Color.BLUE);
            break;
            case 3: setForeground(Color.yellow);
            break;

            case 4:
            case 5:
            case 6:
            case 7:
            setForeground(Color.red);
             break;

            default:
                setForeground(Color.pink);


        }

        String valor = !campo.vizinhacaSegura() ? campo.minasVizinhaca() + "" : "";
        setText(valor);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 1){
          campo.abrir();
        }else{
        campo.alternaMarcacao();
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
