package classes.streamsApi;

import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;

public class Mapaa {
    public static void main(String[] args) {
       Consumer<Object> print = System.out::print;

        List<String> marcas = Arrays.asList("bmw","audi","civic","corola");


        System.out.println("\nUsando Composiçao..");
        marcas.stream().map(Ultilitarios.DeixaMaiuscula).map(Ultilitarios.pegaPrimeiraLetra).forEach(print);

    }
}
