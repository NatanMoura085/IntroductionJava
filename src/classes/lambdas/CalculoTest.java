package classes.lambdas;

public class CalculoTest {
    public static void main(String[] args) {
      Calculo m1 = new Multiplicar();
      Somar s1 = new Somar();

      System.out.println(s1.executar(2,2));
      System.out.println(m1.executar(2,2));
    }
}
