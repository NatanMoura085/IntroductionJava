package classes.lambdas;

import java.text.NumberFormat;
import java.util.function.*;

public class DesafioBinaryOperator {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",3000.00,0.2);
        NumberFormat z = NumberFormat.getCurrencyInstance();
        BinaryOperator<Double> calculaDesconto = (preco,desconto)-> (preco - desconto) / 100 * 100;
        UnaryOperator<Double> imposto = (preco) ->preco >= 2500 ? preco - 8.5 : preco;
        Function<Double,String> frete = (valor1)-> valor1 >=3000 ? "R$100" : "R$50";
        System.out.println(calculaDesconto.andThen(imposto).andThen(frete).apply(p1.preco, p1.desconto));

    }
}
