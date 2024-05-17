package classes.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> soma = (acc,n)-> acc + n;
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer nov = nums.stream().reduce(soma).get();

        nums.stream().filter(n -> n>5).reduce(soma).ifPresent(System.out::println);




    }
}
