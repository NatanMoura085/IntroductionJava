package classes.excecao.pesonalizadoA;

import classes.excecao.AlunoExcecao;

public class Validar {
    private Validar(){

    }


    static void  Validando(AlunoExcecao alunoExcecao){
        if (alunoExcecao.nome == null|| alunoExcecao.nome.trim().isEmpty()) throw new StringVazia("DEu Error");
        if (alunoExcecao.nota <0 || alunoExcecao.nota >10) throw new NumeroNegativoException("Deu ruim");
    }
}
