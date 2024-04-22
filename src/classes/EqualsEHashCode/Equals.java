package classes.EqualsEHashCode;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();

        u1.nome = "Natan Moura";
        u1.email = "mouranatan@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Natan Moura";
        u2.email = "mouranatan@gmail.com";

        System.out.println(u1.equals(u2));

    }
}
