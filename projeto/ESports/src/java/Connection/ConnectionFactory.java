/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Andreas
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/ESports";
    private static final String USER = "postgres";
    private static final String PASS = "usuario";
    
    //Configuração PC - Linux Andreas
    //private static final String DRIVER = "com.mysql.jdbc.Driver";
    //private static final String URL = "jdbc:mysql://localhost:3306/faz_role";
    //private static final String USER = "root";
    //private static final String PASS = "usuario";

    //Configuração PC IFES
    //private static final String DRIVER = "org.postgresql.Driver";
    //private static final String URL = "jdbc:postgresql://localhost:5432/faz_role";
    //private static final String USER = "postgres";
    //private static final String PASS = "serra";
    
    public static Connection getConnection()
    {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException |SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeconnection(Connection con)
    {
        if(con != null)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex);
            }
        }
    }
    
    public static void closeconnection(Connection con, PreparedStatement stmt)
    {
        if(stmt != null)
        {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex);
            }
        }
        closeconnection(con);
    }
    
    public static void closeconnection(Connection con, PreparedStatement stmt, ResultSet rs)
    {
        if(rs != null)
        {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex);
            }
        }
        closeconnection(con, stmt);
    }
}