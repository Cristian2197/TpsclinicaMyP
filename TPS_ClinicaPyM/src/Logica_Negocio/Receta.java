
package Logica_Negocio;

import Acceso_Datos.RecetaDB;
import java.sql.Connection;

public class Receta {
    private int id_rece;
    private int id_consul;
    private String errorSql;

    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public int getId_rece() {
        return id_rece;
    }

    public int getId_consul() {
        return id_consul;
    }

    public String getErrorSql() {
        return errorSql;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    public void setId_rece(int id_rece) {
        this.id_rece = id_rece;
    }

    public void setId_consul(int id_consul) {
        this.id_consul = id_consul;
    }

    public void setErrorSql(String errorSql) {
        this.errorSql = errorSql;
    }
    // </editor-fold> 
    
    public int CrearReceta(Connection conn, Receta res){
        RecetaDB reBD = new RecetaDB();
        return reBD.InsertarReceta(conn, res);
    }
}
