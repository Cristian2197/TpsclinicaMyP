/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;

import Logica_Negocio.Paciente;
import Logica_Negocio.ConsultaVista;
import Logica_Negocio.Medicina;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ExpedienteBD {
    
    public ArrayList<Paciente> getPacientesExp(Connection conn){
        ArrayList<Paciente> paciLst = new ArrayList<>();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM paciente_expediente");
            if(rs != null){
                while(rs.next()){
                    Paciente paci = new Paciente();
                    paci.setId_paci(rs.getInt("id_paci"));
                    paci.setNombre(rs.getString("nombre"));
                    paci.setDireccion(rs.getString("direccion"));
                    paci.setDui(rs.getString("dui"));
                    paci.setTelefono(rs.getString("telefono"));
                    paci.setEncargado(rs.getString("encargado"));
                    paci.setTelefono_encargado(rs.getString("telefono_encargado"));
                    paciLst.add(paci);
                }
            }
            return paciLst;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<ConsultaVista> getConsulta(Connection conn, int id){
        ArrayList<ConsultaVista> consult = new ArrayList<>();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT c.id_consul AS id_consulta" +
            ", p.id_paci AS id_paciente" +
            ", (p.nombre::text || ' '::text) || p.apellido::text AS nombre_paciente" +
            ", t.id_tipo_consul AS id_tipo_consulta" +
            ", t.nombre AS tipo_consulta" +
            ", (e.nombre::text || ' '::text) || e.apellido::text AS nombre_doctor" +
            ", c.id_emp AS id_doctor" +
            ", c.fecha" +
            ", c.hora" +
            ", c.total" +
            ", c.estado" +
            ", c.diagnostico" +
            " FROM consultas c" +
            " JOIN pacientes p ON p.id_paci = c.id_paci" +
            " JOIN tipo_consulta t ON t.id_tipo_consul = c.id_tipo_consul" +
            " JOIN empleados e ON e.id_emp = c.id_emp" +
            " where p.id_paci = "+ id +
            " ORDER BY c.id_consul;");
            
            if(rs != null){
                while(rs.next()){
                    ConsultaVista cons = new ConsultaVista();
                    cons.setId_consulta(rs.getInt("id_consulta"));
                    cons.setId_paciente(rs.getInt("id_paciente"));
                    cons.setNombre_paciente(rs.getString("nombre_paciente"));
                    cons.setId_tipo_consulta(rs.getInt("id_tipo_consulta"));
                    cons.setTipo_consulta(rs.getString("tipo_consulta"));
                    cons.setNombre_doctor(rs.getString("nombre_doctor"));
                    cons.setId_doctor(rs.getInt("id_doctor"));
                    cons.setFecha(rs.getDate("fecha"));
                    cons.setHora(rs.getTime("hora"));
                    cons.setTotal(rs.getString("total"));
                    cons.setEstado(rs.getString("estado"));
                    cons.setDiagnostico(rs.getString("diagnostico"));
                    cons.setErrorSql("OK");
                    consult.add(cons);
                }
            }
            return consult;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Medicina> getMedicina(Connection conn, int id){
        ArrayList<Medicina> medicina = new ArrayList<>();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select m2.id_med, m2.nombre, rd.intervalo, rd.total  from medicina m2 " +
                                            "join receta_detalle rd on rd.id_med = m2.id_med " + 
                                            "join recetas r2 on r2.id_rece = rd.id_rece " +
                                            "where r2.id_consul = " + id);
            
            if(rs != null){
                while(rs.next()){
                    Medicina med = new Medicina();
                    med.setId_med(rs.getInt("id_med"));
                    med.setNombre(rs.getString("nombre"));
                    med.setErrorSql(rs.getString("intervalo"));
                    med.setStock(rs.getInt("total"));
                    medicina.add(med);
                }
            }
            return medicina;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return null;
        }
    }
}
