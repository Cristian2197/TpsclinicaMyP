/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import Logica_Negocio.Empleados;
import Logica_Negocio.Medicina;
import Logica_Negocio.MedicinaVista;
import Logica_Negocio.Valor_Presentacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import principal.TextPrompt;


public class pnlMedicina extends javax.swing.JPanel {

    Empleados emp;
    Connection conn;
    MedicinaVista medVista = new MedicinaVista();
    ArrayList<MedicinaVista> medVistaL = new ArrayList<>();
    DefaultTableModel model;
    Valor_Presentacion valorP = new Valor_Presentacion();
    Medicina medL = new Medicina();
    
    public pnlMedicina(Connection conn, Empleados emp) {
        initComponents();
        this.conn = conn;
        this.emp = emp;
        this.LlenarComboPresentacion(valorP.AllPresentacion(this.conn));
        this.LlenarTabla();
        this.LlenarTablaMedicinaInv();
     /*    TextPrompt FiltroNuevo = new TextPrompt("Nombre de medicina", this.txtFiltroN);
        TextPrompt Nombre = new TextPrompt("Nombre de medicina", this.txtNombre);
        TextPrompt PrecioCompra = new TextPrompt("Precio Compra", this.txtPrecioCompra);
        TextPrompt PrecioVenta = new TextPrompt("Precio Venta", this.txtPrecioVenta);
        TextPrompt Presentacion = new TextPrompt("Presentación", this.txtPresentacion);*/
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNombre3 = new javax.swing.JLabel();
        rSMTextFull6 = new rojeru_san.RSMTextFull();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtNombreFiltro = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMedicina = new rojeru_san.complementos.RSTableMetro();
        PUESTO = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnGuardar1 = new rojeru_san.RSButton();
        lblNombre = new javax.swing.JLabel();
        lblPresentacion = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new rojeru_san.RSMTextFull();
        txtPrecioCompra = new rojeru_san.RSMTextFull();
        txtPrecioVenta = new rojeru_san.RSMTextFull();
        spnCantidad = new javax.swing.JSpinner();
        btnGuardar2 = new rojeru_san.RSButton();
        txtIdMedicina = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbPresentacion = new rojerusan.RSComboMetro();
        jPanel6 = new javax.swing.JPanel();
        txtFiltroNombre = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblInventarioMedicina1 = new rojeru_san.complementos.RSTableMetro();

        txtNombre3.setText("Nombre: ");

        rSMTextFull6.setText("rSMTextFull2");

        setMinimumSize(new java.awt.Dimension(25, 26));

        jPanel1.setBackground(new java.awt.Color(29, 27, 56));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 156, 194));
        jLabel1.setText("MEDICINA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(569, 569, 569)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.setBackground(new java.awt.Color(246, 190, 214));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(246, 190, 214));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        tblMedicina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Presentación", "Precio Venta", "Precio Compra", "Cantidad"
            }
        ));
        tblMedicina.setAlignmentX(1.5F);
        tblMedicina.setAlignmentY(1.5F);
        tblMedicina.setAltoHead(75);
        tblMedicina.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblMedicina.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblMedicina.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblMedicina.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblMedicina.setFuenteFilas(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblMedicina.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblMedicina.setFuenteHead(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tblMedicina.setGridColor(new java.awt.Color(255, 255, 255));
        tblMedicina.setGrosorBordeHead(0);
        tblMedicina.setRowHeight(35);
        tblMedicina.setSelectionBackground(new java.awt.Color(231, 156, 194));
        jScrollPane3.setViewportView(tblMedicina);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VER", jPanel2);

        PUESTO.setBackground(new java.awt.Color(246, 190, 214));

        jPanel5.setBackground(new java.awt.Color(246, 190, 214));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGuardar1.setBackground(new java.awt.Color(51, 109, 136));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Guardar.png"))); // NOI18N
        btnGuardar1.setText("GUARDAR");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setName(""); // NOI18N

        lblPresentacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPresentacion.setText("Presentación:");
        lblPresentacion.setName(""); // NOI18N

        lblPrecioCompra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecioCompra.setText("Precio Compra:");
        lblPrecioCompra.setName(""); // NOI18N

        lblPrecioVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecioVenta.setText("Precio Venta:");
        lblPrecioVenta.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad:");
        jLabel5.setName(""); // NOI18N

        txtNombre.setForeground(new java.awt.Color(51, 109, 136));
        txtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtPrecioCompra.setForeground(new java.awt.Color(51, 109, 136));
        txtPrecioCompra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtPrecioVenta.setForeground(new java.awt.Color(51, 109, 136));
        txtPrecioVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        spnCantidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnGuardar2.setBackground(new java.awt.Color(255, 0, 51));
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_121896 (2).png"))); // NOI18N
        btnGuardar2.setText("CANCELAR");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        txtIdMedicina.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtIdMedicina.setAutoscrolls(false);
        txtIdMedicina.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Id de medicina:");
        jLabel6.setName(""); // NOI18N

        cmbPresentacion.setBackground(new java.awt.Color(51, 109, 136));
        cmbPresentacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Soltero", "Casado", "Acompañado", "Divorciado" }));
        cmbPresentacion.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbPresentacion.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbPresentacion.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbPresentacion.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbPresentacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblPresentacion))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblPrecioVenta)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioCompra))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPresentacion))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioCompra)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel6.setBackground(new java.awt.Color(246, 190, 214));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtFiltroNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroNombreActionPerformed(evt);
            }
        });
        txtFiltroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroNombreKeyTyped(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        tblInventarioMedicina1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Presentación", "Precio Venta", "Precio Compra", "Cantidad"
            }
        ));
        tblInventarioMedicina1.setAlignmentX(1.5F);
        tblInventarioMedicina1.setAlignmentY(1.5F);
        tblInventarioMedicina1.setAltoHead(75);
        tblInventarioMedicina1.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblInventarioMedicina1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblInventarioMedicina1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblInventarioMedicina1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblInventarioMedicina1.setFuenteFilas(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblInventarioMedicina1.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblInventarioMedicina1.setFuenteHead(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tblInventarioMedicina1.setGridColor(new java.awt.Color(255, 255, 255));
        tblInventarioMedicina1.setGrosorBordeHead(0);
        tblInventarioMedicina1.setRowHeight(35);
        tblInventarioMedicina1.setSelectionBackground(new java.awt.Color(231, 156, 194));
        tblInventarioMedicina1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMedicina1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblInventarioMedicina1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtFiltroNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PUESTOLayout = new javax.swing.GroupLayout(PUESTO);
        PUESTO.setLayout(PUESTOLayout);
        PUESTOLayout.setHorizontalGroup(
            PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUESTOLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PUESTOLayout.setVerticalGroup(
            PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUESTOLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESAR", PUESTO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Ver");
    }// </editor-fold>//GEN-END:initComponents

    public void LlenarTabla(){
        this.medVistaL = this.medVista.getMedicinafromVista(conn);
        this.model = new DefaultTableModel();
        
        model.addColumn("Nombre");
        model.addColumn("Presentación");
        model.addColumn("Precio Venta");
        model.addColumn("Precio Compra");
        model.addColumn("Cantidad");
         for (int i = 0; i < this.medVistaL.size(); i++) {
            MedicinaVista current = this.medVistaL.get(i);
            model.addRow(new Object[]{
                current.getNombre(),
                current.getPresentacionCom(),
                current.getPrecio_venta(),
                current.getPrecio_compra(),
                current.getCantidad()
            });
        }
        this.tblMedicina.setModel(model);
    }
    
    public void LlenarTablaMedicinaInv(){
        this.medVistaL = this.medVista.getMedicinafromVista(conn);
        this.model = new DefaultTableModel();
        
        model.addColumn("Nombre");
        model.addColumn("Presentación");
        model.addColumn("Precio Venta");
        model.addColumn("Precio Compra");
        model.addColumn("Cantidad");
         for (int i = 0; i < this.medVistaL.size(); i++) {
            MedicinaVista current = this.medVistaL.get(i);
            model.addRow(new Object[]{
                current.getNombre(),
                current.getPresentacionCom(),
                current.getPrecio_venta(),
                current.getPrecio_compra(),
                current.getCantidad()
            });
        }
        this.tblInventarioMedicina1.setModel(model);
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        frmProbando llamada = new frmProbando ();
        llamada.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtFiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroNombreActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        this.Limpiar();
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    TableRowSorter trs;
    private void txtNombreFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreFiltroKeyTyped
        this.txtNombreFiltro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtNombreFiltro.getText(), 0));          
            }
        });
        trs = new TableRowSorter(this.model);
        this.tblMedicina.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreFiltroKeyTyped

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        Medicina med = new Medicina();
        if(this.txtIdMedicina.getText().isEmpty()){
            this.GuardarMedicina(med);
        }else{
            this.ActualizarMedicina(med);
        }
        this.Limpiar();
        this.LlenarTablaMedicinaInv();
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtFiltroNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroNombreKeyTyped
        this.txtFiltroNombre.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtFiltroNombre.getText(), 0));          
            }
        });
        trs = new TableRowSorter(this.model);
        this.tblInventarioMedicina1.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroNombreKeyTyped

    private void tblInventarioMedicina1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMedicina1MouseClicked
        int index = this.tblInventarioMedicina1.getSelectedRow();
        ArrayList<MedicinaVista> medLocal = new ArrayList<>();
        if(this.tblInventarioMedicina1.getRowCount() == this.medVistaL.size()){
            MedicinaVista medv = this.medVistaL.get(index);
            this.LlenarCampos(medv);
        }else{
            String texto = this.txtFiltroNombre.getText();
            for (int i = 0; i < this.medVistaL.size(); i++) {
                MedicinaVista c = this.medVistaL.get(i);
                if( c.getNombre().toLowerCase().indexOf(texto.toLowerCase()) >= 0){
                    medLocal.add(c);
                }
            }
            this.LlenarCampos(medLocal.get(index));
        }
    }//GEN-LAST:event_tblInventarioMedicina1MouseClicked
    
    public void Limpiar(){
        this.txtIdMedicina.setText(null);
        this.txtNombre.setText(null);
        this.txtPrecioCompra.setText(null);
        this.txtPrecioVenta.setText(null);
        this.cmbPresentacion.setSelectedIndex(0);
        this.spnCantidad.setValue(0);
    }
    
    public int IdPresentacion(){
        int retorno;
        if(this.cmbPresentacion.getSelectedIndex() != 0){
            retorno = this.cmbPresentacion.getSelectedIndex();
            
        }else{
            retorno = -1;
        }
        return retorno;
    }
    
    public void GuardarMedicina(Medicina med){
        med.setNombre(this.txtNombre.getText());
        med.setPrecio_compra(Double.valueOf(this.txtPrecioCompra.getText()));
        med.setPrecio_venta(Double.valueOf(this.txtPrecioVenta.getText()));
        med.setId_pres(this.IdPresentacion());
        med.setPresentacion(Double.valueOf(this.spnCantidad.getValue().toString()));
        med.setStock(Double.valueOf(this.spnCantidad.getValue().toString()));
        this.medL.PostMedicina(conn, med);
    }
    
    MedicinaVista medAct;
    public void LlenarCampos(MedicinaVista med){
        this.medAct = med;
        this.txtIdMedicina.setText(String.valueOf(med.getId_med()));
        this.txtNombre.setText(med.getNombre());
        this.txtPrecioCompra.setText(String.valueOf(med.getPrecio_compra()));
        this.txtPrecioVenta.setText(String.valueOf(med.getPrecio_venta()));
        this.spnCantidad.setValue(med.getPresentacion());
        this.cmbPresentacion.setSelectedIndex(med.getId_pres());
    }
    
    private void LlenarComboPresentacion(ArrayList<Valor_Presentacion> Datos){
        if(this.cmbPresentacion.getItemCount()> 0){
            this.cmbPresentacion.removeAllItems();
            
        }
        if(Datos.size() > 0){
            this.cmbPresentacion.addItem("Seleccione la presentación");
            for (int i = 0; i < Datos.size(); i++) {
                Valor_Presentacion vp = Datos.get(i);
                String campo=vp.getNombre();
                this.cmbPresentacion.addItem(campo);
            }
        }else{
            this.cmbPresentacion.addItem("No hay presentaciones");
        }
    }
    
    public void ActualizarMedicina(Medicina med){
        med.setId_med(Integer.valueOf(this.txtIdMedicina.getText()));
        med.setNombre(this.txtNombre.getText());
        med.setPrecio_compra(Double.valueOf(this.txtPrecioCompra.getText()));
        med.setPrecio_venta(Double.valueOf(this.txtPrecioVenta.getText()));
        med.setId_pres(this.IdPresentacion());
        med.setPresentacion(Double.valueOf(this.spnCantidad.getValue().toString()));
        double stock = med.getPresentacion() + this.medAct.getCantidad();
        med.setStock(stock);
        this.medL.UpdateMedicina(conn, med);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PUESTO;
    private rojeru_san.RSButton btnGuardar1;
    private rojeru_san.RSButton btnGuardar2;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSComboMetro cmbPresentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblPresentacion;
    private rojeru_san.RSMTextFull rSMTextFull6;
    private javax.swing.JSpinner spnCantidad;
    private rojeru_san.complementos.RSTableMetro tblInventarioMedicina1;
    private rojeru_san.complementos.RSTableMetro tblMedicina;
    private rojeru_san.RSMTextFull txtFiltroNombre;
    private javax.swing.JTextField txtIdMedicina;
    private rojeru_san.RSMTextFull txtNombre;
    private javax.swing.JLabel txtNombre3;
    private rojeru_san.RSMTextFull txtNombreFiltro;
    private rojeru_san.RSMTextFull txtPrecioCompra;
    private rojeru_san.RSMTextFull txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
