package classes.composicao;

public class Carro {
     Motor motor;

     Carro(){
         this.motor = new Motor(this);
     }

    void acellera(){
        motor.fatorInjecao+=0.4;
    }

    void freia(){
        motor.fatorInjecao -=0.4;
    }
    void ligado(){
        motor.ligado = true;
    }
    void desligado(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
