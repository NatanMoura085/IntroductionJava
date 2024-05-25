package classes.generics;

public class ParesTest {
    public static void main(String[] args) {
        Pares<Integer,String> resultdoConcurso = new Pares<>();
        resultdoConcurso.adicionar(1,"Natan");
        resultdoConcurso.adicionar(2,"Carlos");
        resultdoConcurso.adicionar(4,"Karol");

        System.out.print(resultdoConcurso.getValor(2));

    }
}
