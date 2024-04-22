package fundamentos;

public class DesafioOperadoresAritmeticos {

    public static void main(String[] args) {
       double SuperiorA = Math.pow(6*(3+2),2);
       double denoA = (3*2);
       double calA = SuperiorA /denoA;
       double SuperiorB = (1-5) * (2-7);
       double denoB = 2;
       double calcB = Math.pow(SuperiorB / denoB,2);
       double superior = Math.pow(calA - calcB,3);
       double inferior = Math.pow(10,3);
       double resultado = superior / inferior;

       System.out.println(resultado);
    }
}
