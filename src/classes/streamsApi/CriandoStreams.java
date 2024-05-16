package classes.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;
        System.out.println("\n#Criando Uma Stream da primeira forma");
        Stream<String> langs = Stream.of("Java","JavaScript","perl","Rust","Go");
        langs.forEach(print);

        System.out.println("\n#Segunda forma de Cria uma Stream");
        String[] lista = {"Carlos","Bia","Catarina"};
        Arrays.stream(lista).forEach(print);

        System.out.println("\nTerceira Forma de fazer Uma Stream");
        List<String> stringList = Arrays.asList("Caio","Mister","Hellow");
        stringList.stream().forEach(print);
        stringList.parallelStream().forEach(print);


    }
}
