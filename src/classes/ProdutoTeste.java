package classes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",23.77,0.45);
        System.out.println(p1.PrecoComDesconto(0.25,1000));
    }
}
