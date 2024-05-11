package classes.lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer,String> parOuImpar = numero -> numero % 2 ==0 ? "Par" : "Impar";
        Function<String,String> Oresultado = valor->valor + "!!!";
        Function<String,String> Duvidas = duvida ->duvida + "?????";


        System.out.println(parOuImpar.andThen(Oresultado).apply(32));

    }
}
