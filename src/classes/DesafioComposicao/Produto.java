package classes.DesafioComposicao;

public class Produto {
    String nome;
    double preco ;
    Item item;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }

    double GetPreco(){
        return preco;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +

                '}';
    }
}
