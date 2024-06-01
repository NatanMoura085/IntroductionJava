package classes.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultaPessoas1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        List<Pessoa> pessoas = new ArrayList<>();
        String SQL = "SELECT * FROM pessoas";

        Statement stmt = connection.createStatement();
        ResultSet resultado =  stmt.executeQuery(SQL);
        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo,nome));

        }

        for (Pessoa p:pessoas){
            System.out.print(p.getCodigo()  + "\n" + p.getNome() + "\n");
        }


        connection.close();
    }
}
