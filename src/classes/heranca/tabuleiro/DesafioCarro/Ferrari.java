package classes.heranca.tabuleiro.DesafioCarro;

public class Ferrari extends Carro {

    Ferrari(){
        super(400);
    }
    boolean Acelera() {
        boolean acelera1 = super.Acelera();
        boolean acelera2 = super.Acelera();
        boolean acelera3 = super.Acelera();
        boolean acelera4 = super.Acelera();
        boolean acelera5 = super.Acelera();
        return acelera1 | acelera2 | acelera3 | acelera4 | acelera5;
    }


    boolean Freia() {
        boolean freia1 = super.Freia();
        boolean freia2 = super.Freia();
        boolean freia3 = super.Freia();
        return freia1 | freia2 | freia3;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "velocidade=" + velocidade + ""+"KM"+
                '}';
    }
}
