package classes.composicao.ManyToManyRelationship;

public class CursoTest {
    public static void main(String[] args) {
    Aluno a1 = new Aluno("Natan");
    Aluno a2 = new Aluno("João");
    Aluno a3 = new Aluno("Matheus");


    Curso c1 = new Curso("Java para web");
    Curso c2 = new Curso("NodeTs para amadores");

         a1.adicionaCurso(c1);
         a2.adicionaCurso(c2);
         c1.adicionarAluno(a1);
         a3.adicionaCurso(c2);

           Curso cursoEncontrado = a1.obterNomeDoCurso("Java para web");

           if(cursoEncontrado !=null){
               System.out.println(cursoEncontrado.nome);
               System.out.println(cursoEncontrado.alunos);
           }

    }
}
