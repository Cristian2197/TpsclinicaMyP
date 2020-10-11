/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;

import Logica_Negocio.Especialidad;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EspecialidadBD {
    
    public void ModificarEspecialidad(Connection conn, Especialidad esp){
        String sql="UPDATE public.especialidad "
                + "SET "
                + "id_tipo_consul="+esp.getId_tipo_consul()+", "
                + "id_emp="+esp.getId_emp()+" "
                + "WHERE id_espe="+esp.getId_espe()+";";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void InsertarEspecildad(Connection conn, Especialidad esp){
        String sql="INSERT INTO public.especialidad (id_tipo_consul, id_emp) VALUES("
                + esp.getId_tipo_consul() + ", "
                + esp.getId_emp()+");";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void EliminarEspecialidad(Connection conn, int id){
        String sql="DELETE FROM public.especialidad WHERE id_espe="+id+";";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
