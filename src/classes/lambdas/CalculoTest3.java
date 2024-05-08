package classes.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x,y)->x+y;
        System.out.println(calc.apply(2.0,2.0));
    }
}
