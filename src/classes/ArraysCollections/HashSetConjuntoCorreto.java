package classes.ArraysCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetConjuntoCorreto {
    public static void main(String[] args) {
       // Set<String> listaAprovado = new HashSet<>();
        SortedSet<String> listaAprovado = new TreeSet<>();
        listaAprovado.add("Natan");
        listaAprovado.add("larissa");
        listaAprovado.add("casia");
        System.out.println(listaAprovado);
    }
}
