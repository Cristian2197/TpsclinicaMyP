/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.Connection;
import Logica_Negocio.Empleados;
import Formularios.Principal;
import org.apache.commons.codec.digest.DigestUtils;
import Acceso_Datos.Conexion;
import java.sql.SQLException;

/**
 *
 * @author linke
 */
public class frmloguinn extends javax.swing.JFrame {
 private boolean ingreso = false;
 private Empleados emp;
    public frmloguinn() {
        initComponents();
        setLocationRelativeTo(null);
        btnError.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblClinica = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new rojeru_san.RSButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDia = new javax.swing.JLabel();
        btnPass = new rojeru_san.RSMPassView();
        btnUsuario = new rojeru_san.RSMTextFull();
        btnError = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(955, 535));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(29, 27, 56));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClinica.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblClinica.setForeground(new java.awt.Color(231, 156, 194));
        lblClinica.setText("Clínica De La Mujer Y Su Pareja ");
        jPanel4.add(lblClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¡BIENVENIDO!");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 83));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Por favor inicia sesión para poder utilizar");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 490, 574, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("esta Aplicación");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 510, 598, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 230));

        btnSalir.setBackground(new java.awt.Color(29, 27, 56));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 80, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 610));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 109, 136));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/label-usuario.png"))); // NOI18N
        jLabel5.setText("Usuario");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 109, 136));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/label-contraseña.png"))); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        txtDia.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDia.setText("¡TENGA BUEN DIA!");
        jPanel3.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, -1, -1));

        btnPass.setPlaceholder("Digite su contraseña...");
        btnPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnPassFocusGained(evt);
            }
        });
        jPanel3.add(btnPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 330, -1));

        btnUsuario.setPlaceholder("Escriba su nombre de usuario...");
        btnUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnUsuarioFocusGained(evt);
            }
        });
        jPanel3.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 340, -1));

        btnError.setBackground(new java.awt.Color(255, 0, 0));
        btnError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N
        btnError.setText("Mensaje de error");
        jPanel3.add(btnError, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 330, -1));

        rSButtonRiple2.setBackground(new java.awt.Color(29, 27, 56));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-entrar.png"))); // NOI18N
        rSButtonRiple2.setText("INICIAR SESIÓN");
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 330, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    Conexion conexion;
    public void SetConexion(Connection conn){
        this.con = conn;
    }
    
    public String EncriptarContra(String contraseña){
        String encriptada;
        encriptada = DigestUtils.md5Hex(contraseña);
        return encriptada;
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorActionPerformed
        
    }//GEN-LAST:event_btnErrorActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        
    }//GEN-LAST:event_txtPassActionPerformed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        if(this.btnUsuario.getText().isEmpty() || this.btnPass.getText().isEmpty()){
            this.btnError.setText("No pueden ir campos vacíos");
            this.btnError.setVisible(true);
        }else{
            String Usuario = this.btnUsuario.getText().trim();
            String Password = this.btnPass.getText();
            Password = this.EncriptarContra(Password);
            this.emp = new Empleados();
            emp.setContraseña(Password);
            emp.setUsuario(Usuario);
            Empleados empleadoVal = emp.validarEmpleado(this.con, emp);
            String error = empleadoVal.getErrorSql();
            if(!error.toLowerCase().equals("ok")){
                if(error.contains("Usuario incorrecto")){
                    this.btnError.setText("Usuario incorrecto");
                }else if(error.contains("Clave")){
                    this.btnError.setText("Contraseña incorrecta");
                }else{
                    this.btnError.setText("Algo salió mal");
                }
                //String[] err = error.split(" ");
                this.btnError.setVisible(true);
                
            }else{
                try {
                    this.con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(frmloguinn.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.conexion = new Conexion(empleadoVal.getId_puesto());
                this.btnError.setVisible(false);
                Principal prin = new Principal();
                try {
                    prin.setConData(this.conexion, empleadoVal);
                } catch (SQLException ex) {
                    Logger.getLogger(frmloguinn.class.getName()).log(Level.SEVERE, null, ex);
                }
                prin.setVisible(true);
                this.setVisible(false);
                
            }
        }
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void btnUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUsuarioFocusGained
        this.btnError.setVisible(false);
    }//GEN-LAST:event_btnUsuarioFocusGained

    private void btnPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnPassFocusGained
        this.btnError.setVisible(false);
    }//GEN-LAST:event_btnPassFocusGained

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmloguinn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmloguinn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmloguinn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmloguinn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmloguinn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnError;
    private rojeru_san.RSMPassView btnPass;
    private rojeru_san.RSButton btnSalir;
    private rojeru_san.RSMTextFull btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblClinica;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private javax.swing.JLabel txtDia;
    // End of variables declaration//GEN-END:variables
}
