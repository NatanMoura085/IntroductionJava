package classes.generics;

public class CaixaNumeroTest {
    public static void main(String[] args) {
        CaixaNumero caixaNumero = new CaixaNumero();
        caixaNumero.guarda(20.99);
        System.out.print(caixaNumero.abrir());

    }
}
