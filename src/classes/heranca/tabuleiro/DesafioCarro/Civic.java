package classes.heranca.tabuleiro.DesafioCarro;

public class Civic extends Carro{

Civic(){
    super(200);
}
    boolean Acelera() {
       boolean acelera1 =  super.Acelera();
        boolean acelera2 =  super.Acelera();
        boolean acelera3 =  super.Acelera();

       return acelera1 | acelera2 | acelera3;
    }


    boolean Freia() {
            boolean freia1 = super.Freia();
            boolean freia2 = super.Freia();
            return  freia1 | freia2;
    }

    @Override
    public String toString() {
        return "Civic{" +
                "velocidade=" + velocidade +  ""+"KM" +
                '}';
    }
}
