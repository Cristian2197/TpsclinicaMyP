/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import Logica_Negocio.Empleados;
import Logica_Negocio.Consultas;
import Logica_Negocio.ConsultaVista;
import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RojeruSan
 */
public class pnlHome extends javax.swing.JPanel {

    
    Connection conn;
    Empleados emp;
    ConsultaVista consulta = new ConsultaVista();
    ArrayList<ConsultaVista> consultas = new ArrayList<>();
     ArrayList<ConsultaVista> consultasWeek = new ArrayList<>();
    Date hoy = new Date();
    
    public pnlHome(Connection con, Empleados emp) throws SQLException {
        initComponents();
        this.conn = con;
        this.emp = emp;
        String msj = "Bienvenid@";
        this.jLabel1.setText(msj + " " + emp.getNombre().toUpperCase());
        this.consultas = consulta.getConsxPues(conn, emp.getId_puesto(), emp.getId_emp());
        this.FiltrarTablaxSemana();
    }

    public void LlenarTabla(ArrayList<ConsultaVista> array) throws SQLException{
        //Collections.sort(array, Collections.reverseOrder());
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Paciente");
        model.addColumn("Hora");
        model.addColumn("Fecha");
        model.addColumn("Tipo");
       
        for (int i = 0; i < array.size(); i++) {
            ConsultaVista current = array.get(i);
            Time hora = current.getHora();
            model.addRow(new Object[]{
                current.getNombre_paciente(),
                hora.toString(),
                current.getFecha(),
                current.getTipo_consulta()
            });
        }
        this.tblConsultas.setModel(model);
        
    }
    
    public int ObtenerSemanaAño(Date fecha){
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek( Calendar.MONDAY);
        calendar.setMinimalDaysInFirstWeek( 4 );
        calendar.setTime(fecha);
        int number = calendar.get(Calendar.WEEK_OF_YEAR);
        return number;
    }
    
    public int ObtenerDiaSemana(Date fecha){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        int number = calendar.get(Calendar.DAY_OF_WEEK);
        return number;
    }
    
    public void FiltrarTablaxSemana() throws SQLException{
        ArrayList<ConsultaVista> Todasconsultas = new ArrayList<>();
        int semanaActual = this.ObtenerSemanaAño(this.hoy);
        int diaHoy = this.ObtenerDiaSemana(this.hoy);
        
        for (int i = 0; i < this.consultas.size(); i++) {
            ConsultaVista current = consultas.get(i);
            Date FechaCu = current.getFecha();
            if(this.ObtenerSemanaAño(FechaCu) == semanaActual
                    && FechaCu.getYear() == this.hoy.getYear()){
                
                this.consultasWeek.add(current);
                
                if(this.ObtenerDiaSemana(FechaCu) == diaHoy){
                    Todasconsultas.add(current);
                }
            }
        }
        this.LlenarTabla(Todasconsultas);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        rSButton8 = new rojeru_san.RSButton();
        jPanel2 = new javax.swing.JPanel();
        rSButton3 = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();
        rSButton5 = new rojeru_san.RSButton();
        rSButton6 = new rojeru_san.RSButton();
        rSButton7 = new rojeru_san.RSButton();
        rSButton9 = new rojeru_san.RSButton();
        rSButton10 = new rojeru_san.RSButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsultas = new rojeru_san.complementos.RSTableMetro();

        jPanel5.setBackground(new java.awt.Color(231, 156, 194));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Miercoles");
        jLabel4.setName("txtLabel"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel4)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        rSButton8.setBackground(new java.awt.Color(51, 109, 136));
        rSButton8.setText("LUNES");
        rSButton8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        setBackground(new java.awt.Color(246, 190, 214));

        jPanel2.setBackground(new java.awt.Color(231, 156, 194));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rSButton3.setBackground(new java.awt.Color(51, 109, 136));
        rSButton3.setText("MIERCOLES");
        rSButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });

        rSButton4.setBackground(new java.awt.Color(51, 109, 136));
        rSButton4.setText("MARTES");
        rSButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton4ActionPerformed(evt);
            }
        });

        rSButton5.setBackground(new java.awt.Color(51, 109, 136));
        rSButton5.setText("LUNES");
        rSButton5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton5ActionPerformed(evt);
            }
        });

        rSButton6.setBackground(new java.awt.Color(51, 109, 136));
        rSButton6.setText("SABADO");
        rSButton6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton6ActionPerformed(evt);
            }
        });

        rSButton7.setBackground(new java.awt.Color(51, 109, 136));
        rSButton7.setText("JUVES");
        rSButton7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton7ActionPerformed(evt);
            }
        });

        rSButton9.setBackground(new java.awt.Color(51, 109, 136));
        rSButton9.setText("VIERNES");
        rSButton9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton9ActionPerformed(evt);
            }
        });

        rSButton10.setBackground(new java.awt.Color(51, 109, 136));
        rSButton10.setText("DOMINGO");
        rSButton10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rSButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rSButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addComponent(rSButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(29, 27, 56));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 156, 194));
        jLabel1.setText("BIENVENIDA");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "Fecha", "Hora", "Tipo"
            }
        ));
        tblConsultas.setAlignmentX(1.5F);
        tblConsultas.setAlignmentY(1.5F);
        tblConsultas.setAltoHead(75);
        tblConsultas.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblConsultas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblConsultas.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblConsultas.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblConsultas.setFuenteFilas(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tblConsultas.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblConsultas.setFuenteHead(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tblConsultas.setGridColor(new java.awt.Color(255, 255, 255));
        tblConsultas.setGrosorBordeHead(0);
        tblConsultas.setRowHeight(35);
        tblConsultas.setSelectionBackground(new java.awt.Color(231, 156, 194));
        jScrollPane2.setViewportView(tblConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void filtrarPorDia(int dia){
        ArrayList<ConsultaVista> listaDia = new ArrayList<>();
        for (int i = 0; i < this.consultasWeek.size(); i++) {
            ConsultaVista current = this.consultasWeek.get(i);
            Date FechaCu = current.getFecha();
            if(this.ObtenerDiaSemana(FechaCu) == dia 
                    && FechaCu.getYear() == this.hoy.getYear()){
                
                listaDia.add(current);
            }
        }
        try {
            this.LlenarTabla(listaDia);
        } catch (SQLException ex) {
            Logger.getLogger(pnlHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        this.filtrarPorDia(4);
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton5ActionPerformed
        this.filtrarPorDia(2);
    }//GEN-LAST:event_rSButton5ActionPerformed

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton4ActionPerformed
        this.filtrarPorDia(3);
    }//GEN-LAST:event_rSButton4ActionPerformed

    private void rSButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton7ActionPerformed
        this.filtrarPorDia(5);
    }//GEN-LAST:event_rSButton7ActionPerformed

    private void rSButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton9ActionPerformed
        this.filtrarPorDia(6);
    }//GEN-LAST:event_rSButton9ActionPerformed

    private void rSButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton6ActionPerformed
        this.filtrarPorDia(7);
    }//GEN-LAST:event_rSButton6ActionPerformed

    private void rSButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton10ActionPerformed
        this.filtrarPorDia(1);
    }//GEN-LAST:event_rSButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.RSButton rSButton10;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButton rSButton5;
    private rojeru_san.RSButton rSButton6;
    private rojeru_san.RSButton rSButton7;
    private rojeru_san.RSButton rSButton8;
    private rojeru_san.RSButton rSButton9;
    private rojeru_san.complementos.RSTableMetro tblConsultas;
    // End of variables declaration//GEN-END:variables
}
