package classes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
  public static Connection getConexao(){
      try{
          String URL = "jdbc:postgresql://localhost:5432/curso_java";
          String USUARIO = "postgres";
          String SENHA = "root";
          return DriverManager.getConnection(URL,USUARIO,SENHA);
      }catch(SQLException e){
          throw new RuntimeException(e);
      }
  }
}
