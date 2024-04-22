package classes.ArraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você que informar ?");
         int res = entrada.nextInt();
        double[] notasAluno =  new double[res];

        for (int i = 0; i < notasAluno.length;i++ ){
            System.out.println("Digite Nota" + (i + 1+ ":"));
             notasAluno[i]+=entrada.nextDouble();
             System.out.println(Arrays.toString(notasAluno));
        }
        for (double notas:notasAluno){
            double soma = (notas+notas) / 2;
            System.out.println("Resultado da nota media"+soma);
        }


        entrada.close();


    }


}
