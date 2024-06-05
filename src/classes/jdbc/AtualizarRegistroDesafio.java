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
        List<String> listNomes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Connection connection = FabricaConexao.getConexao();
        String SQl1 = "SELECT * FROM pessoas WHERE nome ILIKE ?";
        String SQL = "UPDATE pessoas SET nome = ? WHERE codigo = ? ";

        System.out.print("informe o nome");
        String nome = entrada.nextLine();
        System.out.print("informe o codigo");
        String codigo = entrada.nextLine();
        System.out.print("Informe novo nome");
        String NovoNome = entrada.nextLine();

        PreparedStatement stmt1 = connection.prepareStatement(SQl1);
        stmt1.setString(1,"%" + nome + "%" );
        ResultSet resultado =  stmt1.executeQuery();
        String nom12 = null;

        while(resultado.next()){
            nom12 = resultado.getString("nome");
            String nom1 = resultado.getString("nome");
            listNomes.add(nom1);
        }

        PreparedStatement stmt2 = connection.prepareStatement(SQL);
        stmt2.setString(1,nom12 = NovoNome);
        stmt2.setInt(2, Integer.parseInt(codigo));
        ResultSet resultado2 = stmt2.executeQuery();
        while(resultado2.next()){
            int codigoNovo = Integer.parseInt(resultado2.getString("codigo"));
            pessoas.add(new Pessoa(codigoNovo,nom12));
        }


             listNomes.stream().forEach(print);
             pessoas.stream().forEach(print);
        entrada.close();
        connection.close();
        stmt1.close();
        stmt2.close();
    }
}
