package classes.excecao;

public class Basico {
    public static void main(String[] args) {
        AlunoExcecao a1 = null;

        try{

        imprimir(a1);
        }   catch(Exception excecao){
            System.out.print("acont" + "\n");
        }

        try{
        System.out.print(7 / 0);

        }   catch(Exception e){
           System.out.print("Acorreu um Error" + e.getMessage() +"\n");

        }
      System.out.print("Fim!!");

    }
    public  static void imprimir(AlunoExcecao a1){
        System.out.print(a1.nome);
    }
}
