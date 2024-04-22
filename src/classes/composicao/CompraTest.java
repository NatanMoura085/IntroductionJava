package classes.composicao;

public class CompraTest {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Natan moura";
        c1.adicionaItem(new Item("Caneta",20,40.5));
        c1.adicionaItem(new Item("cardeno",40,50.7));
        c1.adicionaItem(new Item("louza",10,70.77));
        System.out.println(c1.itens.size());

    }
}
