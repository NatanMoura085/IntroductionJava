package fundamentos;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro salario:");
       String  valor1 =  entrada.nextLine().replace(",",".");
        double conversaoValor1 = Double.parseDouble(valor1);


        System.out.println("Digite segundo salario:");
        String valor2 = entrada.nextLine().replace(",",".");
        double conversaoValor2 = Double.parseDouble(valor2);

        System.out.println("Digite o terceiro salario:");
        String valor3 = entrada.nextLine().replace(",",".");

        double conversaoValor3 = Double.parseDouble(valor3);
      double soma =  conversaoValor1 + conversaoValor2 + conversaoValor1;
      double media = soma / 2;
   System.out.println(soma);
      entrada.close();
    }
}
