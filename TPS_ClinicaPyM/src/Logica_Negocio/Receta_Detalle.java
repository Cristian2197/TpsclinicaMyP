/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_Negocio;

import Acceso_Datos.RecetaDB;
import java.sql.Connection;

public class Receta_Detalle {
    private int id_deta;
    private int id_med;
    private int id_rece;
    private int total;
    private String intervalo;
    
    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public int getId_deta() {
        return id_deta;
    }
    
    public int getTotal() {
        return total;
    }
    
    public int getId_med() {
        return id_med;
    }

    public int getId_rece() {
        return id_rece;
    }

    public String getIntervalo() {
        return intervalo;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    public void setId_deta(int id_deta) {
        this.id_deta = id_deta;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public void setId_rece(int id_rece) {
        this.id_rece = id_rece;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }
    // </editor-fold> 
    
    public void InsertarRecetaDet(Connection conn, Receta_Detalle red){
        RecetaDB reDB = new RecetaDB();
        reDB.InsertarRecetaDetalle(conn, red);
    }
    
}
