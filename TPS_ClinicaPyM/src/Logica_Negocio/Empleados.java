
package Logica_Negocio;

import Acceso_Datos.EmpleadosBD;
import java.sql.Connection;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class Empleados {
    private int id_emp;
    private int id_puesto;
    private String nombre;
    private String apellido;
    private String telefono;
    private String dui;
    private Date fecha_nacimiento;
    private String contraseña;
    private String usuario;
    private String errorSql;
    
    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public int getEdad() {  
        Calendar a = getCalendar(this.fecha_nacimiento);
        Calendar b = getCalendar(new Date());
        int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
        if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
            (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) &&   
            a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
            diff--;
        }
        return diff;
    }

    private Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }
    
    public int getId_emp() {
        return id_emp;
    }
    public String getErrorSql() {
        return errorSql;
    }
    public String getUsuario() {
        return usuario;
    }
    public int getId_puesto() {
        return id_puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDui() {
        return dui;
    }

    public Date getFechaNacimiento() {
        return this.fecha_nacimiento;
    }

    public String getContraseña() {
        return contraseña;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    
    public void setErrorSql(String errorSql){
        this.errorSql = errorSql;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fecha_nacimiento = fechaNacimiento;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
     // </editor-fold>
    
    public Empleados validarEmpleado(Connection con, Empleados emp){
        EmpleadosBD empleado = new EmpleadosBD();
        return empleado.validarEmpleado(con, emp);
    }
    
    public ArrayList<Empleados> GetAllEmpleadosEspe(Connection conn, int especialidad){
        EmpleadosBD empleado = new EmpleadosBD();
        return empleado.getEmpleadosXEspe(conn, especialidad);
    }
}
