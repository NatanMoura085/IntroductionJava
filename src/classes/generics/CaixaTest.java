package classes.generics;

public class CaixaTest {
    public static void main(String[] args) {
        String texto = "Natan";
        Integer nums = 12445;
        Caixa<String> caixa1 = new Caixa<>();
        Caixa<Integer> caixa2 = new Caixa<>();
        caixa1.guarda(texto);
        caixa2.guarda(nums);

        System.out.print(caixa1.abrir());
        System.out.print("\n");
        System.out.print(caixa2.abrir());
    }
}
