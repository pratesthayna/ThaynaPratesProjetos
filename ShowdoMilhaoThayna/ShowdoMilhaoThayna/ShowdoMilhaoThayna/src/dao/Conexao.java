package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

    private static final String banco = 
            "jdbc:postgresql://localhost:5432/showdomilhaothayna";

    private static final String driver = 
            "org.postgresql.Driver";

    private static final String usuario = "postgres";
    private static final String senha = "postgres";  

    private static Connection c = null;
    
    public static Connection getConexao(){

        if (c == null){
            try {
   
                Class.forName(driver);
   
                c = 
                DriverManager.getConnection(
                        banco, usuario, senha);
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver não encontrado!");
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar: "+
                        ex.getMessage());
            }
        }
        return c;
    }

    public static PreparedStatement getPreparedStatement(String sql){
        
        if (c == null){
      
            c = getConexao();
        }
        try {
     
            return c.prepareStatement(sql);
        } catch (SQLException e){
            System.out.println("Erro de sql: "+
                    e.getMessage());
        }
        return null;
    }
    
}
