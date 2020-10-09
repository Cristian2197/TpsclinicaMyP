/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import Acceso_Datos.Conexion;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class pnlBackup extends javax.swing.JPanel {

    Conexion conn;
    
    public pnlBackup(Conexion con) throws ClassNotFoundException {
        initComponents();
        this.conn = con;
        this.fcFileChoosr.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNombre3 = new javax.swing.JLabel();
        rSMTextFull6 = new rojeru_san.RSMTextFull();
        fcFileChoosr = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCopia = new rojeru_san.RSButton();
        btnCopia1 = new rojeru_san.RSButton();

        txtNombre3.setText("Nombre: ");

        rSMTextFull6.setText("rSMTextFull2");

        fcFileChoosr.setCurrentDirectory(new java.io.File("C:\\Users\\Gerardo\\Desktop"));
        fcFileChoosr.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setMinimumSize(new java.awt.Dimension(25, 26));

        jPanel1.setBackground(new java.awt.Color(29, 27, 56));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 156, 194));
        jLabel1.setText("RESPALDO DEL SISTEMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(530, 530, 530))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(246, 190, 214));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/ComputeR1.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 150, 200));

        btnCopia.setBackground(new java.awt.Color(29, 27, 56));
        btnCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/1486504842-cloud-data-downloading-save-download-storage_81356.png"))); // NOI18N
        btnCopia.setText("COPIA DE SEGURIDAD");
        btnCopia.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiaActionPerformed(evt);
            }
        });
        jPanel3.add(btnCopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 650, 90));

        btnCopia1.setBackground(new java.awt.Color(29, 27, 56));
        btnCopia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/backup-restore256_24925.png"))); // NOI18N
        btnCopia1.setText("RESTAURACIÓN DE COPIA DE SEGURIDAD");
        btnCopia1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCopia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopia1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCopia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 650, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        frmProbando llamada = new frmProbando ();
        llamada.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    Date hoy = new Date();
    
    private void btnCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiaActionPerformed
        String nombre = "Backup_" + this.hoy.getTime() + ".sql";
        this.fcFileChoosr.setDialogTitle("Guardar en...");
        this.fcFileChoosr.setApproveButtonText("Seleccionar carpeta");
        //this.fcFileChoosr.setfile
        int Accept = this.fcFileChoosr.showOpenDialog(this);
        if(Accept == JFileChooser.APPROVE_OPTION){
            String path = this.fcFileChoosr.getSelectedFile().getAbsolutePath() + "\\" + nombre;
            this.conn.Backup(path);
        }
    }//GEN-LAST:event_btnCopiaActionPerformed

    private void btnCopia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopia1ActionPerformed
        
    }//GEN-LAST:event_btnCopia1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnCopia;
    private rojeru_san.RSButton btnCopia1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser fcFileChoosr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.RSMTextFull rSMTextFull6;
    private javax.swing.JLabel txtNombre3;
    // End of variables declaration//GEN-END:variables
}
