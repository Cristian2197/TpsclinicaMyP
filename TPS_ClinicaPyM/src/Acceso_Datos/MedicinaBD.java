/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;

import Logica_Negocio.Medicina;
import Logica_Negocio.MedicinaVista;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicinaBD {
    
    public ArrayList<MedicinaVista> GetVistaMedicina(Connection conn){
        MedicinaVista medV;
        ArrayList<MedicinaVista> medVLista = new ArrayList<>();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM medicina_vista;");
            if(rs != null){
                while(rs.next()){
                    medV = new MedicinaVista();
                    medV.setId_med(rs.getInt("id_med"));
                    medV.setNombre(rs.getString("nombre"));
                    medV.setCantidad(rs.getInt("cantidad"));
                    medV.setPrecio_compra(rs.getDouble("precio_compra"));
                    medV.setPrecio_venta(rs.getDouble("precio_venta"));
                    medV.setPresentacion(rs.getDouble("presentacion"));
                    medV.setNombre_pres(rs.getString("nombre_pres"));
                    medV.setId_pres(rs.getInt("id_pres"));
                    medV.setErrorSql("OK");
                    medVLista.add(medV);
                }
            }
        } catch (SQLException ex) {
            medV = new MedicinaVista();
            medV.setErrorSql(ex.getMessage());
            medVLista.add(medV);
            Logger.getLogger(MedicinaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medVLista;
    }  
    
    public void InsertarMedicina(Connection conn, Medicina med){
        String sql="INSERT INTO public.medicina (nombre, presentacion, id_pres, precio_compra, precio_venta, stock) \n" +
        "VALUES('"
        +med.getNombre()+"',"
        +med.getPresentacion()+","
        +med.getId_pres()+","
        +med.getPrecio_compra()+","
        +med.getPrecio_venta()+","
        +med.getStock()+");";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void ModificarMedicina(Connection conn, Medicina med){
        String sql="UPDATE public.medicina SET "
                +"nombre='"+med.getNombre()+"', "
                +"presentacion="+med.getPresentacion()+","
                +"id_pres="+med.getId_pres()+","
                +"precio_compra="+med.getPrecio_compra()+","
                +"precio_venta="+med.getPrecio_venta()+","
                +"stock="+med.getStock()+""
                +"WHERE id_med="+med.getId_med()+";";
         try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
