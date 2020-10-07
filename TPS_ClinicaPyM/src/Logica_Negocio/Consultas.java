
package Logica_Negocio;

import java.sql.Date;
import Acceso_Datos.ConsultaBD;
import java.sql.Connection;
import java.sql.Time;
import java.util.ArrayList;


public class Consultas {
    private int id_consul;
    private int id_paci;
    private int id_emp;
    private int id_tipo_consul;
    private Date fecha;
    private Time hora;
    private double total;
    private String estado;
    private String diagnostico;
    
    private String errorSql;
    
    
    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public int getId_consul() {
        return id_consul;
    }

    public int getId_paci() {
        return id_paci;
    }

    public int getId_emp() {
        return id_emp;
    }

    public int getId_tipo_consul() {
        return id_tipo_consul;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public double getTotal() {
        return total;
    }
    public String getEstadoValue() {
        String retorno = String.valueOf(this.estado);
        return retorno;
    }
    public String getEstado() {
        String estado;
        if(String.valueOf(this.estado).equals("P")){
            estado = "Pendiente";
        }else if(String.valueOf(this.estado).equals("C")){
            estado = "Cancelado";
        }else{
            estado = "Realizado";
        }
        return estado;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getErrorSql() {
        return errorSql;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    
      public void setId_consul(int id_consul) {
        this.id_consul = id_consul;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paci = id_paciente;
    }

    public void setId_emp(int id_doc) {
        this.id_emp = id_doc;
    }

    public void setId_tipoConsul(int id_tipoConsul) {
        this.id_tipo_consul = id_tipoConsul;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setTotal(double total) {
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
    
    public boolean AddConsulta(Consultas consu, Connection conn){
        ConsultaBD consulta = new ConsultaBD();
        return consulta.insertarConsulta(consu, conn);
    }
}
