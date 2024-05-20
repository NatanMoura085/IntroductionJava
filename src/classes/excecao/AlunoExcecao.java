package classes.excecao;

public class AlunoExcecao {
   public final String nome;
    public final double nota;

     public AlunoExcecao(String nome, double nota){
        this.nome = nome;
        this.nota = nota;

    }

    public String toString(){
        return nome + " " +  "Sua nota é:" + nota + "\n";
    }
}
