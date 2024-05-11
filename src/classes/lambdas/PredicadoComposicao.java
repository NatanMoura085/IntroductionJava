package classes.lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> Ispar = valor->valor % 2 ==0;
        Predicate<Integer> IsTresDigitos = valor ->valor >=100 && valor <999;

        System.out.println(Ispar.and(IsTresDigitos).test(102));
    }
}
