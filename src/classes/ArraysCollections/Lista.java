package classes.ArraysCollections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<UsuarioLista> lista = new ArrayList<>();
        UsuarioLista u1 = new UsuarioLista("Ana");
        lista.add(u1);
        lista.add(new UsuarioLista("Lia"));
        lista.add(new UsuarioLista("rose"));
        lista.add(new UsuarioLista("marcos"));

        System.out.println(lista.contains(u1));
    System.out.println(lista.remove(1));
    }
}
