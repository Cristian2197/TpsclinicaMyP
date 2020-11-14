
package Formularios;

import Logica_Negocio.Empleados;
import Logica_Negocio.Paciente;
import java.awt.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class pnlPacientes extends javax.swing.JPanel {

    Paciente paci = new Paciente();
    ArrayList<Paciente> pacientes = new ArrayList<>();
    Connection conn;
    Empleados emp;
    BufferedImage imagen;
    ImageIcon img=null;
    String extension="JPG";
    ArrayList<Paciente> listaFiltrada;
    DefaultTableModel model;
    
    public pnlPacientes(Connection con, Empleados empleado) {
        initComponents();
        this.conn = con;
        this.emp = empleado;
        this.LlenarTabla();
    }
    
    public void LlenarTabla(){
        this.pacientes = this.paci.GetAllPacientes(this.conn);
        this.model = new DefaultTableModel();
        
        model.addColumn("Nombre");
        model.addColumn("Dirección");
        model.addColumn("Teléfono");
        model.addColumn("Estado Civil");
        model.addColumn("Sexo");
        model.addColumn("Encargado");
        model.addColumn("Tel. Encargado");
        model.addColumn("DUI");
        model.addColumn("Fecha Nac.");
       
        for (int i = 0; i < this.pacientes.size(); i++) {
            Paciente current = this.pacientes .get(i);
            model.addRow(new Object[]{
                current.getNombreCompleto(),
                current.getDireccion(),
                current.getTelefono(),
                current.getEstadocivilNombre(),
                current.getSexoNombre(),
                current.getEncargado(),
                current.getTelefono_encargado(),
                current.getDui(),
                current.getFecha_nacimiento().toString()
            });
        }
        this.tblPacientes.setModel(model);
    }
  
    public void LlenarTabla(ArrayList<Paciente> array){
        this.model = new DefaultTableModel();
        
        model.addColumn("Nombre");
        model.addColumn("Dirección");
        model.addColumn("Teléfono");
        model.addColumn("Estado Civil");
        model.addColumn("Sexo");
        model.addColumn("Encargado");
        model.addColumn("Tel. Encargado");
        model.addColumn("DUI");
        model.addColumn("Fecha Nac.");
       
        for (int i = 0; i < array.size(); i++) {
            Paciente current = array.get(i);
            model.addRow(new Object[]{
                current.getNombreCompleto(),
                current.getDireccion(),
                current.getTelefono(),
                current.getEstadocivilNombre(),
                current.getSexoNombre(),
                current.getEncargado(),
                current.getTelefono_encargado(),
                current.getDui(),
                current.getFecha_nacimiento().toString()
            });
        }
        this.tblPacientes.setModel(model);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNombre3 = new javax.swing.JLabel();
        rSMTextFull6 = new rojeru_san.RSMTextFull();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPuesto = new javax.swing.JLabel();
        lblPuesto2 = new javax.swing.JLabel();
        lblPuesto1 = new javax.swing.JLabel();
        lblPuesto3 = new javax.swing.JLabel();
        lblPuesto4 = new javax.swing.JLabel();
        lblPuesto5 = new javax.swing.JLabel();
        lblPuesto6 = new javax.swing.JLabel();
        lblPuesto8 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtApellido = new rojeru_san.RSMTextFull();
        txtNombre = new rojeru_san.RSMTextFull();
        txtDireccion = new rojeru_san.RSMTextFull();
        txtDUI = new rojeru_san.RSMTextFull();
        cmbSexo = new rojerusan.RSComboMetro();
        cmbEstadoCivil = new rojerusan.RSComboMetro();
        txtTelefono = new rojeru_san.RSMTextFull();
        txtTelefonoEncargado = new rojeru_san.RSMTextFull();
        dcFechaNac = new com.toedter.calendar.JDateChooser();
        btnGuardar = new rojeru_san.RSButton();
        txtNombreFiltro = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPacientes = new rojeru_san.complementos.RSTableMetro();
        btnImprimir = new rojeru_san.RSButton();
        btnCancela = new rojeru_san.RSButton();
        lblPuesto7 = new javax.swing.JLabel();
        txtEncargado = new rojeru_san.RSMTextFull();
        txtIdPaciente = new javax.swing.JTextField();

        txtNombre3.setText("Nombre: ");

        rSMTextFull6.setText("rSMTextFull2");

        setMinimumSize(new java.awt.Dimension(25, 26));

        jPanel1.setBackground(new java.awt.Color(29, 27, 56));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 156, 194));
        jLabel1.setText("PACIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel1)
                .addContainerGap(1044, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(246, 190, 214));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPuesto.setBackground(new java.awt.Color(29, 27, 56));
        lblPuesto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto.setText("Nombre");
        jPanel3.add(lblPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lblPuesto2.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto2.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto2.setText("Apellido");
        jPanel3.add(lblPuesto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lblPuesto1.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto1.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto1.setText("Dirección");
        jPanel3.add(lblPuesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        lblPuesto3.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto3.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto3.setText("Telefono");
        jPanel3.add(lblPuesto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lblPuesto4.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto4.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto4.setText("Estado Civil");
        jPanel3.add(lblPuesto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        lblPuesto5.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto5.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto5.setText("Sexo");
        jPanel3.add(lblPuesto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        lblPuesto6.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto6.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto6.setText("Teléfono encargado");
        jPanel3.add(lblPuesto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, 20));

        lblPuesto8.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto8.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto8.setText("DUI");
        jPanel3.add(lblPuesto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        lblFecha.setBackground(new java.awt.Color(231, 156, 194));
        lblFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(29, 27, 56));
        lblFecha.setText("Fecha Nacimiento");
        jPanel3.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        txtApellido.setForeground(new java.awt.Color(29, 27, 56));
        txtApellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtApellido.setPlaceholder("Apellidos del paciente");
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 340, -1));

        txtNombre.setForeground(new java.awt.Color(29, 27, 56));
        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setPlaceholder("Nombres del paciente");
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 340, -1));

        txtDireccion.setForeground(new java.awt.Color(29, 27, 56));
        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setPlaceholder("Dirección del paciente");
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 340, -1));

        txtDUI.setForeground(new java.awt.Color(29, 27, 56));
        txtDUI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDUI.setPlaceholder("DUI del paciente");
        jPanel3.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 340, -1));

        cmbSexo.setBackground(new java.awt.Color(51, 109, 136));
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femenino", "Masculino" }));
        cmbSexo.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbSexo.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbSexo.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbSexo.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 340, 40));

        cmbEstadoCivil.setBackground(new java.awt.Color(51, 109, 136));
        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Soltero", "Casado", "Acompañado", "Divorciado" }));
        cmbEstadoCivil.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbEstadoCivil.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbEstadoCivil.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbEstadoCivil.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbEstadoCivil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(cmbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 340, 40));

        txtTelefono.setForeground(new java.awt.Color(29, 27, 56));
        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setPlaceholder("Teléfono del paciente");
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 340, -1));

        txtTelefonoEncargado.setForeground(new java.awt.Color(29, 27, 56));
        txtTelefonoEncargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefonoEncargado.setPlaceholder("Teléfono del encargado");
        jPanel3.add(txtTelefonoEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 340, -1));
        jPanel3.add(dcFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 340, 50));

        btnGuardar.setBackground(new java.awt.Color(51, 109, 136));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, -1, -1));

        txtNombreFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombreFiltro.setPlaceholder("Filtrar por nombre de paciente.....");
        txtNombreFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreFiltroKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombreFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 570, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, -1, -1));

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Dirección", "Telefono", "Estado Civil", "Sexo", "Encargado", "DUI", "Fecha Nacimiento"
            }
        ));
        tblPacientes.setAlignmentX(1.5F);
        tblPacientes.setAlignmentY(1.5F);
        tblPacientes.setAltoHead(75);
        tblPacientes.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblPacientes.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblPacientes.setFuenteFilas(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblPacientes.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblPacientes.setFuenteHead(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tblPacientes.setGridColor(new java.awt.Color(255, 255, 255));
        tblPacientes.setGrosorBordeHead(0);
        tblPacientes.setRowHeight(35);
        tblPacientes.setSelectionBackground(new java.awt.Color(231, 156, 194));
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPacientes);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 960, 380));

        btnImprimir.setBackground(new java.awt.Color(51, 109, 136));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/IMPRIMIR2.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        jPanel3.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 540, -1, -1));

        btnCancela.setBackground(new java.awt.Color(255, 0, 51));
        btnCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_121896 (2).png"))); // NOI18N
        btnCancela.setText("CANCELAR");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 540, -1, -1));

        lblPuesto7.setBackground(new java.awt.Color(231, 156, 194));
        lblPuesto7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto7.setForeground(new java.awt.Color(29, 27, 56));
        lblPuesto7.setText("Encargado");
        jPanel3.add(lblPuesto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        txtEncargado.setForeground(new java.awt.Color(29, 27, 56));
        txtEncargado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEncargado.setPlaceholder("Nombre del encargado");
        jPanel3.add(txtEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 340, -1));

        txtIdPaciente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtIdPaciente.setEnabled(false);
        jPanel3.add(txtIdPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        this.Clean();
    }//GEN-LAST:event_btnCancelaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(this.txtIdPaciente.getText().isEmpty()){
            if(this.txtNombre.getText().isEmpty() &&
               this.txtApellido.getText().isEmpty() &&
               this.txtDUI.getText().isEmpty() &&
               this.txtDireccion.getText().isEmpty() &&
               this.txtTelefono.getText().isEmpty() &&
               this.dcFechaNac.getDate() == null){
                
                JOptionPane.showMessageDialog(null, "Faltan datos importantes");
            }else{
                this.GuardarPaciente();
            }
        }else{
            if(this.txtNombre.getText().isEmpty() &&
               this.txtApellido.getText().isEmpty() &&
               this.txtDUI.getText().isEmpty() &&
               this.txtDireccion.getText().isEmpty() &&
               this.txtTelefono.getText().isEmpty() &&
               this.dcFechaNac.getDate() == null){
                
                JOptionPane.showMessageDialog(null, "Faltan datos importantes");
            }else{
                
                this.ActualizarPaciente();
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
        ArrayList<Paciente> paciL = new ArrayList<>();
        int index = this.tblPacientes.getSelectedRow();
        if(this.tblPacientes.getRowCount() == this.pacientes.size()){
            Paciente paciente = this.pacientes.get(index);
            this.LlenarCampos(paciente);
        }else{ 
            String texto = this.txtNombreFiltro.getText();
            for (int i = 0; i < this.pacientes.size(); i++) {
                Paciente c = this.pacientes.get(i);
                if( c.getNombreCompleto().toLowerCase().indexOf(texto.toLowerCase()) >= 0){
                    paciL.add(c);
                }
            }
            this.LlenarCampos(paciL.get(index));
        }
    }//GEN-LAST:event_tblPacientesMouseClicked
    
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
        this.tblPacientes.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreFiltroKeyTyped
    
    public void LlenarCampos(Paciente paci){
        this.txtNombre.setText(paci.getNombre());
        this.txtApellido.setText(paci.getApellido());
        this.txtIdPaciente.setText(String.valueOf(paci.getId_paci()));
        this.txtEncargado.setText(paci.getEncargado());
        this.txtDireccion.setText(paci.getDireccion());
        this.txtDUI.setText(paci.getDui());
        this.txtTelefono.setText(paci.getTelefono());
        this.txtTelefonoEncargado.setText(paci.getTelefono_encargado());
        this.dcFechaNac.setDate(paci.getFecha_nacimiento());
        this.cmbEstadoCivil.setSelectedIndex(paci.getIndexEstadoCivil());
        this.cmbSexo.setSelectedIndex(paci.getIndexSexo());
    }
    
    public void Clean(){
        this.txtIdPaciente.setText(null);
        this.txtNombre.setText(null);
        this.txtApellido.setText(null);
        this.txtDUI.setText(null);
        this.txtDireccion.setText(null);
        this.txtEncargado.setText(null);
        this.txtTelefonoEncargado.setText(null);
        this.dcFechaNac.setDate(null);
    }
    
    public void GuardarPaciente(){
        Paciente NewPaci = new Paciente();
        NewPaci.setNombre(this.txtNombre.getText());
        NewPaci.setApellido(this.txtApellido.getText());
        NewPaci.setTelefono(this.txtTelefono.getText());
        NewPaci.setEncargado(this.txtEncargado.getText());
        NewPaci.setTelefono_encargado(this.txtTelefonoEncargado.getText());
        NewPaci.setDireccion(this.txtDireccion.getText());
        NewPaci.setDui(this.txtDUI.getText());
        NewPaci.setFecha_nacimiento(this.dcFechaNac.getDate());
        switch (this.cmbSexo.getSelectedIndex()) {
            case 0:
                NewPaci.setSexo('F');
                break;
            case 1:
                NewPaci.setSexo('M');
                break;
            default:
                NewPaci.setSexo('N');
                break;
        }
        switch (this.cmbEstadoCivil.getSelectedIndex()) {
            case 1:
                NewPaci.setEstado_civil('S');
                break;
            case 2:
                NewPaci.setEstado_civil('C');
                break;
            case 3:
                NewPaci.setEstado_civil('A');
                break;
            case 4:
                NewPaci.setEstado_civil('D');
                break;
            default:
                NewPaci.setEstado_civil('E');
                break;
        }
        NewPaci.PostPaciente(NewPaci, conn);
        this.Clean();
    }
    
    public void ActualizarPaciente(){
        Paciente NewPaci = new Paciente();
        NewPaci.setId_paci(Integer.valueOf(this.txtIdPaciente.getText()));
        NewPaci.setNombre(this.txtNombre.getText());
        NewPaci.setApellido(this.txtApellido.getText());
        NewPaci.setTelefono(this.txtTelefono.getText());
        NewPaci.setEncargado(this.txtEncargado.getText());
        NewPaci.setTelefono_encargado(this.txtTelefonoEncargado.getText());
        NewPaci.setDireccion(this.txtDireccion.getText());
        NewPaci.setDui(this.txtDUI.getText());
        NewPaci.setFecha_nacimiento(this.dcFechaNac.getDate());
        switch (this.cmbSexo.getSelectedIndex()) {
            case 0:
                NewPaci.setSexo('F');
                break;
            case 1:
                NewPaci.setSexo('M');
                break;
            default:
                NewPaci.setSexo('N');
                break;
        }
        switch (this.cmbEstadoCivil.getSelectedIndex()) {
            case 1:
                NewPaci.setEstado_civil('S');
                break;
            case 2:
                NewPaci.setEstado_civil('C');
                break;
            case 3:
                NewPaci.setEstado_civil('A');
                break;
            case 4:
                NewPaci.setEstado_civil('D');
                break;
            default:
                NewPaci.setEstado_civil('E');
                break;
        }
        NewPaci.UpdatePaciente(NewPaci, conn);
        this.Clean();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnCancela;
    private rojeru_san.RSButton btnGuardar;
    private rojeru_san.RSButton btnImprimir;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSComboMetro cmbEstadoCivil;
    private rojerusan.RSComboMetro cmbSexo;
    private com.toedter.calendar.JDateChooser dcFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblPuesto1;
    private javax.swing.JLabel lblPuesto2;
    private javax.swing.JLabel lblPuesto3;
    private javax.swing.JLabel lblPuesto4;
    private javax.swing.JLabel lblPuesto5;
    private javax.swing.JLabel lblPuesto6;
    private javax.swing.JLabel lblPuesto7;
    private javax.swing.JLabel lblPuesto8;
    private rojeru_san.RSMTextFull rSMTextFull6;
    private rojeru_san.complementos.RSTableMetro tblPacientes;
    private rojeru_san.RSMTextFull txtApellido;
    private rojeru_san.RSMTextFull txtDUI;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtEncargado;
    private javax.swing.JTextField txtIdPaciente;
    private rojeru_san.RSMTextFull txtNombre;
    private javax.swing.JLabel txtNombre3;
    private rojeru_san.RSMTextFull txtNombreFiltro;
    private rojeru_san.RSMTextFull txtTelefono;
    private rojeru_san.RSMTextFull txtTelefonoEncargado;
    // End of variables declaration//GEN-END:variables
}
