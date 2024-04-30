package classes.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cliente {
    String name;
    List<Compra> listaCompra = new ArrayList<>();
   Produto produto;
   Compra compra;
   Cliente cliente;
 Item item;
 Cliente(String name){
     this.name =name;
     

 }
 void AdicionaListaAsCompra(Compra compra){
     listaCompra.add(compra);

 }

    double calc =9;
   double total = 0;
    double ObterValor(){
    for (Compra compras:listaCompra){
        total+=compras.ListaItems.get(0).produto.GetPreco();

    }
   return total ;

}
    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", listaCompra=" + listaCompra +
                '}';
    }
}
