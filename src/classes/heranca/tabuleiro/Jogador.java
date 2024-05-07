package classes.heranca.tabuleiro;

import java.util.Map;

public class Jogador {

     public  int vida =100;
    public  int x = 20;
    public int y =20;


    public   boolean Atacar(Jogador oponente){
      int deltaX = Math.abs(x - oponente.x);
      int deltaY = Math.abs(y - oponente.y);
      if (deltaX ==0 && deltaY ==1){
          oponente.vida -=10;
          return true;
      }else if(deltaX ==1 &&  deltaY ==0){
         oponente.vida -=10;
         return true;
      }else {
          return  false;
      }


    }
    boolean Andar(Direcao direcao){
     if (direcao !=null){
         switch (direcao){
             case NORTE:
                 y--;
                 break;
             case LESTE:
                 x++;
                 break;
             case SUL:
                 x++;
                 break;

         }
     }
     return true;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "vida=" + vida +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
