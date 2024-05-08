package classes.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeachFuncional {

    public static void main(String[] args) {
        List<String> aprovados =  Arrays.asList("Lia", "Bia", "Lua","Lai");
        System.out.println("Method Lambda");
        aprovados.forEach(nome -> System.out.println(nome));
        System.out.println("Method Reference");
        aprovados.forEach(System.out::println);

        System.out.println("Method Lambada 02#");
        aprovados.forEach(nome -> imprimir(nome));

        System.out.println("Method Reference 02#");
        aprovados.forEach(ForeachFuncional::imprimir);

    }

    static void imprimir(String nome){
        System.out.println(nome);
    }
}
