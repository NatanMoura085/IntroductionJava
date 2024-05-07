package classes.heranca.tabuleiro.DesafioCarro;

public class Ferrari extends Carro implements Espotivo,Arcondicionado {

    private boolean ligaTurboo ;
    private boolean ligarAr ;
     public  Ferrari(){
        super(400);
        setDelta(15);
    }
    public  boolean Acelera() {
        boolean acelera1 = super.Acelera();
        boolean acelera2 = super.Acelera();
        boolean acelera3 = super.Acelera();
        boolean acelera4 = super.Acelera();
        boolean acelera5 = super.Acelera();
        return acelera1 | acelera2 | acelera3 | acelera4 | acelera5;
    }

    @Override
    public void ligarTurbo() {
        ligaTurboo =true;

    }

    @Override
    public void desligarTurbo() {
        ligaTurboo =false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr =false;
    }

    boolean Freia() {
        boolean freia1 = super.Freia();
        boolean freia2 = super.Freia();
        boolean freia3 = super.Freia();
        return freia1 | freia2 | freia3;
    }


    @Override
    public int getDelta() {
         if (ligaTurboo && ligarAr){
             return 50;
         }else if(ligaTurboo && !ligarAr){
             return 36;
         } else if(!ligaTurboo && ligarAr){
             return 20;

         }else {

             return  15;
         }

    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "velocidade=" + velocidade + ""+"KM"+
                '}';
    }
}
