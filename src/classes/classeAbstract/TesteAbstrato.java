package classes.classeAbstract;

public class TesteAbstrato {
    public static void main(String[] args) {
        Mamifero c1 = new Cachorro();
        System.out.println(c1.mamar());
    }
}
