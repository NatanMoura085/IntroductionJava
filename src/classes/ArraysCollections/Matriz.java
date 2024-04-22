package classes.ArraysCollections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("informe quantos alunos");
        int qtdeAlunos = entrada.nextInt();
        System.out.println("informe quantas notas");
        int qtdeNotas = entrada.nextInt();
        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double total = 0;
        for (int a = 0; a <notasDaTurma.length; a++){
            for (int n = 0;n < notasDaTurma[a].length; n++){
             System.out.println("Informe a nota %d do aluno %d:");
             notasDaTurma[a][n] = entrada.nextDouble();
             total+=notasDaTurma[a][n];

            }

        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Media da turma é" + media);
        entrada.close();
    }
}
