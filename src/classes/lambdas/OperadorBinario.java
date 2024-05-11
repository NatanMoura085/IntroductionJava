package classes.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) / 2;
        BiFunction<Double, Double,String> oResultado = (n1,n2) ->{
                double valor = (n1+n2) /2;
                return  valor >=6 ? "Aprovado":"Reprovado";
        };

        System.out.println(oResultado.apply(7.0,7.0));
    }
}
