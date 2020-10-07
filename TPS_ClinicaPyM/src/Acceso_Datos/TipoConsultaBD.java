/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;

import Logica_Negocio.TipoConsulta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TipoConsultaBD {
    
    public ArrayList<TipoConsulta> getTipoConsulta(Connection con){
        ArrayList<TipoConsulta> tipos = new ArrayList<>();
        try 
        {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(
                "select * from tipo_consulta order by id_tipo_consul;"
            );
            if(rs != null){
                while(rs.next()){
                    TipoConsulta tp = new TipoConsulta();
                    tp.setId_tipoConsul(rs.getInt("id_tipo_consul"));
                    tp.setNombre(rs.getString("nombre"));
                    tp.setPrecio(rs.getString("precio"));
                    tp.setErrorSql("Ok");
                    tipos.add(tp);
                }
            }
            
        } 
        catch (SQLException e) { 
            TipoConsulta tp = new TipoConsulta();
            tp.setErrorSql(e.getMessage());
            tipos.add(tp);
        }
        return tipos;
    }
}
