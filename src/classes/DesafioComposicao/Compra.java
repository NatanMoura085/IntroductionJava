package classes.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> ListaItems = new ArrayList<Item>();
    Item item;
    Produto produto;
    Cliente cliente;

    Compra() {
        this.cliente = cliente;
    }

    void AdicionaItensCompra(List<Item> items){
this.ListaItems = new ArrayList<>();
}

    void adicionaItem(Item item){
   ListaItems.add(item);


    }
    @Override
    public String toString() {
        return "Compra{" +
                "ListaItems=" + ListaItems +
                '}';
    }



}
