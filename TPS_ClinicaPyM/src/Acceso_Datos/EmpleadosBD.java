
package Acceso_Datos;

import java.sql.Connection;
import Logica_Negocio.Empleados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpleadosBD {
   
    public Empleados validarEmpleado(Connection con, Empleados emp){
        Empleados empleado = new Empleados();
        try 
        {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(
                "SELECT * FROM validarusuario('"+emp.getUsuario()+"','"+emp.getContraseña()+"');"
            );
            if(rs != null){
                while(rs.next()){
                    empleado.setId_emp(rs.getInt("id_emp"));
                    empleado.setApellido(rs.getString("apellido"));
                    empleado.setNombre(rs.getString("nombre"));
                    empleado.setContraseña("No se puede acceder a esta información");
                    empleado.setId_puesto(rs.getInt("id_puesto"));
                    empleado.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                    empleado.setDui(rs.getString("dui"));
                    empleado.setUsuario("No se puede acceder a esta información");
                    empleado.setTelefono(rs.getString("telefono"));
                    empleado.setErrorSql("OK");
                }
            }
            
        } 
        catch (SQLException e) { 
            empleado = new Empleados();
            empleado.setErrorSql(e.getMessage());
            return empleado;
        }
        return empleado;
    }
    
    public ArrayList<Empleados> getEmpleadosXEspe(Connection con, int especialidad){
        ArrayList<Empleados> empleados = new ArrayList<>();
        try 
        {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(
                "select e2.id_emp, e2.nombre, e2.apellido from empleados e2 " +
                "join especialidad e3 on e2.id_emp = e3.id_emp " +
                "where id_puesto = 1 and e3.id_tipo_consul = "+especialidad+" " +
                "order by id_emp;"
            );
            if(rs != null){
                while(rs.next()){
                    Empleados empleado = new Empleados();
                    empleado.setId_emp(rs.getInt("id_emp"));
                    empleado.setApellido(rs.getString("apellido"));
                    empleado.setNombre(rs.getString("nombre"));
                    empleado.setErrorSql("OK");
                    empleados.add(empleado);
                }
            }
            
        } 
        catch (SQLException e) { 
            Empleados empleado = new Empleados();
            empleado = new Empleados();
            empleado.setErrorSql(e.getMessage());
            empleados.add(empleado);
        }
        return empleados;
    }
}
