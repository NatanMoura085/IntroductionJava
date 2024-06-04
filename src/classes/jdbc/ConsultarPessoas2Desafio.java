package classes.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsultarPessoas2Desafio {
    public static void main(String[] args) throws SQLException {
        Consumer<Object> print = System.out::println;
        List<String> pessoas =  new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe primeira letra");
        String nome = entrada.nextLine();
        System.out.print(nome);
        String SQL = "SELECT * FROM pessoas WHERE nome ~* ?";

        Connection connection = FabricaConexao.getConexao();
      PreparedStatement stmt = connection.prepareStatement(SQL);
       stmt.setString(1,nome);
       ResultSet resultado = stmt.executeQuery();
          while (resultado.next()){
              String nome2 = Arrays.toString(resultado.getString("nome" ).split("-",2) ) + "\n";
              pessoas.add(nome2);

          }


  pessoas.stream().forEach(print);

System.out.print("Deu certo" );
    connection.close();
        entrada.close();
    }
}
