
package Acceso_Datos;

import Logica_Negocio.Receta;
import Logica_Negocio.Receta_Detalle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RecetaDB {
    
    public int InsertarReceta(Connection conn, Receta rec){
        int idLast = 0;
        String sql = "INSERT INTO public.recetas (id_consul) VALUES("+rec.getId_consul()+");";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            
            ResultSet rs= stm.executeQuery(
                    "select MAX(r2.id_rece) as ultimo from recetas r2");
            rs.next();
            idLast = rs.getInt("ultimo");
            
            return idLast;
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return idLast;
        }
    }
    
    public void InsertarRecetaDetalle(Connection conn, Receta_Detalle rec){
        String sql = "INSERT INTO public.receta_detalle (id_med, id_rece, intervalo, total) "
                + "VALUES("
                + rec.getId_med()+","
                + rec.getId_rece()+", '"
                + rec.getIntervalo()+"', "
                + rec.getTotal()+");";
        try 
        {
            Statement stm= conn.createStatement();
            stm.executeUpdate(sql);
            
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
    }
    
}
