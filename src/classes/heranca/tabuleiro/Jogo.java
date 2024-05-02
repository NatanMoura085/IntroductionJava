package classes.heranca.tabuleiro;

public class Jogo {
    public static void main(String[] args) {
        Monstro j1 = new Monstro();
        j1.x =10;
        j1.y = 10;
        Heroi j2 = new Heroi();
        j2.x =10;
        j2.y = 11;

        j1.Atacar(j2);
        j2.Atacar(j1);
        j1.Atacar(j2);



        System.out.println(j1);
        System.out.println(j2);

    }
}
