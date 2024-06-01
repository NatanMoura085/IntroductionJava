package classes.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection  connection = FabricaConexao.getConexao();
         String SQL = "CREATE TABLE IF NOT EXISTS pessoas (\n" +
                 "    codigo SERIAL PRIMARY KEY,\n" +
                 "    nome VARCHAR(80) NOT NULL\n" +
                 ");";
        Statement stmt = connection.createStatement();

        stmt.execute(SQL);
        System.out.print("Criou A Tabela");
        connection.close();
    }
}
