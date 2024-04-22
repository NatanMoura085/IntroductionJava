package classes.composicao;

public class CarroTest {
    public static void main(String[] args) {
   Carro c1 = new Carro();
  c1.ligado();
   System.out.println(c1.estaLigado());
   System.out.println(c1.motor.giros());
        c1.acellera();

   System.out.println(c1.motor.giros());
   System.out.println(c1.motor.carro.motor.carro);
    }
}
