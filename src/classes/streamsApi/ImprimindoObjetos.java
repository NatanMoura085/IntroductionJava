package classes.streamsApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Bia","Natan","Gui","Lia");
        System.out.println("\nComForeAch para pecorrer objetos");
        for (String aprovados: lista){
            System.out.println(aprovados);

        }

        System.out.println("\nCom Iterator para pecorrer o objetos ");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nCom Stream e ForeAch e Method Reference");
        Stream<String> stringStream = lista.stream();
         stringStream.forEach(System.out::println);
    }
}
