/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Logica_Negocio.Empleados;
import Logica_Negocio.Expediente;
import Logica_Negocio.Paciente;
import Formularios.frmConsultasExp;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class pnlExpediente extends javax.swing.JPanel {

    Empleados empL;
    Expediente exp = new Expediente();
    ArrayList<Paciente> ListaPaci;
    Connection conn;
    
    public pnlExpediente(Empleados emp, Connection conn) {
        initComponents();
        empL = emp;
        this.conn = conn;
        ListaPaci = this.exp.getPacientes(conn);
        
        this.LlenarTabla();
    }
    
    DefaultTableModel model;
    public void LlenarTabla(){
        
        this.model = new DefaultTableModel();
        
        model.addColumn("Nombre");
        model.addColumn("Dirección");
        model.addColumn("DUI");
        model.addColumn("Teléfono");
        model.addColumn("Encargado");
        model.addColumn("Teléfono de encargado");
       
        for (int i = 0; i < this.ListaPaci.size(); i++) {
            Paciente current = this.ListaPaci.get(i);
            
            model.addRow(new Object[]{
                current.getNombre(),
                current.getDireccion(),
                current.getDui(),
                current.getTelefono(),
                current.getEncargado(),
                current.getTelefono_encargado()
            });
        }
        this.tblExpediente.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreEmpleado = new rojeru_san.RSMTextFull();
        rSLabelAnimated1 = new rojeru_san.rslabel.RSLabelAnimated();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNombreFiltro = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpediente = new rojerusan.RSTableMetro();
        rSButtonEffect1 = new rojeru_san.rsbutton.RSButtonEffect();

        txtNombreEmpleado.setForeground(new java.awt.Color(51, 109, 136));
        txtNombreEmpleado.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtNombreEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        rSLabelAnimated1.setText("rSLabelAnimated1");

        setBackground(new java.awt.Color(246, 190, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 27, 56));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 156, 194));
        jLabel1.setText("CUENTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jLabel1)
                .addContainerGap(1064, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, -1));

        jTabbedPane1.setBackground(new java.awt.Color(246, 190, 214));

        jPanel3.setBackground(new java.awt.Color(246, 190, 214));

        jPanel4.setBackground(new java.awt.Color(246, 190, 214));

        txtNombreFiltro.setBackground(new java.awt.Color(246, 190, 214));
        txtNombreFiltro.setForeground(new java.awt.Color(51, 109, 136));
        txtNombreFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreFiltro.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtNombreFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombreFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreFiltroKeyTyped(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(246, 190, 214));

        tblExpediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblExpediente.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExpedienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExpediente);

        rSButtonEffect1.setBackground(new java.awt.Color(51, 109, 136));
        rSButtonEffect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/IMPRIMIR2.png"))); // NOI18N
        rSButtonEffect1.setText("IMPRIMIR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("EXPEDIENTE", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1450, 680));
    }// </editor-fold>//GEN-END:initComponents
    
    TableRowSorter trs;
    private void txtNombreFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreFiltroKeyTyped
        txtNombreFiltro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtNombreFiltro.getText(), 0));
                //List ldt = (List) trs.getSortKeys();            
            }
        });
        trs = new TableRowSorter(this.model);
        this.tblExpediente.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreFiltroKeyTyped

    private void tblExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExpedienteMouseClicked
        int selected = this.tblExpediente.getSelectedRow();
        int id = this.ListaPaci.get(selected).getId_paci();
        frmConsultasExp consul = new frmConsultasExp();
        consul.addId(id, this.conn);
        consul.setVisible(true);
    }//GEN-LAST:event_tblExpedienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private rojeru_san.rsbutton.RSButtonEffect rSButtonEffect1;
    private rojeru_san.rslabel.RSLabelAnimated rSLabelAnimated1;
    private rojerusan.RSTableMetro tblExpediente;
    private rojeru_san.RSMTextFull txtNombreEmpleado;
    private rojeru_san.RSMTextFull txtNombreFiltro;
    // End of variables declaration//GEN-END:variables
}
