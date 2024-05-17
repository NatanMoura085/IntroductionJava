package classes.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;
        Predicate<AlunoFilter> Aprovado = (n)-> n.nota >=7.0;
        Function<AlunoFilter,String> parbens = (n1)-> n1.nome  +" Você esta de parabens" + n1.nota  + "\n";
        AlunoFilter a1 = new AlunoFilter("Natan",9.0);
        AlunoFilter a2 = new AlunoFilter("Carlos",7.0);
        AlunoFilter a3 = new AlunoFilter("Ruan",4.0);
        AlunoFilter a4 = new AlunoFilter("Nooob", 5.0);
        List<AlunoFilter> filterList = Arrays.asList(a1,a2,a3,a4);

        filterList.stream().filter(Aprovado).map(parbens).forEach(print);


    }
}
