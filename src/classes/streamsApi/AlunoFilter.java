package classes.streamsApi;

public class AlunoFilter {
    final String nome;
    final double nota;

    AlunoFilter(String nome,double nota){
        this.nome = nome;
        this.nota = nota;

    }

    public String toString(){
        return nome + " " +  "Sua nota é:" + nota + "\n";
    }
}
