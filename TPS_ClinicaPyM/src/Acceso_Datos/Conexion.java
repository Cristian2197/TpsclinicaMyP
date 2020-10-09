
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
import java.io.File;
import java.io.IOException;

public class Conexion {
   
    private String users[] = {"invitado", "doctor", "secretario", "sistemas"};
    private String passwords[] = {"12345", "12345", "54321", "00000"};
    //private static String us = "root";
    //private static String pas = "00000";
    private String bd = "clinicaMyP";
    private String url = "jdbc:postgresql://localhost:5432/"+bd;
    //private static String usuario = "sistemas";
    private String usuario;
    private String password;
    Connection Conexion = null;
    Process p;
    ProcessBuilder pb;
    Runtime r;
   
    public Conexion( int tipo) {
      
        try {
            this.usuario = users[tipo];
            this.password = passwords[tipo];
            this.Conexion = DriverManager.getConnection(url, users[tipo], passwords[tipo]);
            //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos" + ex);
        }    
    } 
    
    public Connection getConexion(){
        return this.Conexion;
    }
        
    public boolean Backup(String path){
        boolean hecho=false;
        r = Runtime.getRuntime();   
        try{
            r = Runtime.getRuntime();        
            pb =  new ProcessBuilder("C:\\Program Files\\PostgreSQL\\11\\bin\\pg_dump.exe",
                    "--verbose", "--format", "custom", "-f", path);
            
            pb.environment().put("PGHOST", "localhost");
            pb.environment().put("PGPORT", "5432");
            pb.environment().put("PGUSER", usuario);
            pb.environment().put("PGPASSWORD", password);
            pb.environment().put("PGDATABASE", bd);
            pb.redirectErrorStream(true);
            p = pb.start();     
            hecho=true;
        }catch(Exception ex){
            System.err.println(ex.getMessage()+ "Error de backup");
            hecho=false;
        }
        return hecho;
    }
    public boolean Restore(String path) throws IOException{
        boolean hecho = false;
        try {
            String comando = "pg_restore -i -h localhost -p 5432 -U " + this.usuario + " -W " + this.password + " -d " + bd + " -v \" " + path + " ";
            Runtime.getRuntime ().exec ( comando );
            hecho = true;
        } catch (Exception ex) {
            System.err.println(ex.getMessage()+ "Error de backup");
            hecho = false;
        }
       return hecho;
    }
    
    public void closeConexion() throws SQLException{
        this.Conexion.close();
    }
} 