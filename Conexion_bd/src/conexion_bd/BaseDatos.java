/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dario
 */
public class BaseDatos {
    private Connection conn;
    public ResultSet rs;
            
    public BaseDatos(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/avanzada", "root", "");
            
        }catch(ClassNotFoundException e){
            
        }catch(SQLException m){
            
        }
    }
    
    public void datos(String nombre){
        try{
            PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario");
            rs = st.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString("nombre"));               
            }
            
        }catch(SQLException n){
            
        }
    }
}
