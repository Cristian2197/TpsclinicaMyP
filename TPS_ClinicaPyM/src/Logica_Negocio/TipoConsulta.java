/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_Negocio;

import Acceso_Datos.TipoConsultaBD;
import java.sql.Connection;
import java.util.ArrayList;

public class TipoConsulta {
    private int id_tipoConsul;
    private String nombre;
    private String precio;

    private String ErrorSql;
                
    // <editor-fold defaultstate="collapsed" desc="Getters">
        public int getId_tipoConsul() {
            return id_tipoConsul;
        }

        public String getNombre() {
            return nombre;
        }

        public String getPrecio() {
            return precio;
        }

        public String getErrorSql() {
            return ErrorSql;
        }
    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="Setters">

        public void setId_tipoConsul(int id_tipoConsul) {
            this.id_tipoConsul = id_tipoConsul;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPrecio(String precio) {
            this.precio = precio;
        }

        public void setErrorSql(String ErrorSql) {
            this.ErrorSql = ErrorSql;
        }
// </editor-fold>
    
    public ArrayList<TipoConsulta> getAll(Connection conn){
        TipoConsultaBD tp = new TipoConsultaBD();
        return tp.getTipoConsulta(conn);
    }
    
}
