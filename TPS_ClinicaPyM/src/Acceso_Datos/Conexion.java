/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author linke
 */
public class Conexion {
/*private Connection connection =null; 
private ResultSet rs = null; 
private Statement s = null; 

//INICIA LA CONEXION
public void Con(){
if (connection != null){
    return;
    
}
String url = "jdbc:postgresql://localhost:5432/clinicaMyP";
String pass = "12345";
try {
    Class.forName("org.postgresql.Driver");
    connection = DriverManager.getConnection(url , "clinicaMyP" , pass);
    if (connection != null){
    System.out.print("Conectando a base de datos..");
    
}
    
            }catch(Exception e){
            System.out.println ("Problemas de conexion");
}


}*/
    
     private static String us = "root";
    private static String pas = "12345";
    private static String bd = "clinicaMyP";
    private static String url = "jdbc:postgresql://localhost:5432/"+bd;
    private static String usuario = "user";
    
Connection Conexion = null;
   
    public Connection conexion() {
      
        try {
            Connection conectar = DriverManager.getConnection(url, usuario, pas);
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos" + ex);
       
       
        
    }
         return Conexion;
  } 
} 