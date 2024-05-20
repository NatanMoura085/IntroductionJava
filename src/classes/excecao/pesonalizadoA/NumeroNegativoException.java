package classes.excecao.pesonalizadoA;



public class NumeroNegativoException extends RuntimeException{
    private String nomeAtributo;

    NumeroNegativoException(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }


    public String getMessage() {
        return String.format("O Atributo Esta negativo"+ nomeAtributo);
    }
}
