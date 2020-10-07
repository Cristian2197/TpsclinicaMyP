
package Logica_Negocio;

import Acceso_Datos.PuestoBD;
import java.sql.Connection;
import java.util.ArrayList;

public class Puesto {
    public int id_puesto;
    public String nombre;
    
    public int getId(){
        return this.id_puesto;
    }
    public void setId(int id){
        this.id_puesto = id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public ArrayList<Puesto> getAllPuestos(Connection con){
        PuestoBD puestobd = new PuestoBD();
        return puestobd.getPuestos(con);
    }
}
