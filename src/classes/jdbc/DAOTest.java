package classes.jdbc;

public class DAOTest {
    public static void main(String[] args) {
        DAO dao = new DAO();
        String SQL = "INSERT INTO pessoas (nome) VALUES (?)";
       System.out.print( dao.incluir(SQL,"michael jackson"));

       dao.close();
    }
}
