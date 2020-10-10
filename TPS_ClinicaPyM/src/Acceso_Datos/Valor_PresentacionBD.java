
package Acceso_Datos;

import Logica_Negocio.Valor_Presentacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Valor_PresentacionBD {
    
    public ArrayList<Valor_Presentacion> AllVP(Connection conn){
        Valor_Presentacion vp;
        ArrayList<Valor_Presentacion> VPL = new ArrayList<>();
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(
                "SELECT * FROM valor_presentacion;"
            );
            if(rs != null){
                while(rs.next()){
                    vp = new Valor_Presentacion();
                    vp.setId_pres(rs.getInt("id_pres"));
                    vp.setNombre(rs.getString("nombre"));
                    vp.setErrorSql("OK");
                    VPL.add(vp);
                }
            }
        } catch (SQLException ex) {
            vp = new Valor_Presentacion();
            vp.setErrorSql(ex.getMessage());
            VPL.add(vp);
            Logger.getLogger(Valor_PresentacionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return VPL;
    }
}
