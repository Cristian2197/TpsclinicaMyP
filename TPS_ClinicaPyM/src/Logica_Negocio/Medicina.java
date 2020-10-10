/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_Negocio;

import Acceso_Datos.MedicinaBD;
import java.sql.Connection;

public class Medicina {
    private int id_med;
    private String nombre;
    private double presentacion;
    private int id_pres;
    private double precio_compra;
    private double precio_venta;
    private double stock;
    
    private String errorSql;

    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public int getId_med() {
        return id_med;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPresentacion() {
        return presentacion;
    }

    public int getId_pres() {
        return id_pres;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public double getStock() {
        return stock;
    }

    public String getErrorSql() {
        return errorSql;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters"> 

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPresentacion(double presentacion) {
        this.presentacion = presentacion;
    }

    public void setId_pres(int id_pres) {
        this.id_pres = id_pres;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public void setErrorSql(String errorSql) {
        this.errorSql = errorSql;
    }
    // </editor-fold>
    
    public void PostMedicina(Connection conn, Medicina med){
        MedicinaBD medBD = new MedicinaBD();
        medBD.InsertarMedicina(conn, med);
    }
    
    public void UpdateMedicina(Connection conn, Medicina med){
        MedicinaBD medBD = new MedicinaBD();
        medBD.ModificarMedicina(conn, med);
    }
}
