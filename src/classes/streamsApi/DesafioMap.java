package classes.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);


                 nums.stream()
                .map(Ultilitarios.StringBinaryy).map(Ultilitarios.StringIverte).map(Ultilitarios.converteParaInteiro).forEach(print);


    }
}
