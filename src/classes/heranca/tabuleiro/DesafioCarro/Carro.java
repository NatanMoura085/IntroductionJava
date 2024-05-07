package classes.heranca.tabuleiro.DesafioCarro;

public class Carro {
    final int VELOCIDA_MAXIMA ;
    int velocidade = 0;
    private int delta=20;
    Carro(int VELOCIDA_MAXIMA ){
        this.VELOCIDA_MAXIMA = VELOCIDA_MAXIMA;

    }




   public boolean Acelera(){
    if (velocidade + getDelta() >= VELOCIDA_MAXIMA){
       this.velocidade =VELOCIDA_MAXIMA;


    }else{
        this.velocidade+=getDelta();
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

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
