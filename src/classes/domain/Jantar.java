package classes.domain;

public class Jantar {
    public static void main(String[] args) {
        Comida C1 = new Comida("Arozz",22.22);
        Pessoa p1 = new Pessoa("Natan",60.00);
        System.out.println(p1.Comer(C1));

    }
}
