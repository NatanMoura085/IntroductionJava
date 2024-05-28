package classes.padroes;

import java.util.Date;

public class EventoChegadaAniversariante {

    private final Date momento;

    EventoChegadaAniversariante(Date momento){
         this.momento = momento;
    }

    public Date getMomento(){
       return momento;
    }
}
