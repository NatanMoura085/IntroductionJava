package classes.streamsApi;

public class Media {
    private double total;
    private double quantidade;

    public Media AdicionaValor(double valor){
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor(){
        return total /quantidade;
    }

    public  static Media combinar(Media m1, Media m2){
      Media resultado = new Media();
      resultado.total = m1.total + m2.total;
      resultado.quantidade = m1.quantidade + m2.quantidade;
      return resultado;


    }
}
