package classes.ArraysCollections;

import java.util.HashSet;

public class HashSetConjunto {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.4);
        conjunto.add("Natan");
        conjunto.add(true);
        conjunto.add('x');

        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.remove('x'));
    }
}
