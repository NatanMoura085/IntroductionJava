package classes.streamsApi;

public class ClienteAposentadoria {
    final String nome;
    final double contribuicoes;
    final double tempoDeTrabalho;
    final int idade;

    ClienteAposentadoria(String nome,double contribuicoes,double tempoDeTrabalho,int idade){
        this.nome = nome;
        this.contribuicoes = contribuicoes;
        this.tempoDeTrabalho = tempoDeTrabalho;
        this.idade = idade;
    }
}
