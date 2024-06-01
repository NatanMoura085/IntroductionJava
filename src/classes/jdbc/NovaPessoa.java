package classes.jdbc;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args)throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o Nome");
        System.out.print("\n");
        String nome = entrada.nextLine();

        String SQL = "INSERT INTO pessoas(nome) VALUES(?)";
        PreparedStatement stmt = connection.prepareStatement(SQL);
        stmt.setString(1,nome);
         stmt.execute();
         System.out.print("Criou uma Pessoa");
        entrada.close();

    }
}
