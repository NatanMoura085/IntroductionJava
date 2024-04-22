package classes.ArraysCollections;

import java.util.Arrays;

public class Arrayss {

    public static void main(String[] args) {
        double[] notasAluno = new double[3];
        notasAluno[0] = 10.00;
        notasAluno[1] = 3.7;
        notasAluno[2] = 7.0;
        System.out.println(Arrays.toString(notasAluno));

        double totalNotas  = 0;
        for(int i = 0; i < notasAluno.length;i++ ){
            totalNotas +=notasAluno[i];
        }
        System.out.println(totalNotas);
    }
}
