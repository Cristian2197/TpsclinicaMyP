/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;

import Logica_Negocio.EmpleadosVista;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpleadosVistaBD {
    
    public ArrayList<EmpleadosVista> GetEmpleado(Connection conn) throws SQLException{
        ArrayList<EmpleadosVista> empledosList = new ArrayList<>();
       
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(
            "SELECT * FROM public.empleadosvista;"
        );
        if(rs != null){
            while(rs.next()){
                EmpleadosVista empleado = new EmpleadosVista();
                empleado.setId_emp(rs.getInt("id_emp"));
                empleado.setId_puesto(rs.getInt("id_puesto"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setDui(rs.getString("dui"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setUsuario(rs.getString("usuario"));
                empleado.setPuesto(rs.getString("puesto"));
                empleado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                empleado.setNombreuno(rs.getString("nombreuno"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setId_especialidad(rs.getInt("id_especialidad"));
                empleado.setContraseña(rs.getString("contraseña"));
                empleado.setId_espe(rs.getInt("id_espe"));
                empleado.setErrorSql("OK");
                empledosList.add(empleado);
        }
            
        } 
        return empledosList;
    }
}
