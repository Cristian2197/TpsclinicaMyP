
package Logica_Negocio;

import java.sql.Connection;
import Acceso_Datos.PacientesBD;
import java.util.ArrayList;
import java.util.Date;

public class Paciente {
    private int id_paci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private char estado_civil;
    private char sexo;
    private String encargado;
    private String telefono_encargado;
    private String dui;
    private Date fecha_nacimiento;
    private String foto;
    
    private String errorSql;
    
    

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public String getErrorSql() {   
        return errorSql;
    }
    
    public int getId_paci() {
        return id_paci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public char getEstado_civil() {
        return estado_civil;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEncargado() {
        return encargado;
    }

    public String getTelefono_encargado() {
        return telefono_encargado;
    }

    public String getDui() {
        return dui;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getFoto() {
        return foto;
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setErrorSql(String errorSql) {
        this.errorSql = errorSql;
    }
    public void setId_paci(int id_paci){    
        this.id_paci = id_paci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstado_civil(char estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public void setTelefono_encargado(String telefono_encargado) {
        this.telefono_encargado = telefono_encargado;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
       // </editor-fold>
    
    public ArrayList<Paciente> GetAllPacientes(Connection conn) {
        PacientesBD paci = new PacientesBD();
        return paci.getAllPacientes(conn);
    }
    
    
    
}
