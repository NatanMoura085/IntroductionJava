package classes.generics;

import java.util.Arrays;
import java.util.List;

public class ListaUltilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java","Php","C#","Cobol","JavaScript");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        String valor = ListaUltil.getUltimo2(langs);

        System.out.print(valor);
    }
}
