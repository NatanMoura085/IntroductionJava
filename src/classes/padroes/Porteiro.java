package classes.padroes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    private List<ObservadorChegadaAniversariante> observdores = new ArrayList<>();


    public  void  registrarObservador(ObservadorChegadaAniversariante observador){
    observdores.add(observador);
    }

    public void monitorar(){
        Scanner entrada = new Scanner(System.in);
         String valor = "";


        while (!"Sair".equalsIgnoreCase(valor)){
            System.out.print("O Aniversariante chegou ?");
            valor = entrada.nextLine();

            if ("Sim".equalsIgnoreCase(valor)){
          EventoChegadaAniversariante event =  new EventoChegadaAniversariante(new Date());

           observdores.stream().forEach(o->o.chegou(event));
           valor = "sair";

            }else{
                System.out.print("Alarme false!!!");
            }

        }
        entrada.close();
    }
}
