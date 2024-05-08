package classes.lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",3893.89,0.15);
        Predicate<Produto> iscaro = prod -> (prod.preco  *(  1- prod.desconto)) >=750;

        System.out.println(iscaro.test(p1));
    }
}
