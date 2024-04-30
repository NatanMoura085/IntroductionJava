package classes.DesafioComposicao;

import java.util.List;

public class Item {
    int qtde;
     Produto produto;


Item(int qtde ){
    this.qtde =qtde;


}

    public int getQtde() {
        return qtde;
    }

    void adicionaProduto(Produto produto){
    this.produto =produto;
}

    @Override
    public String toString() {
        return "Item{" +
                "qtde=" + qtde +
                ", produto=" + produto +
                '}';
    }
}
