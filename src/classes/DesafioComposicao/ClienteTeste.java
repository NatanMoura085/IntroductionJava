package classes.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {
    public static void main(String[] args) {


        //PRODUTOS
        Produto p1 = new Produto("Notebook",200);
        Produto p2 = new Produto("Fogão",500);

        //ITENS
        Item itens = new Item(4);
        Item itens2 = new Item(7);
        itens.adicionaProduto(p1);
        itens2.adicionaProduto(p2);



       // Item itens2 = new Item(2,p2);
        //COMPRAS
        Compra c1 = new Compra();
        Compra c2 = new Compra();



        c1.adicionaItem(itens);
        c2.adicionaItem(itens2);



    Cliente cliente1 = new Cliente("Natan");
   cliente1.AdicionaListaAsCompra(c1);
   cliente1.AdicionaListaAsCompra(c2);


           // System.out.println(cliente1.toString());
        System.out.println(cliente1.ObterValor());





    }
}
