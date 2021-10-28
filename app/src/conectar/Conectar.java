/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RICH
 */
public class Conectar {
    
    Connection cn;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bd","root", "");
            System.out.println("Conectado");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
         return cn;
    } 
    
}