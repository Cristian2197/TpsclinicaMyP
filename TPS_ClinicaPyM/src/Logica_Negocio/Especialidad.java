
package Logica_Negocio;

import Acceso_Datos.EspecialidadBD;
import java.sql.Connection;

public class Especialidad {
    private int id_espe;
    private int id_tipo_consul;
    private int id_emp;
    private String ErrorSql;

    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public int getId_espe() {
        return id_espe;
    }

    public int getId_tipo_consul() {
        return id_tipo_consul;
    }

    public int getId_emp() {
        return id_emp;
    }

    public String getErrorSql() {
        return ErrorSql;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    public void setId_espe(int id_espe) {
        this.id_espe = id_espe;
    }

    public void setId_tipo_consul(int id_tipo_consul) {
        this.id_tipo_consul = id_tipo_consul;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public void setErrorSql(String ErrorSql) {
        this.ErrorSql = ErrorSql;
    }
    
    // </editor-fold> 
    
    public void InsertarEspecialidad(Connection conn){
        EspecialidadBD espBd = new EspecialidadBD();
        espBd.InsertarEspecildad(conn, this);
    }
          
    public void ModificarEspecialidad(Connection conn){
        EspecialidadBD espBd = new EspecialidadBD();
        espBd.ModificarEspecialidad(conn, this);
    }
    
    public void EliminarEspecialidad(Connection conn, int id){
        EspecialidadBD espBd = new EspecialidadBD();
        espBd.EliminarEspecialidad(conn, id);
    }
}
