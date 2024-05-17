package classes.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Reduce3 {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;
        Predicate<AlunoFilter> aprovado = (a)->a.nota >=7.0;
        Function<AlunoFilter,Double> notas = (n)->n.nota;
        BiFunction<Media,Double,Media> media = (med,not)-> med.AdicionaValor(not);
        BinaryOperator<Media> combiner = (m1,m2)-> m1.combinar(m1,m2);


        AlunoFilter a1 = new AlunoFilter("Natan",7.0);
        AlunoFilter a2 = new AlunoFilter("Carlos", 10.0);
        AlunoFilter a3 = new AlunoFilter("Roni",8.0);
        AlunoFilter a4 = new AlunoFilter("Ronaldo",2.0);
        List<AlunoFilter> filterList = Arrays.asList(a1,a2,a3,a4);
      Media medio =  filterList.parallelStream().filter(aprovado).map(notas).reduce(new Media(),media,combiner);

      System.out.print(medio.getValor());


    }
}
