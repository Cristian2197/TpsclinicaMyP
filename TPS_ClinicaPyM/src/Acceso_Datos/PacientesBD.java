
package Acceso_Datos;

import Logica_Negocio.Paciente;
import java.sql.Connection;
import static java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PacientesBD {
    
   public ArrayList<Paciente> getAllPacientes(Connection con){
        Paciente pacien;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try 
        {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(
                "select * from pacientes order by id_paci;"
            );
            if(rs != null){
                while(rs.next()){
                    pacien = new Paciente();
                    pacien.setId_paci(rs.getInt("id_paci"));
                    pacien.setNombre(rs.getString("nombre"));
                    pacien.setApellido(rs.getString("apellido"));
                    pacien.setDireccion(rs.getString("direccion"));
                    pacien.setTelefono(rs.getString("telefono"));
                    pacien.setEstado_civil(rs.getString("estado_civil").charAt(0));
                    pacien.setSexo(rs.getString("sexo").charAt(0));
                    pacien.setEncargado(rs.getString("encargado"));
                    pacien.setTelefono_encargado(rs.getString("telefono_encargado"));
                    pacien.setDui(rs.getString("dui"));
                    pacien.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                    pacien.setFoto(rs.getString("foto"));
                    pacien.setErrorSql("OK");
                    pacientes.add(pacien);
                }
            }
            
        } 
        catch (SQLException e) { 
            pacien = new Paciente();
            pacien.setErrorSql(e.getMessage());
            pacientes.add(pacien);
            return pacientes;
        }
        return pacientes;
    }
   
   public void InsertarPaciente(Paciente paci, Connection conn){
       //Paciente paci = new Paciente 
       
        String sql="INSERT INTO public.pacientes (nombre, apellido, direccion, telefono, estado_civil, sexo, encargado, telefono_encargado, dui, fecha_nacimiento, foto) "
                + "VALUES ('"
                +paci.getNombre()+ "','"
                +paci.getApellido()+ "','"
                +paci.getDireccion()+ "','"
                +paci.getTelefono()+"','"
                +paci.getEstado_civil()+"', '"
                +paci.getSexo()+"', '"
                +paci.getEncargado()+"','"
                +paci.getTelefono_encargado()+"','"
                +paci.getDui()+"', '"
                +paci.getFecha_nacimiento()+"','"
                +paci.getFoto()+"');";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
        } 
        catch (SQLException e) {  }
        
   }
   
   public void ModificarPaciente(Paciente paci, Connection conn){
       String sql="UPDATE public.pacientes SET " +
            "nombre='" + paci.getNombre() + "'," +
            "apellido='" + paci.getApellido() + "'," +
            "direccion='" + paci.getDireccion() + "'," +
            "telefono='" + paci.getTelefono() + "'," +
            "estado_civil='" + paci.getEstado_civil() + "'," +
            "sexo='" + paci.getSexo() + "'," +
            "encargado='" + paci.getEncargado() + "'," +
            "telefono_encargado='"+paci.getTelefono_encargado()+"'," +
            "dui='"+paci.getDui()+"'," +
            "fecha_nacimiento='"+paci.getFecha_nacimiento()+"'," +
            "foto='" + paci.getFoto() + "' "+
            "WHERE id_paci=" + paci.getId_paci() + " ;";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
        } 
        catch (SQLException e) {  
        
        }
   }
}
