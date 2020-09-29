/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Datos;


import paneles.frmEntrada1;

/**
 *
 * @author linke
 */
public class CLINICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Conexion BD = new Conexion ();
      BD.conexion();
      frmEntrada1 llamada = new frmEntrada1 ();
      llamada.setVisible(true);
      
    }
    
}
