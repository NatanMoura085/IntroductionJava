package classes.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args)throws SQLException{
        Scanner entrada = new Scanner(System.in);
        Connection connection = FabricaConexao.getConexao();
        String SQL = "DELETE FROM pessoas WHERE codigo = ?";

        System.out.print("Informe o codigo");
        int codigo = entrada.nextInt();

        PreparedStatement stmt = connection.prepareStatement(SQL);
        stmt.setInt(1,codigo);
        int contador = stmt.executeUpdate();

        if (contador > 0){
            System.out.print("Linhas Afetadas "+ contador);

        }else{
            System.out.print("Pessoaa Nao excluirda");
        }

        entrada.close();
        stmt.close();
        connection.close();
    }
}
