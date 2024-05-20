package classes.excecao.pesonalizadoA;

public class StringVazia extends RuntimeException{
    private String StringVazia;

    StringVazia(String StringVazia){
        this.StringVazia = StringVazia;
    }


    public String getMessage() {
        return String.format("A String se Encontra Vazia" + StringVazia);
    }
}
