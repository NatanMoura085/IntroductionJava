package classes.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = valor-> valor +2;
        UnaryOperator<Integer> multiplica = valor->valor *2;
        UnaryOperator<Integer> aquadrado = valor->valor * valor;

        System.out.println(maisDois.andThen(multiplica).andThen(aquadrado).apply(24));
    }
}
