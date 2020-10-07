
package Acceso_Datos;

import Logica_Negocio.Empleados;
import Logica_Negocio.Paciente;
import java.sql.Connection;
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
                    pacien.setEncargado("encargado");
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
   
   
}
