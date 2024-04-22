package fundamentos;

import java.util.Scanner;

public class Entradass {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Integer idade = 18;
        String erroCustom = "Não e maior de idade";
        System.out.println("Digite seu nome");
       String nome =  entrada.nextLine();
       System.out.println("Digite sua idade");
       Integer numero = entrada.nextInt();

       var idadeCorreta = idade <=numero ? numero :erroCustom;
       System.out.println("\nSeu nome é :" + nome+"\nSua idade é :" + idadeCorreta);


        entrada.close();
    }
}
