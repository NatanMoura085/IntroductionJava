package classes.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> produtos = produto -> System.out.println(produto.nome);
        Produto p1 = new Produto("Notebook",2000,0.2);
        Produto p2 = new Produto("Lapis", 4000,0.4);
        Produto p3 = new Produto("Cadeira",500,0.1);
        Produto p4 = new Produto("carro", 30000,0.8);
        List<Produto> listaProdutos = Arrays.asList(p1,p2,p3,p4);
        produtos.accept(p1);

        listaProdutos.forEach(System.out::println);
        listaProdutos.forEach(p->System.out.println(p.preco));




    }
}
