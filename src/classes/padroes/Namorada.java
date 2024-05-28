package classes.padroes;

public class Namorada  implements ObservadorChegadaAniversariante{

    public void chegou(EventoChegadaAniversariante evento) {
        System.out.print("Avisar os convidados...");
        System.out.print("Apagar as Luzes...");
        System.out.print("Esperar um pouco");
        System.out.print("e... surpresa!!!");
    }
}
