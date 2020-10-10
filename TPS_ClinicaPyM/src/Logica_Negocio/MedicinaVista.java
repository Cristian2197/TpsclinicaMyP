
package Logica_Negocio;

import Acceso_Datos.MedicinaBD;
import java.sql.Connection;
import java.util.ArrayList;

public class MedicinaVista {
    private int id_med;
    private String nombre;
    private double cantidad;
    private double precio_compra;
    private double precio_venta;
    private double presentacion;
    private String nombre_pres;
    private int id_pres;
    
    private String errorSql;

    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public int getId_med() {
        return id_med;
    }

    public int getId_pres() {
        return id_pres;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public double getPresentacion() {
        return presentacion;
    }
    
    public String getPresentacionCom(){
        String pres = this.presentacion + " " + this.nombre_pres;
        return pres;
    }
    
    public String getNombre_pres() {
        return nombre_pres;
    }

    public String getErrorSql() {
        return errorSql;
    }
    // </editor-fold >
    
    // <editor-fold defaultstate="collapsed" desc="Setters"> 

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public void setId_pres(int id_pres) {
        this.id_pres = id_pres;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setPresentacion(double presentacion) {
        this.presentacion = presentacion;
    }

    public void setNombre_pres(String nombre_pres) {
        this.nombre_pres = nombre_pres;
    }

    public void setErrorSql(String errorSql) {
        this.errorSql = errorSql;
    }
    
    // </editor-fold> 
    
    public ArrayList<MedicinaVista> getMedicinafromVista(Connection conn){
        MedicinaBD medBD = new MedicinaBD();
        return medBD.GetVistaMedicina(conn);
    }
    
}
