package classes.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class AtualizarRegistroDesafio {
    public static void main(String[] args)  throws SQLException {
        Consumer<Object> print = System.out::println;
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Connection connection = FabricaConexao.getConexao();
        String SQL = "UPDATE pessoas SET ? WHERE codigo = ? ";
        String SQl1 = "SELECT * FROM pessoas WHERE nome ~* ?";

        System.out.print("Informe nome");
        String nome = entrada.nextLine();
        System.out.print("Informe Codigo");
        int codigo = entrada.nextInt();
        PreparedStatement stm1 = connection.prepareStatement(SQl1);
         stm1.setString(1,nome);
         ResultSet resultSet1 = stm1.executeQuery();

         System.out.print(Arrays.toString(resultSet1.getString("nome").toCharArray()));

        PreparedStatement stmt = connection.prepareStatement(SQL);
         stmt.setString(1,nome);
         stmt.setInt(2,codigo);
         ResultSet resultdo = stmt.executeQuery();

          while (resultdo.next()){
              String nome2 = resultdo.getString("nome");
              int codigo2 = resultdo.getInt("codigo");
              pessoas.add(new Pessoa(codigo2,nome2));
          }


          pessoas.stream().forEach(print);
        entrada.close();
          stmt.close();
          connection.close();
    }
}
