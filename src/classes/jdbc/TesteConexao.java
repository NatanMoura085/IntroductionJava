package classes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:postgresql://localhost:5432/postgres" ;
        String Usuario = "postgres";
        String senha = "root";

     Connection conexao = DriverManager.getConnection(URL,Usuario,senha);
     System.out.print("Deu certo ");

     conexao.close();

    }
}
