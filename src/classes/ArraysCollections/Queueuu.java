package classes.ArraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Queueuu {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        System.out.println(fila.peek());
        System.out.println(fila.element());
    }
}
