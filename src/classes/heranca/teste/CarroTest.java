package classes.heranca.teste;

import classes.heranca.tabuleiro.DesafioCarro.Carro;
import classes.heranca.tabuleiro.DesafioCarro.Civic;
import classes.heranca.tabuleiro.DesafioCarro.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro civic = new Civic();
        Ferrari ferrari = new Ferrari();


        civic.Acelera();
        civic.Acelera();
        civic.Acelera();
        civic.Acelera();
        civic.Acelera();
        civic.Acelera();






        ferrari.Acelera();
        ferrari.Acelera();
        ferrari.ligarTurbo();
        ferrari.ligarAr();






        System.out.println(civic.toString());
        System.out.println(ferrari.toString());

    }
}
