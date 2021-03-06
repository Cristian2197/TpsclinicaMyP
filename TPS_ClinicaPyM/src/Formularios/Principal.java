/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.Connection;
import Acceso_Datos.Conexion;
import Logica_Negocio.Empleados;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import org.eclipse.jdt.internal.compiler.batch.Main;
/**
 *
 * @author RojeruSan
 */
public class Principal extends javax.swing.JFrame {

    int x, y;
    Connection conn;
    Conexion conect;
    Empleados emp;
    private Object Formularios;
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.uno.setSelected(true);
    }
    
    public void setConData(Conexion conexion, Empleados emp) throws SQLException{
        this.conn = conexion.getConexion();
        this.conect = conexion;
        this.emp = emp;
        pnlHome panel = new pnlHome(this.conn, this.emp);
        new CambiaPanel(pnlPrincipal, panel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uno = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        siete = new rsbuttom.RSButtonMetro();
        seis = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        jLabel3 = new javax.swing.JLabel();
        ocho = new rsbuttom.RSButtonMetro();
        btnPowerOff = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(51, 109, 136));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));

        jPanel4.setBackground(new java.awt.Color(51, 109, 136));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeIcon.png"))); // NOI18N
        uno.setText("Inicio");
        uno.setColorHover(new java.awt.Color(49, 143, 181));
        uno.setColorNormal(new java.awt.Color(51, 109, 136));
        uno.setColorPressed(new java.awt.Color(29, 9, 33));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        uno.setIconTextGap(25);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 235, Short.MAX_VALUE))
                    .addComponent(uno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Consultas.png"))); // NOI18N
        tres.setText("Consultas");
        tres.setColorHover(new java.awt.Color(49, 143, 181));
        tres.setColorNormal(new java.awt.Color(51, 109, 136));
        tres.setColorPressed(new java.awt.Color(29, 9, 33));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tres.setIconTextGap(19);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        dos.setText("Pacientes");
        dos.setColorHover(new java.awt.Color(49, 143, 181));
        dos.setColorNormal(new java.awt.Color(51, 109, 136));
        dos.setColorPressed(new java.awt.Color(29, 9, 33));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.setIconTextGap(25);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Doctor.png"))); // NOI18N
        cinco.setText("Empleados");
        cinco.setColorHover(new java.awt.Color(49, 143, 181));
        cinco.setColorNormal(new java.awt.Color(51, 109, 136));
        cinco.setColorPressed(new java.awt.Color(29, 9, 33));
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cinco.setIconTextGap(19);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DB.png"))); // NOI18N
        siete.setText("Base de Datos");
        siete.setColorHover(new java.awt.Color(49, 143, 181));
        siete.setColorNormal(new java.awt.Color(51, 109, 136));
        siete.setColorPressed(new java.awt.Color(29, 9, 33));
        siete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        siete.setIconTextGap(19);
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
        });
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuario.png"))); // NOI18N
        seis.setText("Cuenta");
        seis.setColorHover(new java.awt.Color(49, 143, 181));
        seis.setColorNormal(new java.awt.Color(51, 109, 136));
        seis.setColorPressed(new java.awt.Color(29, 9, 33));
        seis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        seis.setIconTextGap(25);
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seisMousePressed(evt);
            }
        });
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Medicina.png"))); // NOI18N
        cuatro.setText("Medicinas");
        cuatro.setColorHover(new java.awt.Color(49, 143, 181));
        cuatro.setColorNormal(new java.awt.Color(51, 109, 136));
        cuatro.setColorPressed(new java.awt.Color(29, 9, 33));
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cuatro.setIconTextGap(19);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuatroMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIGURACIONES");

        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recetas.png"))); // NOI18N
        ocho.setText("Expediente");
        ocho.setColorHover(new java.awt.Color(49, 143, 181));
        ocho.setColorNormal(new java.awt.Color(51, 109, 136));
        ocho.setColorPressed(new java.awt.Color(29, 9, 33));
        ocho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ocho.setIconTextGap(19);
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ochoMousePressed(evt);
            }
        });
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        btnPowerOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/power_off.png"))); // NOI18N
        btnPowerOff.setText("Cerrar Sesión");
        btnPowerOff.setColorHover(new java.awt.Color(49, 143, 181));
        btnPowerOff.setColorNormal(new java.awt.Color(51, 109, 136));
        btnPowerOff.setColorPressed(new java.awt.Color(29, 9, 33));
        btnPowerOff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPowerOff.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPowerOff.setIconTextGap(19);
        btnPowerOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPowerOffMousePressed(evt);
            }
        });
        btnPowerOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerOffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(siete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(seis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addComponent(dos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cuatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cinco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ocho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPowerOff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPowerOff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlMenu, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(29, 27, 56));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clinica de la Mujer y su Pareja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1481, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(246, 190, 214));

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(246, 190, 214));
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(1365, 1250));
        pnlPrincipal.setName(""); // NOI18N
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        new CambiaPanel(pnlPrincipal, new Formularios.pnlMedicina(this.conn, this.emp));

        if(this.cuatro.isSelected()){
            this.uno.setColorNormal(new Color(51,109,136));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));

            this.dos.setColorNormal(new Color(51,109,136));
            this.dos.setColorHover(new Color(49,143,181));
            this.dos.setColorPressed(new Color(29,9,33));

            this.tres.setColorNormal(new Color(51,109,136));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));

            this.cuatro.setColorNormal(new Color(49,143,181));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));

            this.cinco.setColorNormal(new Color(51,109,136));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));

            this.seis.setColorNormal(new Color(51,109,136));
            this.seis.setColorHover(new Color(49,143,181));
            this.seis.setColorPressed(new Color(29,9,33));

            this.siete.setColorNormal(new Color(51,109,136));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));

            this.ocho.setColorNormal(new Color(51,109,136));
            this.ocho.setColorHover(new Color(49,143,181));
            this.ocho.setColorPressed(new Color(29,9,33));
        }else{
            this.cuatro.setColorNormal(new Color(51,109,136));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(true);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_cuatroMousePressed

    private void cuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMouseClicked
        /*pnlMedicinas x = new pnlMedicinas();
        x.setVisible(true);*/
    }//GEN-LAST:event_cuatroMouseClicked

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        
        
        try {
            new CambiaPanel(pnlPrincipal, new Formularios.frmPerfil(this.emp, this.conn));
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(this.cuatro.isSelected()){
            this.uno.setColorNormal(new Color(51,109,136));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));

            this.dos.setColorNormal(new Color(51,109,136));
            this.dos.setColorHover(new Color(49,143,181));
            this.dos.setColorPressed(new Color(29,9,33));

            this.tres.setColorNormal(new Color(51,109,136));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));

            this.cuatro.setColorNormal(new Color(49,143,181));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));

            this.cinco.setColorNormal(new Color(51,109,136));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));

            this.seis.setColorNormal(new Color(51,109,136));
            this.seis.setColorHover(new Color(49,143,181));
            this.seis.setColorPressed(new Color(29,9,33));

            this.siete.setColorNormal(new Color(51,109,136));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));

            this.ocho.setColorNormal(new Color(51,109,136));
            this.ocho.setColorHover(new Color(49,143,181));
            this.ocho.setColorPressed(new Color(29,9,33));
        }else{
            this.cuatro.setColorNormal(new Color(51,109,136));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));
        }
    }//GEN-LAST:event_seisActionPerformed

    private void seisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(true);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_seisMousePressed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        try {
            new CambiaPanel(pnlPrincipal, new Formularios.pnlBackup(this.conect));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(this.siete.isSelected()){
            this.uno.setColorNormal(new Color(51,109,136));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));

            this.dos.setColorNormal(new Color(51,109,136));
            this.dos.setColorHover(new Color(49,143,181));
            this.dos.setColorPressed(new Color(29,9,33));

            this.tres.setColorNormal(new Color(51,109,136));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));

            this.cuatro.setColorNormal(new Color(51,109,136));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));

            this.cinco.setColorNormal(new Color(51,109,136));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));

            this.seis.setColorNormal(new Color(51,109,136));
            this.seis.setColorHover(new Color(49,143,181));
            this.seis.setColorPressed(new Color(29,9,33));

            this.siete.setColorNormal(new Color(49,143,181));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));

            this.ocho.setColorNormal(new Color(51,109,136));
            this.ocho.setColorHover(new Color(49,143,181));
            this.ocho.setColorPressed(new Color(29,9,33));
        }else{
            this.siete.setColorNormal(new Color(51,109,136));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));
        }
    }//GEN-LAST:event_sieteActionPerformed

    private void sieteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(true);
    }//GEN-LAST:event_sieteMousePressed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        try {
            new CambiaPanel(pnlPrincipal, new Formularios.pnlDoctores(this.conn, this.emp));
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(this.cinco.isSelected()){
            this.uno.setColorNormal(new Color(51,109,136));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));

            this.dos.setColorNormal(new Color(51,109,136));
            this.dos.setColorHover(new Color(49,143,181));
            this.dos.setColorPressed(new Color(29,9,33));

            this.tres.setColorNormal(new Color(51,109,136));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));

            this.cuatro.setColorNormal(new Color(51,109,136));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));

            this.cinco.setColorNormal(new Color(49,143,181));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));

            this.seis.setColorNormal(new Color(51,109,136));
            this.seis.setColorHover(new Color(49,143,181));
            this.seis.setColorPressed(new Color(29,9,33));

            this.siete.setColorNormal(new Color(51,109,136));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));

            this.ocho.setColorNormal(new Color(51,109,136));
            this.ocho.setColorHover(new Color(49,143,181));
            this.ocho.setColorPressed(new Color(29,9,33));
        }else{
            this.cinco.setColorNormal(new Color(51,109,136));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(true);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_cincoMousePressed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        if(this.emp.getId_puesto() != 1){
            new CambiaPanel(pnlPrincipal, new Formularios.pnlPacientes(this.conn, this.emp));
            if(this.dos.isSelected()){
                this.dos.setColorNormal(new Color(49,143,181));
                this.dos.setColorHover(new Color(49,143,181));
                this.dos.setColorPressed(new Color(29,9,33));

                this.uno.setColorNormal(new Color(51,109,136));
                this.uno.setColorHover(new Color(49,143,181));
                this.uno.setColorPressed(new Color(29,9,33));

                this.tres.setColorNormal(new Color(51,109,136));
                this.tres.setColorHover(new Color(49,143,181));
                this.tres.setColorPressed(new Color(29,9,33));

                this.cuatro.setColorNormal(new Color(51,109,136));
                this.cuatro.setColorHover(new Color(49,143,181));
                this.cuatro.setColorPressed(new Color(29,9,33));

                this.cinco.setColorNormal(new Color(51,109,136));
                this.cinco.setColorHover(new Color(49,143,181));
                this.cinco.setColorPressed(new Color(29,9,33));

                this.seis.setColorNormal(new Color(51,109,136));
                this.seis.setColorHover(new Color(49,143,181));
                this.seis.setColorPressed(new Color(29,9,33));

                this.siete.setColorNormal(new Color(51,109,136));
                this.siete.setColorHover(new Color(49,143,181));
                this.siete.setColorPressed(new Color(29,9,33));

                this.ocho.setColorNormal(new Color(51,109,136));
                this.ocho.setColorHover(new Color(49,143,181));
                this.ocho.setColorPressed(new Color(29,9,33));
            }else{
                this.dos.setColorNormal(new Color(51,109,136));
                this.dos.setColorHover(new Color(49,143,181));
                this.dos.setColorPressed(new Color(29,9,33));
            }
        }  
        
    }//GEN-LAST:event_dosActionPerformed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(true);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_dosMousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        try {
            new CambiaPanel(pnlPrincipal, new Formularios.pnlConsulta(this.conn, this.emp, pnlPrincipal));
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(this.tres.isSelected()){
            this.tres.setColorNormal(new Color(49,143,181));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));

            this.uno.setColorNormal(new Color(51,109,136));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));

            this.dos.setColorNormal(new Color(51,109,136));
            this.dos.setColorHover(new Color(49,143,181));
            this.dos.setColorPressed(new Color(29,9,33));

            this.cuatro.setColorNormal(new Color(51,109,136));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));

            this.cinco.setColorNormal(new Color(51,109,136));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));

            this.seis.setColorNormal(new Color(51,109,136));
            this.seis.setColorHover(new Color(49,143,181));
            this.seis.setColorPressed(new Color(29,9,33));

            this.siete.setColorNormal(new Color(51,109,136));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));

            this.ocho.setColorNormal(new Color(51,109,136));
            this.ocho.setColorHover(new Color(49,143,181));
            this.ocho.setColorPressed(new Color(29,9,33));
        }else{
            this.tres.setColorNormal(new Color(51,109,136));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));
        }
    }//GEN-LAST:event_tresActionPerformed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(true);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_tresMousePressed
    
    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        try {
            new CambiaPanel(pnlPrincipal, new Formularios.pnlHome(this.conn, this.emp));
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(this.uno.isSelected()){
            this.uno.setColorNormal(new Color(49,143,181));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));

            this.dos.setColorNormal(new Color(51,109,136));
            this.dos.setColorHover(new Color(49,143,181));
            this.dos.setColorPressed(new Color(29,9,33));

            this.tres.setColorNormal(new Color(51,109,136));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));

            this.cuatro.setColorNormal(new Color(51,109,136));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));

            this.cinco.setColorNormal(new Color(51,109,136));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));

            this.seis.setColorNormal(new Color(51,109,136));
            this.seis.setColorHover(new Color(49,143,181));
            this.seis.setColorPressed(new Color(29,9,33));

            this.siete.setColorNormal(new Color(51,109,136));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));

            this.ocho.setColorNormal(new Color(51,109,136));
            this.ocho.setColorHover(new Color(49,143,181));
            this.ocho.setColorPressed(new Color(29,9,33));
        }else{
            this.uno.setColorNormal(new Color(51,109,136));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));
        }
    }//GEN-LAST:event_unoActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        this.uno.setSelected(true);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_unoMousePressed

    private void ochoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMousePressed
        this.ocho.setSelected(true);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.uno.setSelected(false);
    }//GEN-LAST:event_ochoMousePressed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        
        new CambiaPanel(pnlPrincipal, new Formularios.pnlExpediente(this.emp, this.conn));
        
        if(this.uno.isSelected()){
            this.uno.setColorNormal(new Color(49,143,181));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));

            this.dos.setColorNormal(new Color(51,109,136));
            this.dos.setColorHover(new Color(49,143,181));
            this.dos.setColorPressed(new Color(29,9,33));

            this.tres.setColorNormal(new Color(51,109,136));
            this.tres.setColorHover(new Color(49,143,181));
            this.tres.setColorPressed(new Color(29,9,33));

            this.cuatro.setColorNormal(new Color(51,109,136));
            this.cuatro.setColorHover(new Color(49,143,181));
            this.cuatro.setColorPressed(new Color(29,9,33));

            this.cinco.setColorNormal(new Color(51,109,136));
            this.cinco.setColorHover(new Color(49,143,181));
            this.cinco.setColorPressed(new Color(29,9,33));

            this.seis.setColorNormal(new Color(51,109,136));
            this.seis.setColorHover(new Color(49,143,181));
            this.seis.setColorPressed(new Color(29,9,33));

            this.siete.setColorNormal(new Color(51,109,136));
            this.siete.setColorHover(new Color(49,143,181));
            this.siete.setColorPressed(new Color(29,9,33));

            this.ocho.setColorNormal(new Color(51,109,136));
            this.ocho.setColorHover(new Color(49,143,181));
            this.ocho.setColorPressed(new Color(29,9,33));
        }else{
            this.uno.setColorNormal(new Color(51,109,136));
            this.uno.setColorHover(new Color(49,143,181));
            this.uno.setColorPressed(new Color(29,9,33));
        }
    }//GEN-LAST:event_ochoActionPerformed


    private void btnPowerOffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPowerOffMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPowerOffMousePressed

    private void btnPowerOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerOffActionPerformed
        try {
            this.conn.close();
            Conexion con = new Conexion(0);
            Connection conexion = con.getConexion();
            frmloguinn objeto = new frmloguinn();
            objeto.SetConexion(conexion);
            objeto.setVisible(true);
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnPowerOffActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Principal().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnPowerOff;
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private rsbuttom.RSButtonMetro ocho;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro seis;
    private rsbuttom.RSButtonMetro siete;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
