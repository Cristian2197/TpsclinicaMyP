
package Acceso_Datos;

import Logica_Negocio.ConsultaVista;
import Logica_Negocio.Consultas;
import java.sql.CallableStatement;
import java.sql.Connection;
import static java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;
import java.sql.Date;
import static java.sql.DriverManager.println;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultaBD {
    
    public ArrayList<ConsultaVista> getConsultasxPuesto(Connection conn, int id_puesto, int id_emp){
        ConsultaVista cons;
        ArrayList<ConsultaVista> todasC = new ArrayList<>();
        try 
        {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(
                "SELECT * FROM consulta_puesto(" + id_puesto + "," + id_emp + ");"
            );
            if(rs != null){
                while(rs.next()){
                    cons = new ConsultaVista();
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
                    todasC.add(cons);
                }
            }

        } 
        catch (SQLException e) { 
            cons = new ConsultaVista();
            cons.setErrorSql(e.getMessage());
            //todasC.add(cons);
            return null;
        }
        
        return todasC;
    }
    
    public boolean insertarConsulta(Consultas consulta, Connection con)
    {
       try {
            CallableStatement cs = con.prepareCall("CALL public.agreconsulta(?,?,?,?,?,?,?,?);");
            cs.setInt(1, consulta.getId_paci());
            cs.setInt(2, consulta.getId_emp());
            cs.setInt(3, consulta.getId_tipo_consul());
            cs.setDate(4, consulta.getFecha());
            cs.setTime(5, consulta.getHora());
            cs.setDouble(6, consulta.getTotal());
            cs.setString(7, consulta.getEstadoValue());
            cs.setString(8, consulta.getDiagnostico());
            cs.execute();
            return true;
        } catch (SQLException e) {
            println(e.toString());
            return false;
        }
    }
    
    public ArrayList<ConsultaVista> getAllConsultas(Connection conn){
        ConsultaVista cons;
        ArrayList<ConsultaVista> todasC = new ArrayList<>();
        try 
        {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(
                "select * from consultavista order by id_consulta DESC;"
            );
            if(rs != null){
                while(rs.next()){
                    cons = new ConsultaVista();
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
                    todasC.add(cons);
                }
            }

        } 
        catch (SQLException e) { 
            cons = new ConsultaVista();
            cons.setErrorSql(e.getMessage());
            //todasC.add(cons);
            return null;
        }
        
        return todasC;
    }
     
    public boolean modificarConsulta(Consultas consu, Connection conn){
        
        String sql = "UPDATE public.consultas SET "
                + "id_paci="+consu.getId_paci()+", "
                + "id_emp="+consu.getId_emp()+", "
                + "id_tipo_consul="+consu.getId_tipo_consul()+", "
                + "fecha='"+consu.getFecha()+"', "
                + "hora='"+consu.getHora()+"', "
                + "total="+consu.getTotal()+", "
                + "estado='"+consu.getEstadoChar()+"', "
                + "diagnostico='"+consu.getDiagnostico()+"' "
                + "WHERE id_consul="+consu.getId_consul()+";";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            return true;
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return false;
        }
    }
}
