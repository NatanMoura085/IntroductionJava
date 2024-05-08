package classes.lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calc = (x,y)-> x*y;

        System.out.println(calc.executar(2,6));
    }
}
