/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;

import java.sql.Connection;
import Logica_Negocio.Puesto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PuestoBD {
    
    public ArrayList<Puesto> getPuestos(Connection con){
        ArrayList<Puesto> puesto = new ArrayList<Puesto>();
        Puesto oPues;
        try 
        {
            Statement stm= con.createStatement();
            ResultSet rs= stm.executeQuery("SELECT * FROM puesto order by id_puesto");
            if(rs != null){
                while(rs.next()){
                    oPues=new Puesto();
                    oPues.setId(rs.getInt("id_puesto"));
                    oPues.setNombre(rs.getString("nombre"));
                    puesto.add(oPues);
                }
            }
            
        } 
        catch (SQLException e) { return null; }
        return puesto;

    }
}
