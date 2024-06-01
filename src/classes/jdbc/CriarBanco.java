package classes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        String URl = "jdbc:postgresql://localhost:5432/postgres";
        String Usuario = "postgres";
        String Senha = "root";

        Connection conexao = DriverManager.getConnection(URl,Usuario,Senha);

        Statement stmt = conexao.createStatement();

        stmt.execute("CREATE DATABASE curso_java");
        System.out.print("Criou o Banco");

        conexao.close();
    }
}
