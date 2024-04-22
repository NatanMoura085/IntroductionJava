package classes.composicao;

import java.util.ArrayList;
import java.util.Arrays;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionaItem(String nome, int quantidade, double preco){
   this.adicionaItem(new Item(nome,quantidade,preco));
    }

    void adicionaItem(Item item){
        itens.add(item);
        item.compra = this;
    }
    double getValor(){
        double total = 0;
        for (Item item:itens){
            total+=item.quantidade + item.preco;

        }
        return total;
    }

}
