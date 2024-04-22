package fundamentos;

import javax.swing.*;

public class ConversaoDeStringParaNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite seu valor1");
        String valor2 = JOptionPane.showInputDialog("Digite seu valor2");
        double valorConvertido = Double.parseDouble(valor1);
        double valorConvertido2 = Double.parseDouble(valor2);
        double soma = valorConvertido + valorConvertido2;
        System.out.println(soma);
    }
}
