package classes.heranca.tabuleiro.DesafioCarro;

public class Carro {
    final int VELOCIDA_MAXIMA ;
    int velocidade = 0;
    Carro(int VELOCIDA_MAXIMA ){
        this.VELOCIDA_MAXIMA = VELOCIDA_MAXIMA;

    }




    boolean Acelera(){
    if (velocidade + 20 >= VELOCIDA_MAXIMA){
       this.velocidade =VELOCIDA_MAXIMA;


    }else{
        this.velocidade+=20;
        return true;

    }
    return  false;
    }
    boolean Freia(){
        if (velocidade !=0){
            this.velocidade-=10;
        }else{
            System.out.println("Esta parado o carro");
            return false;
        }
        return true;
  }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                '}';
    }
}
