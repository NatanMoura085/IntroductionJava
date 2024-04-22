package classes.domain;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome , double peso){
         this.nome = nome;
         this.peso = peso;
    }
    double Comer(Comida comida){

            double result = comida.PesoComida !=0 ? this.peso+=comida.PesoComida : null;


  return result;
    }
}
