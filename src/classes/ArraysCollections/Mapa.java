package classes.ArraysCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1,"Natan");
        usuarios.put(2,"Ronaldo");
        usuarios.put(4,"Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.get(2));
        System.out.println(usuarios.remove(4));
        System.out.println(usuarios.values());

        for (String valor:usuarios.values()){
            System.out.println(valor);
        }

        for (int chave:usuarios.keySet()){
            System.out.println(chave);
        }
        for (Entry<Integer, String> registro:usuarios.entrySet()){

            System.out.println("aqui" + registro);
        }
    }
}
