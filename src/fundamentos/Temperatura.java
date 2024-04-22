package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        double valor = 20;
        double xValor = 32;
        final double settings = 5.0/9.0;

        double resultado = Math.floor( valor - xValor * settings);
        System.out.println(resultado + "°C");
    }
}
