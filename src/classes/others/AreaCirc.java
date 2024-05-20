package classes.others;

public class AreaCirc {
    static double pi = 3.14;
    double raio;

    AreaCirc(double raio){
        this.raio = raio;

    }

    double getRaio(){
        return pi * Math.pow(raio,2);
    }
}
