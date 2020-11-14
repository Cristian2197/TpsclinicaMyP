/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Logica_Negocio.ConsultaVista;
import Logica_Negocio.Consultas;
import Logica_Negocio.Medicina;
import Logica_Negocio.MedicinaVista;
import Logica_Negocio.Empleados;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import Formularios.TextPrompt;
import Logica_Negocio.Receta;
import Logica_Negocio.Receta_Detalle;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Gerardo
 */
public class Recetas extends javax.swing.JPanel {

    Connection conn;
    ConsultaVista consult;
    Consultas con;
    MedicinaVista medV = new MedicinaVista();
    ArrayList<MedicinaVista> medicinasL = new ArrayList<>();
    Medicina Medi = new Medicina();
    DefaultListModel modelLista =  new DefaultListModel();
    double total = 0;
    JPanel pnlMain;
    Empleados emp;
    
    public Recetas(Connection conn, ConsultaVista consul, Consultas con, JPanel pnlMain, Empleados emp) {
        initComponents();
        this.medicinasL = medV.getMedicinafromVista(conn);
        this.conn = conn;
        if(consul != null){
            this.con = con;
            this.consult = consul;
            this.spnIdConsulta.setEnabled(false);
            this.LlenarCampos(consul);
            this.total = Double.valueOf(this.consult.getTotal().toString());
           
        }else{
            
        }
        this.pnlMain = pnlMain;
        this.emp = emp;
        this.txtTotal.setText("$ " + String.valueOf(this.total));
        this.txtTipo.setEditable(false);
        this.txtNombrePaci.setEditable(false);
        this.txtTotal.setEditable(false);
        this.lstReceta.setModel(this.modelLista);
        this.LlenarComboMed(medicinasL);
       /* TextPrompt Nombre = new TextPrompt("Nombre de paciente", this.buscar);
        TextPrompt FechaI = new TextPrompt("Fecha Inicial", this.txtFechaInicio);
        TextPrompt FechaF = new TextPrompt("Fecha Final", this.txtFecha);
        TextPrompt NombreIng = new TextPrompt("Nombre del paciente", this.txtNombrePaci);
        TextPrompt FechaIng = new TextPrompt("Ingresar Fecha", this.txtFechaIng);*/
    }

    Recetas(Connection conn, Empleados empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void LlenarCampos(ConsultaVista con){
        this.txtNombrePaci.setText(con.getNombre_paciente());
        this.spnIdConsulta.setValue(con.getId_consulta());
        this.dcFechaN.setDate(con.getFecha());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar1 = new rojeru_san.RSButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstReceta = new javax.swing.JList<>();
        btnGuardar1 = new rojeru_san.RSButton();
        btnImprimir1 = new rojeru_san.RSButton();
        jPanel3 = new javax.swing.JPanel();
        txtNombrePaci = new rojeru_san.RSMTextFull();
        lblFechaIngreso = new javax.swing.JLabel();
        dcFechaN = new com.toedter.calendar.JDateChooser();
        lblMedicina = new javax.swing.JLabel();
        cmdMedicina = new rojerusan.RSComboMetro();
        jLabel1 = new javax.swing.JLabel();
        spnUnidades = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spnIntervalo = new javax.swing.JSpinner();
        btnTrasladar = new rojeru_san.RSButton();
        lblFechaIngreso1 = new javax.swing.JLabel();
        spnIdConsulta = new javax.swing.JSpinner();
        lblFechaIngreso2 = new javax.swing.JLabel();
        cmdIntervalo = new rojerusan.RSComboMetro();
        spnTotal = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new rojeru_san.RSMTextFull();
        btnGuardar3 = new rojeru_san.RSButton();
        txtTotal = new rojeru_san.RSMTextFull();
        lblFechaIngreso3 = new javax.swing.JLabel();
        btnGuardar2 = new rojeru_san.RSButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        btnEliminar1.setBackground(new java.awt.Color(51, 109, 136));
        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/ELIMINAR1.png"))); // NOI18N
        btnEliminar1.setText("ELIMINAR");

        setBackground(new java.awt.Color(246, 190, 214));

        jTabbedPane1.setBackground(new java.awt.Color(246, 190, 214));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane1.setInheritsPopupMenu(true);

        jPanel2.setBackground(new java.awt.Color(246, 190, 214));

        lstReceta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lstReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstRecetaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstReceta);

        btnGuardar1.setBackground(new java.awt.Color(255, 0, 51));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_121896 (2).png"))); // NOI18N
        btnGuardar1.setText("CANCELAR");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnImprimir1.setBackground(new java.awt.Color(51, 109, 136));
        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/IMPRIMIR2.png"))); // NOI18N
        btnImprimir1.setText("IMPRIMIR");

        jPanel3.setBackground(new java.awt.Color(246, 190, 214));

        txtNombrePaci.setPlaceholder("Nombre del paciente");
        txtNombrePaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePaciActionPerformed(evt);
            }
        });

        lblFechaIngreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaIngreso.setText("Fecha:");

        lblMedicina.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMedicina.setText("Medicina");

        cmdMedicina.setColorArrow(new java.awt.Color(51, 109, 136));
        cmdMedicina.setColorBorde(new java.awt.Color(51, 109, 136));
        cmdMedicina.setColorFondo(new java.awt.Color(51, 109, 136));
        cmdMedicina.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmdMedicina.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmdMedicinaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmdMedicina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdMedicinaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Unidades: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Tiempo:");

        spnIntervalo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnTrasladar.setBackground(new java.awt.Color(246, 190, 214));
        btnTrasladar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrowrigth.png"))); // NOI18N
        btnTrasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasladarActionPerformed(evt);
            }
        });

        lblFechaIngreso1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaIngreso1.setText("Paciente:");

        spnIdConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblFechaIngreso2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaIngreso2.setText("Consulta:");

        cmdIntervalo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horas", "Días", "Meses", "Años" }));
        cmdIntervalo.setColorArrow(new java.awt.Color(51, 109, 136));
        cmdIntervalo.setColorBorde(new java.awt.Color(51, 109, 136));
        cmdIntervalo.setColorFondo(new java.awt.Color(51, 109, 136));
        cmdIntervalo.setColorSeleccion(new java.awt.Color(51, 109, 136));

        spnTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Total:");

        txtTipo.setPlaceholder("Total");
        txtTipo.setSoloNumeros(true);
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        btnGuardar3.setBackground(new java.awt.Color(51, 109, 136));
        btnGuardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Guardar.png"))); // NOI18N
        btnGuardar3.setText("SIN RECETA");
        btnGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMedicina)
                        .addGap(18, 18, 18)
                        .addComponent(cmdMedicina, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaIngreso)
                            .addComponent(lblFechaIngreso1)
                            .addComponent(lblFechaIngreso2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombrePaci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcFechaN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnIdConsulta)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnUnidades)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(spnIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdIntervalo, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(spnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaIngreso2))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaIngreso1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblFechaIngreso)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicina))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spnUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnGuardar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        txtTotal.setPlaceholder("Total");
        txtTotal.setSoloNumeros(true);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        lblFechaIngreso3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaIngreso3.setText("Total:");

        btnGuardar2.setBackground(new java.awt.Color(51, 109, 136));
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Guardar.png"))); // NOI18N
        btnGuardar2.setText("GUARDAR");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(lblFechaIngreso3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaIngreso3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear nueva", jPanel2);

        jPanel5.setBackground(new java.awt.Color(29, 27, 56));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 156, 194));
        jLabel5.setText("RECETA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(569, 569, 569)
                .addComponent(jLabel5)
                .addContainerGap(634, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePaciActionPerformed
    
    ArrayList<MedicinaVista> medReceta = new ArrayList<>();
    ArrayList arrayLista = new ArrayList();
    ArrayList<Receta_Detalle> reDeSav = new ArrayList<>();
    
    private void btnTrasladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasladarActionPerformed
        MedicinaVista mediC = this.medicinasL.get(this.cmdMedicina.getSelectedIndex());
        Receta_Detalle reDe = new Receta_Detalle();
        
        double mult = Integer.valueOf(this.spnTotal.getValue().toString()) * mediC.getPrecio_venta();
        String show = mediC.getNombre() + ": " + this.spnUnidades.getValue() + " Unidades cada " + this.spnIntervalo.getValue() + " " + this.cmdIntervalo.getSelectedItem();
        
        reDe.setId_med(mediC.getId_med());
        reDe.setIntervalo(show);
        reDe.setTotal(Integer.valueOf(this.spnTotal.getValue().toString()));
        
        this.total +=mult;
        reDeSav.add(reDe);
        medReceta.add(mediC);
        this.txtTotal.setText("$ " + this.total);
        this.arrayLista.add(show);
        this.LlenarLista();
    }//GEN-LAST:event_btnTrasladarActionPerformed
    
    private void lstRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstRecetaMouseClicked
        int index = this.lstReceta.getSelectedIndex();
        this.arrayLista.remove(index);
        MedicinaVista mediC = this.medReceta.get(index);
        Receta_Detalle reDe = this.reDeSav.get(index);
             
        this.total -= (mediC.getPrecio_venta() * reDe.getTotal());
        this.medReceta.remove(index);
        this.reDeSav.remove(index);
        
        this.txtTotal.setText("$ " + this.total);
        this.LlenarLista();
    }//GEN-LAST:event_lstRecetaMouseClicked

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        this.Limpiar();
    }//GEN-LAST:event_btnGuardar1ActionPerformed
    
    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        if(this.txtNombrePaci.getText().isEmpty() && 
           Integer.valueOf(this.spnIdConsulta.getValue().toString()) == 0 &&
           Double.valueOf(this.spnIntervalo.getValue().toString()) == 0 &&
           Double.valueOf(this.spnTotal.getValue().toString()) == 0 &&
           Double.valueOf(this.spnUnidades.getValue().toString()) == 0 &&
           this.dcFechaN.getDate() == null &&
           this.cmdMedicina.getSelectedIndex() == 0){
            
            JOptionPane.showMessageDialog(null, "Debe completar los campos para guardar su receta");
            
        }else{
            if(this.consult != null){
                Receta rec = new Receta();
                rec.setId_consul(this.consult.getId_consulta());
                int id = rec.CrearReceta(conn, rec);

                for (int i = 0; i < this.reDeSav.size(); i++) {
                    Receta_Detalle get = this.reDeSav.get(i);
                    get.setId_rece(id);
                    get.InsertarRecetaDet(conn, get);
                }
                this.con.setTotal(this.total);
                this.con.UpdateConsulta(con, conn);
                this.Limpiar();
            }
        }
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void cmdMedicinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdMedicinaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMedicinaMouseClicked

    private void cmdMedicinaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmdMedicinaPopupMenuWillBecomeInvisible
        MedicinaVista medV = this.medicinasL.get(this.cmdMedicina.getSelectedIndex());
        this.txtTipo.setText(medV.getNombre_pres());
    }//GEN-LAST:event_cmdMedicinaPopupMenuWillBecomeInvisible

    private void btnGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar3ActionPerformed
        this.Limpiar();
        try {
            this.CambiaPanel();
        } catch (SQLException ex) {
            Logger.getLogger(Recetas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardar3ActionPerformed
    
    public void CambiaPanel() throws SQLException{
         new CambiaPanel(this.pnlMain, new Formularios.pnlHome(this.conn, this.emp));
         
    }
    public void LlenarLista(){
        this.modelLista.removeAllElements();
        for (int i = 0; i < this.arrayLista.size(); i++) {
            this.modelLista.addElement(this.arrayLista.get(i));
        }
    }
    
    public void Limpiar(){
        this.cmdMedicina.setSelectedIndex(0);
        this.cmdIntervalo.setSelectedIndex(0);
        this.spnUnidades.setValue(0);
        this.spnIntervalo.setValue(0);
        this.arrayLista.removeAll(this.arrayLista);
        this.reDeSav.removeAll(this.reDeSav);
        this.medReceta.removeAll(medReceta);
        this.LlenarLista();
    }
    
    int MediFa = 0;
    public void LlenarComboMed(ArrayList<MedicinaVista> Datos){
        this.txtTipo.setText(Datos.get(0).getNombre_pres());
        if(this.cmdMedicina.getItemCount()> 0){
            this.cmdMedicina.removeAllItems();   
        }
        if(Datos.size() > 0){
            for (int i = 0; i < Datos.size(); i++) {
                MedicinaVista medi = Datos.get(i);
                if(medi.getCantidad() > medi.getMinimo()){
                    String campo=medi.getNombre();
                    this.cmdMedicina.addItem(campo);
                }else{
                    this.MediFa++;
                }
            }
        }else{
            this.cmdMedicina.addItem("No hay medicinas en el inventario");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnEliminar1;
    private rojeru_san.RSButton btnGuardar1;
    private rojeru_san.RSButton btnGuardar2;
    private rojeru_san.RSButton btnGuardar3;
    private rojeru_san.RSButton btnImprimir1;
    private rojeru_san.RSButton btnTrasladar;
    private rojerusan.RSComboMetro cmdIntervalo;
    private rojerusan.RSComboMetro cmdMedicina;
    private com.toedter.calendar.JDateChooser dcFechaN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaIngreso1;
    private javax.swing.JLabel lblFechaIngreso2;
    private javax.swing.JLabel lblFechaIngreso3;
    private javax.swing.JLabel lblMedicina;
    private javax.swing.JList<String> lstReceta;
    private javax.swing.JSpinner spnIdConsulta;
    private javax.swing.JSpinner spnIntervalo;
    private javax.swing.JSpinner spnTotal;
    private javax.swing.JSpinner spnUnidades;
    private rojeru_san.RSMTextFull txtNombrePaci;
    private rojeru_san.RSMTextFull txtTipo;
    private rojeru_san.RSMTextFull txtTotal;
    // End of variables declaration//GEN-END:variables
}
