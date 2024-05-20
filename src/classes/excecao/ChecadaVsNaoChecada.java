package classes.excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try{

        }catch(RuntimeException e){
            System.out.print(e.getMessage());
        }
    geraError();

    try{
    geraError2();

    }catch(Throwable e){
        System.out.print("aconteceu um ero" + e.getMessage());

    }
    }

    static void geraError(){
        throw  new RuntimeException("Acorreu um erro");
    }

    static void geraError2() throws Exception{
        throw new Exception("Tabem deu error");
    }
}
