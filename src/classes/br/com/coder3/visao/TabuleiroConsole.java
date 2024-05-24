package classes.br.com.coder3.visao;

import classes.br.com.coder3.excecao.ExplosaoException;
import classes.br.com.coder3.excecao.SairException;
import classes.br.com.coder3.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

     public TabuleiroConsole(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        executarJogo();
    }

    private void executarJogo(){
      try{
          cicloDoJogo();
          boolean continuar = true;
          System.out.print("Voce Que Jogar Outra Partida (n/S)");
          String resposta = entrada.nextLine();
          while(continuar){

              if ("n".equalsIgnoreCase(resposta)){
                  continuar = false;
              }else{
                  tabuleiro.reiniciar();
              }
          }

      }catch(SairException e){
          System.out.print("Tchau!!");

      }finally{
          entrada.close();
      }

    }

    private void cicloDoJogo(){
         try{
             while (!tabuleiro.getObjetivo()){
                 System.out.print(tabuleiro);
                 String digitado = capturaValorDigitado("Digite (x,y): ");
                 Iterator<Integer>xy = Arrays.stream(digitado.split(",")).map(v->Integer.parseInt(v.trim())).iterator();
                 digitado = capturaValorDigitado("1 - Abrir 2 - (Des)Marca:");

                 if ("1".equalsIgnoreCase(digitado)){
                     tabuleiro.abrir(xy.next(),xy.next());
                 }else if("2".equalsIgnoreCase(digitado)){
                     tabuleiro.marcar(xy.next(),xy.next());

                 }
             }
             System.out.print(tabuleiro);
            System.out.print("Voce Ganhou!");
         }catch(ExplosaoException e){
             System.out.print(tabuleiro);
             System.out.print("Voce perdeu!");
         }


    }


    private String capturaValorDigitado(String texto){
        System.out.print(texto);

        String digitado = entrada.nextLine();

        if ("Sair".equalsIgnoreCase(digitado)){
            throw new ExplosaoException();

        }
 return digitado;
    }
}
