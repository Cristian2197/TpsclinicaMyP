
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

public class Conexion {
    private Process proceso;
    private ProcessBuilder constructor;
    
    private String users[] = {"invitado", "doctor", "secretario", "sistemas"};
    private String passwords[] = {"12345", "12345", "54321", "00000"};
    //private static String us = "root";
    //private static String pas = "00000";
    private static String bd = "clinicaMyP";
    private static String url = "jdbc:postgresql://localhost:5432/"+bd;
    //private static String usuario = "sistemas";
    private String usuario;
    private String password;
    Connection Conexion = null;
   
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
        try{
            File pgdump= new File("C:/Program Files/PostgreSQL/9.4/bin\\pg_dump.exe");
            if(pgdump.exists()){
                if(!path.equalsIgnoreCase("")) {
                    constructor = new ProcessBuilder(
                            "C:/Program Files/PostgreSQL/9.4/bin\\pg_dump.exe", "--verbose", "--format", ".sql", "-f", path);
                } else {                             
                    constructor = new ProcessBuilder("C:/Program Files/PostgreSQL/9.4/bin\\pg_dump.exe", "--verbose", "--inserts", "--column-inserts", "-f", path);
                    System.out.println("ERROR");
                }
                constructor.environment().put("PGHOST", "localhost");
                constructor.environment().put("PGPORT", "5432");
                constructor.environment().put("PGUSER", this.usuario);
                constructor.environment().put("PGPASSWORD", this.password);
                constructor.environment().put("PGDATABASE", bd);
                constructor.redirectErrorStream(true);
                proceso= constructor.start();
                //escribirProcess(proceso);
                System.out.println("terminado backup " + path);
                hecho=true;
            }else{
                if(!path.equalsIgnoreCase("")) {
                    constructor = new ProcessBuilder("/opt/PostgreSQL/9.4/bin/pg_dump", "--verbose", "--format", "sql", "-f", path);
                } else {                             
                    constructor = new ProcessBuilder("/opt/PostgreSQL/9.4/bin/pg_dump", "--verbose", "--inserts", "--column-inserts", "-f", path);
                    System.out.println("ERROR");
                }
                constructor.environment().put("PGHOST", "localhost");
                constructor.environment().put("PGPORT", "5432");
                constructor.environment().put("PGUSER", this.usuario);
                constructor.environment().put("PGPASSWORD", this.password);
                constructor.environment().put("PGDATABASE", bd);
                constructor.redirectErrorStream(true);
                proceso= constructor.start();
                //escribirProcess(proceso);
                System.out.println("terminado backup " + path);
                hecho=true;
            }
        }catch(Exception ex){
            System.err.println(ex.getMessage()+ "Error de backup");
            hecho=false;
        }
        return hecho;
    }
    
    public void closeConexion() throws SQLException{
        this.Conexion.close();
    }
} 