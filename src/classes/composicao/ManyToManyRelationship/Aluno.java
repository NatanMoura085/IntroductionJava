package classes.composicao.ManyToManyRelationship;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
     final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }
    void adicionaCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);

    }

    Curso obterNomeDoCurso(String nome){
        String procura =null;
        for (Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
              return  curso;
            }
        }
        return  null;
    }

     public  String toString(){
        return nome;
    }
}
