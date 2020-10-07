
package Logica_Negocio;

import java.sql.Date;
import Acceso_Datos.ConsultaBD;
import java.sql.Connection;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class ConsultaVista {
    private int id_consulta;
    private int id_paciente;
    private String nombre_paciente;
    private int id_tipo_consulta;
    private String tipo_consulta;
    private String nombre_doctor;
    private int id_doctor;
    private Date fecha;
    private Time hora; 
    private String total;
    private String estado;
    private String diagnostico ;
    private String errorSql;
    
    // <editor-fold defaultstate="collapsed" desc="Getters"> 

    public int getId_consulta() {
        return id_consulta;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public int getId_tipo_consulta() {
        return id_tipo_consulta;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public String getNombre_doctor() {
        return nombre_doctor;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
       
        return this.hora;
    }

    public String getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }
    
    public String getEstadoValue(){
        String estadoR = "";
        switch (this.estado) {
            case "P":
                estadoR = "Pendiente";
                break;
            case "C":
                estadoR = "Cancelado";
                break;
            case "L":
                estadoR = "Local";
                break;
            case "R":
                estadoR = "Realizado";
                break;
            default:
                break;
        }
        return estadoR;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getErrorSql() {
        return errorSql;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public void setId_tipo_consulta(int id_tipo_consulta) {
        this.id_tipo_consulta = id_tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public void setNombre_doctor(String nombre_doctor) {
        this.nombre_doctor = nombre_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setErrorSql(String errorSql) {
        this.errorSql = errorSql;
    }
    // </editor-fold>
    
    public ArrayList<ConsultaVista> getConsxPues(Connection con, int idPuesto, int idEmp){
        ConsultaBD consulta = new ConsultaBD();
        return consulta.getConsultasxPuesto(con, idPuesto, idEmp);
    }
    
    public ArrayList<ConsultaVista> getAllConsultas(Connection con){
        ConsultaBD consulta = new ConsultaBD();
        return consulta.getAllConsultas(con);
    }
    
}
