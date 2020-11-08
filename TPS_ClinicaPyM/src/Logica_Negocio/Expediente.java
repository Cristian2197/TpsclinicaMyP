/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_Negocio;

import Acceso_Datos.ExpedienteBD;
import java.sql.Connection;
import java.util.ArrayList;

public class Expediente {
   
    public ArrayList<Paciente> getPacientes(Connection conn){
        ExpedienteBD expBD = new ExpedienteBD();
        return expBD.getPacientesExp(conn);
    }
    
    public ArrayList<ConsultaVista> getConsultas(Connection conn, int id){
        ExpedienteBD expBD = new ExpedienteBD();
        return expBD.getConsulta(conn, id);
    }
    
    public ArrayList<Medicina> getMedicina(Connection conn, int id){
        ExpedienteBD expBD = new ExpedienteBD();
        return expBD.getMedicina(conn, id);
    }
}
