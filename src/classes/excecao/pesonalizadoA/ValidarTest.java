package classes.excecao.pesonalizadoA;

import classes.excecao.AlunoExcecao;

public class ValidarTest {
    public static void main(String[] args) {

        try{
        AlunoExcecao a1 = new AlunoExcecao("  ",8);
        Validar.Validando(a1);

        }catch(StringVazia | NumeroNegativoException e){
         System.out.print(e.getMessage());

        }
        System.out.print( "\n" + "Fim!!!");
    }
}
