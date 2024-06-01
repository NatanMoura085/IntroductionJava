package classes.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Connection connection = FabricaConexao.getConexao();
        List<String> pessoas = new ArrayList<>();

        System.out.print("Informe primeira letra");
        String nome = entrada.nextLine();

         String SQL = "SELECT * FROM pessoas WHERE nome LIKE '?%' ";
        Statement stmt = connection.createStatement();
        ResultSet resultado =  stmt.executeQuery(SQL);









System.out.print("Deu certo" + resultado.next());
    connection.close();
        entrada.close();
    }
}
