package classes.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Predicate<AlunoFilter> media = (n)->n.nota >=7;
        Function<AlunoFilter,String> passouDeAno = (n)->n.nome + " " + "VocÊ Passou de Ano";
        BinaryOperator<String> soma = (acc,n) ->acc + n;


        AlunoFilter a1 = new AlunoFilter("Natan",10.00);
        AlunoFilter a2 = new AlunoFilter("Carlos",4.0);
        AlunoFilter a3 = new AlunoFilter("Rone", 7.0);
        AlunoFilter a4 = new AlunoFilter("Ronaldo",6.0);

        List<AlunoFilter> alunoFilters = Arrays.asList(a1,a2,a3,a4);
        alunoFilters.stream().filter(media).map(passouDeAno).reduce(soma).ifPresent(System.out::println);

    }
}
