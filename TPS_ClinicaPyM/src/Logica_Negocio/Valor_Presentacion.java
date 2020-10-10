
package Logica_Negocio;

import Acceso_Datos.Valor_PresentacionBD;
import java.sql.Connection;
import java.util.ArrayList;

public class Valor_Presentacion {
    private int id_pres;
    private String nombre;
    
    private String ErrorSql;

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getId_pres() {
        return id_pres;
    }

    public String getNombre() {
        return nombre;
    }

    public String getErrorSql() {
        return ErrorSql;
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">
    
    public void setId_pres(int id_pres) {
        this.id_pres = id_pres;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setErrorSql(String ErrorSql) {
        this.ErrorSql = ErrorSql;
    }
    // </editor-fold>
    
    public ArrayList<Valor_Presentacion> AllPresentacion(Connection conn){
        Valor_PresentacionBD vp = new Valor_PresentacionBD();
        return vp.AllVP(conn);
    }
    
}
