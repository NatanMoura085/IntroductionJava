package classes;

public class Produto {
    String nome;
    double preco;
    double desconto;
Produto(String nome,double preco, double desconto){
    this.nome = nome;
    this.preco = preco;
    this.desconto = desconto;

}
    double PrecoComDesconto(double desconto,double preco){
        double calc = preco * (1-(desconto /100));
        return  calc;


    }
}
