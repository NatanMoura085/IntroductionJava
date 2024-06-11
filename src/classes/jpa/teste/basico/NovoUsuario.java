package classes.jpa.teste.basico;

import classes.jpa.modelo.base.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {
        System.out.println("Criando EntityManagerFactory");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercecios-jpa");

        System.out.println("Criando EntityManager");
        EntityManager em = emf.createEntityManager();

        System.out.println("Criando novo usuário");
        Usuario novoUsuario = new Usuario("Natan", "mouranatan@gmail.com");


        System.out.println("Iniciando transação");
        em.getTransaction().begin();

        System.out.println("Persistindo usuário");
        em.persist(novoUsuario);

        System.out.println("Comitando transação");
        em.getTransaction().commit();

        System.out.println("Fechando EntityManager");
        em.close();

        System.out.println("Fechando EntityManagerFactory");
        emf.close();

        System.out.println("Finalizado");
    }
}