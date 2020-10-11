/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_Negocio;

import java.sql.Connection;
import java.util.ArrayList;

import Acceso_Datos.EmpleadosVistaBD;
import java.sql.Date;
import java.sql.SQLException;

public class EmpleadosVista {
    private String nombre;
    private String dui;
    private int id_emp;
    private int id_puesto;
    private String telefono;
    private String usuario;
    private String puesto;
    private Date fecha_nacimiento;
    private String nombreuno;
    private String apellido;
    private int id_especialidad;
    private String ErrorSql;
    private String contraseña;
    private int id_espe;

    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public String getNombre() {
        return nombre;
    }

    public int getId_espe() {
        return id_espe;
    }
    public String getContraseña() {
        return contraseña;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    
    
    public String getNombreuno() {
        return nombreuno;
    }

    public String getApellido() {
        return apellido;
    }
    
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public String getDui() {
        return dui;
    }

    public int getId_emp() {
        return id_emp;
    }

    public int getId_puesto() {
        return id_puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getErrorSql() {
        return ErrorSql;
    }
     // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_espe(int id_espe) {
        this.id_espe = id_espe;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }
    public void setNombreuno(String nombreuno) {
        this.nombreuno = nombreuno;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setDui(String dui) {
        this.dui = dui;
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

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setErrorSql(String ErrorSql) {
        this.ErrorSql = ErrorSql;
    }
 // </editor-fold> 
    
    public ArrayList<EmpleadosVista> getEmpleados(Connection conn) throws SQLException{
        EmpleadosVistaBD empBD = new EmpleadosVistaBD();
        return empBD.GetEmpleado(conn);
    }
}
