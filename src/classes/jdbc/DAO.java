package classes.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
   private Connection connection;

public int incluir(String sql,Object...atributos){
    try{
        PreparedStatement stmt = getConexao().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
        adicionarAtributos(stmt,atributos);

        if (stmt.executeUpdate() >0){
            ResultSet resultSet = stmt.getGeneratedKeys();

            if (resultSet.next()){
                return resultSet.getInt(1);
            }
        }
        return -1;

    }catch(SQLException e){
        throw new RuntimeException(e);
    }
}

public void close(){
    try{
        getConexao().close();
    }catch(SQLException e){

    }finally{
        connection = null;
    }
}
public void adicionarAtributos(PreparedStatement stmt,Object[] atributos) throws SQLException{
    int indice = 1;
    for (Object atributo:atributos){
        if (atributo instanceof String){
            stmt.setString(indice,(String) atributo);
        } else if (atributo instanceof Integer){
            stmt.setInt(indice,(Integer) atributo);
        }
    }
}
   public Connection getConexao(){
       try{
           if(connection !=null && !connection.isClosed()){
               return connection;
           }

       }catch(SQLException e){

       }

       connection = FabricaConexao.getConexao();
       return connection;
   }


}
