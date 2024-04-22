package classes.ArraysCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.push("O pequeno Principe");
        livros.add("Don quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        for (String livro:livros){
            System.out.println(livro);
        }
    }
}
