package classes.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> listSupplier = () -> Arrays.asList("Bia","Lia","Ria");

        System.out.println(listSupplier.get());
    }
}
