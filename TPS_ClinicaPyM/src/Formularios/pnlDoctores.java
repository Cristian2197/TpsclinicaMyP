
package Formularios;

import Logica_Negocio.Especialidad;
import Logica_Negocio.Empleados;
import Logica_Negocio.EmpleadosVista;
import Logica_Negocio.Paciente;
import Logica_Negocio.TipoConsulta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.commons.codec.digest.DigestUtils;



public class pnlDoctores extends javax.swing.JPanel {
    Connection conn;
    Empleados emp = new Empleados();
    EmpleadosVista empV = new EmpleadosVista();
    ArrayList<EmpleadosVista> empListaV = new ArrayList<>();
    DefaultTableModel model;
    TipoConsulta tp = new TipoConsulta();
    ArrayList<TipoConsulta> Datos = new ArrayList<>();
    
    public pnlDoctores(Connection conn, Empleados emp) throws SQLException {
        initComponents();
        this.conn = conn;
        this.emp = emp;
        this.btnEliminar1.setEnabled(false);
        
        this.LlenarTabla();
        this.LlenarComboTiposCamb();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new rojeru_san.complementos.RSTableMetro();
        PUESTO = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JLabel();
        txtApellidoEmpleado = new rojeru_san.RSMTextFull();
        txtNombre1 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JLabel();
        cmbPuesto = new rojerusan.RSComboMetro();
        txtNombre4 = new javax.swing.JLabel();
        txtNombre5 = new javax.swing.JLabel();
        txtNombre6 = new javax.swing.JLabel();
        txtDui = new rojeru_san.RSMTextFull();
        txtTelefono = new rojeru_san.RSMTextFull();
        txtNombre7 = new javax.swing.JLabel();
        txtNombre8 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        txtContraseña = new rojeru_san.RSMPassView();
        txtNombreEmpleado = new rojeru_san.RSMTextFull();
        btnGuardar1 = new rojeru_san.RSButton();
        btnGuardar2 = new rojeru_san.RSButton();
        txtIdEmpleado = new javax.swing.JTextField();
        txtNombre9 = new javax.swing.JLabel();
        cmbTipoConsulta = new rojerusan.RSComboMetro();
        txtUsuario = new rojeru_san.RSMTextFull();
        txtNombre10 = new javax.swing.JLabel();
        btnEliminar1 = new rojeru_san.RSButton();
        jPanel6 = new javax.swing.JPanel();
        rSMTextFull3 = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpledosUser = new rojeru_san.complementos.RSTableMetro();

        txtNombre3.setText("Nombre: ");

        rSMTextFull6.setText("rSMTextFull2");

        setMinimumSize(new java.awt.Dimension(25, 26));

        jPanel1.setBackground(new java.awt.Color(29, 27, 56));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 156, 194));
        jLabel1.setText("DOCTORES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(709, 709, 709))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
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

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Puesto", "Especialidad", "Telefono", "DUI", "Fecha de nacimiento"
            }
        ));
        tblEmpleado.setAlignmentX(1.5F);
        tblEmpleado.setAlignmentY(1.5F);
        tblEmpleado.setAltoHead(75);
        tblEmpleado.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblEmpleado.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblEmpleado.setFuenteFilas(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblEmpleado.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblEmpleado.setFuenteHead(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tblEmpleado.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmpleado.setGrosorBordeHead(0);
        tblEmpleado.setRowHeight(35);
        tblEmpleado.setSelectionBackground(new java.awt.Color(231, 156, 194));
        jScrollPane1.setViewportView(tblEmpleado);
        if (tblEmpleado.getColumnModel().getColumnCount() > 0) {
            tblEmpleado.getColumnModel().getColumn(0).setHeaderValue("Codigo");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VER", jPanel2);

        PUESTO.setBackground(new java.awt.Color(246, 190, 214));

        jPanel5.setBackground(new java.awt.Color(246, 190, 214));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre.setText("Apellido:");

        txtApellidoEmpleado.setForeground(new java.awt.Color(51, 109, 136));
        txtApellidoEmpleado.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtApellidoEmpleado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNombre1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre1.setText("Puesto:");

        txtNombre2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre2.setText("Nombre: ");

        cmbPuesto.setBackground(new java.awt.Color(51, 109, 136));
        cmbPuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opción", "Doctor", "Secretaria" }));
        cmbPuesto.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbPuesto.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbPuesto.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbPuesto.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbPuesto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNombre4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre4.setText("Especialidad:");

        txtNombre5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre5.setText("DUI:");

        txtNombre6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre6.setText("Fecha de nacimiento: ");

        txtDui.setForeground(new java.awt.Color(51, 109, 136));
        txtDui.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtDui.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtTelefono.setForeground(new java.awt.Color(51, 109, 136));
        txtTelefono.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtTelefono.setBotonColor(new java.awt.Color(51, 109, 136));
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNombre7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre7.setText("Telefono:");

        txtNombre8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre8.setText("Contraseña:");

        dcFecha.setBackground(new java.awt.Color(51, 109, 136));
        dcFecha.setForeground(new java.awt.Color(255, 255, 255));

        txtContraseña.setForeground(new java.awt.Color(51, 109, 136));
        txtContraseña.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtContraseña.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNombreEmpleado.setForeground(new java.awt.Color(51, 109, 136));
        txtNombreEmpleado.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtNombreEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnGuardar1.setBackground(new java.awt.Color(51, 109, 136));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Guardar.png"))); // NOI18N
        btnGuardar1.setText("GUARDAR");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnGuardar2.setBackground(new java.awt.Color(255, 0, 51));
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_121896 (2).png"))); // NOI18N
        btnGuardar2.setText("CANCELAR");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        txtIdEmpleado.setEnabled(false);

        txtNombre9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre9.setText("ID:");

        cmbTipoConsulta.setBackground(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Doctor", "Secretaria" }));
        cmbTipoConsulta.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtUsuario.setForeground(new java.awt.Color(51, 109, 136));
        txtUsuario.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtUsuario.setBotonColor(new java.awt.Color(51, 109, 136));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNombre10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre10.setText("Usuario");

        btnEliminar1.setBackground(new java.awt.Color(51, 109, 136));
        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/ELIMINAR1.png"))); // NOI18N
        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtNombre6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombre9)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(txtNombre4)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(txtNombre5)
                                    .addGap(32, 32, 32)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(cmbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50))
                                .addComponent(txtDui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(txtNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre8)
                            .addComponent(txtNombre10))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(246, 190, 214));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        rSMTextFull3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        tblEmpledosUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puesto", "Telefono", "DUI"
            }
        ));
        tblEmpledosUser.setAlignmentX(1.5F);
        tblEmpledosUser.setAlignmentY(1.5F);
        tblEmpledosUser.setAltoHead(75);
        tblEmpledosUser.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblEmpledosUser.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblEmpledosUser.setFuenteFilas(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblEmpledosUser.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblEmpledosUser.setFuenteHead(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tblEmpledosUser.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmpledosUser.setGrosorBordeHead(0);
        tblEmpledosUser.setRowHeight(35);
        tblEmpledosUser.setSelectionBackground(new java.awt.Color(231, 156, 194));
        tblEmpledosUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpledosUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmpledosUser);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rSMTextFull3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout PUESTOLayout = new javax.swing.GroupLayout(PUESTO);
        PUESTO.setLayout(PUESTOLayout);
        PUESTOLayout.setHorizontalGroup(
            PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PUESTOLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        PUESTOLayout.setVerticalGroup(
            PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUESTOLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESAR", PUESTO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Ver");
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        frmProbando llamada = new frmProbando ();
        llamada.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        this.LimpiarCampos();
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if(this.txtIdEmpleado.getText().isEmpty()){
            try {
                this.GuardarEmpleado();
            } catch (SQLException ex) {
                Logger.getLogger(pnlDoctores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                this.ActualizarEmpleado();
            } catch (SQLException ex) {
                Logger.getLogger(pnlDoctores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void tblEmpledosUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpledosUserMouseClicked
        ArrayList<EmpleadosVista> empL = new ArrayList<>();
        int index = this.tblEmpledosUser.getSelectedRow();
        
        if(this.tblEmpledosUser.getRowCount() == this.empListaV.size()){
            EmpleadosVista emp = this.empListaV.get(index);
            this.LlenarCampos(emp);
        }else{
            String texto = this.rSMTextFull3.getText();
            for (int i = 0; i < this.empListaV.size(); i++) {
                EmpleadosVista c = this.empListaV.get(i);
                if( c.getNombre().toLowerCase().indexOf(texto.toLowerCase()) >= 0){
                    empL.add(c);
                }
            }
            this.LlenarCampos(empL.get(index));
        }
    }//GEN-LAST:event_tblEmpledosUserMouseClicked

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        try {
            Especialidad esp = new Especialidad();
            esp.EliminarEspecialidad(conn, this.empVA.getId_espe());
            this.EliminarEmpleado();
            this.LlenarTabla();
            this.LimpiarCampos();
            
        } catch (SQLException ex) {
            Logger.getLogger(pnlDoctores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

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
        this.tblEmpleado.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreFiltroKeyTyped

    public void GuardarEmpleado() throws SQLException{
        java.util.Date fechaN = this.dcFecha.getDate();
        Date fecha = new Date(fechaN.getTime());
        Especialidad esp = new Especialidad();

        Empleados empV = new Empleados();
        empV.setNombre(this.txtNombreEmpleado.getText());
        empV.setApellido(this.txtApellidoEmpleado.getText());
        empV.setTelefono(this.txtTelefono.getText());
        empV.setFechaNacimiento(fecha);
        empV.setDui(this.txtDui.getText());
        empV.setUsuario(this.txtUsuario.getText());
        empV.setContraseña(this.txtContraseña.getText());
        empV.setId_puesto(this.cmbPuesto.getSelectedIndex());

        int idEmp = empV.InsertarEmpleado(conn);
        esp.setId_emp(idEmp);
        esp.setId_tipo_consul(this.Datos.get(this.cmbTipoConsulta.getSelectedIndex()).getId_tipoConsul());
        esp.InsertarEspecialidad(conn);
        this.LlenarTabla();
        this.LimpiarCampos();
    }
    
    EmpleadosVista empVA;
    public void ActualizarEmpleado() throws SQLException{
        
        java.util.Date fechaN = this.dcFecha.getDate();
        Date fecha = new Date(fechaN.getTime());
        Especialidad esp = new Especialidad();

        Empleados empV = new Empleados();
        empV.setId_emp(Integer.valueOf(this.txtIdEmpleado.getText()));
        empV.setNombre(this.txtNombreEmpleado.getText());
        empV.setApellido(this.txtApellidoEmpleado.getText());
        empV.setTelefono(this.txtTelefono.getText());
        empV.setFechaNacimiento(fecha);
        empV.setDui(this.txtDui.getText());
        empV.setUsuario(this.txtUsuario.getText());
        empV.setId_puesto(this.cmbPuesto.getSelectedIndex());

        if(this.txtContraseña.getText().isEmpty()){
            empV.setContraseña(this.empVA.getContraseña());
        }else{
            String pass = DigestUtils.md5Hex(this.txtContraseña.getText());
            empV.setContraseña(pass);
        }
        
        empV.ModificarEmpleado(conn);
        
        TipoConsulta tp = this.Datos.get(this.cmbTipoConsulta.getSelectedIndex());
        
        if(this.empVA.getId_especialidad()!=tp.getId_tipoConsul()){
            esp.setId_emp(empV.getId_emp());
            esp.setId_tipo_consul(this.Datos.get(this.cmbTipoConsulta.getSelectedIndex()).getId_tipoConsul());
            esp.setId_espe(empVA.getId_espe());
            esp.ModificarEspecialidad(conn);
        }
       
        this.LlenarTabla();
        this.LimpiarCampos();
    }   
    
    public void LlenarTabla() throws SQLException{
        this.empListaV = this.empV.getEmpleados(this.conn);
        
        this.model = new DefaultTableModel();
        
        model.addColumn("Nombre");
        model.addColumn("Puesto");
        model.addColumn("Teléfono");
        model.addColumn("DUI");
       
        for (int i = 0; i < this.empListaV.size(); i++) {
            EmpleadosVista current = this.empListaV.get(i);
            
            model.addRow(new Object[]{
                current.getNombre(),
                current.getPuesto(),
                current.getTelefono(),
                current.getDui()
            });
        }
        this.tblEmpleado.setModel(model);
        this.tblEmpledosUser.setModel(model);
       
    }
    
    public void LlenarComboTiposCamb(){
        
        Datos = tp.getAll(conn);
        
        if(this.cmbTipoConsulta.getItemCount()> 0){
            this.cmbTipoConsulta.removeAllItems();
            
        }
        if(Datos.size() > 0){
            for (int i = 0; i < Datos.size(); i++) {
                TipoConsulta tp = Datos.get(i);
                this.cmbTipoConsulta.addItem(tp.getNombre());
                
            }
        }else{
            this.cmbTipoConsulta.addItem("No hay tipos, registrarlo antes de crear la consulta");
        }
    }
     
    public void LimpiarCampos(){
        this.txtIdEmpleado.setText(null);
        this.txtNombreEmpleado.setText(null);
        this.txtApellidoEmpleado.setText(null);
        this.cmbPuesto.setSelectedIndex(0);
        this.cmbTipoConsulta.setSelectedIndex(0);
        this.txtContraseña.setText(null);
        this.txtUsuario.setText(null);
        this.dcFecha.setDate(null);
        this.txtUsuario.setText(null);
        this.txtTelefono.setText(null);
        this.btnEliminar1.setEnabled(false);
    } 
    
    public void LlenarCampos(EmpleadosVista emp){
        this.empVA = emp;
        this.cmbTipoConsulta.setSelectedIndex(emp.getId_especialidad()-1);
        this.txtIdEmpleado.setText(String.valueOf(emp.getId_emp()));
        this.txtNombreEmpleado.setText(emp.getNombreuno());
        this.txtApellidoEmpleado.setText(emp.getApellido());
        this.cmbPuesto.setSelectedIndex(emp.getId_puesto());
        this.txtDui.setText(emp.getDui());
        this.txtUsuario.setText(emp.getUsuario());
        this.txtTelefono.setText(emp.getTelefono());
        this.dcFecha.setDate(emp.getFecha_nacimiento());
        this.btnEliminar1.setEnabled(true);
    }
    
    public void EliminarEmpleado(){
        int id = Integer.valueOf(this.txtIdEmpleado.getText());
        this.emp.EliminarEmpleados(conn, id);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PUESTO;
    private rojeru_san.RSButton btnEliminar1;
    private rojeru_san.RSButton btnGuardar1;
    private rojeru_san.RSButton btnGuardar2;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSComboMetro cmbPuesto;
    private rojerusan.RSComboMetro cmbTipoConsulta;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private rojeru_san.RSMTextFull rSMTextFull3;
    private rojeru_san.RSMTextFull rSMTextFull6;
    private rojeru_san.complementos.RSTableMetro tblEmpleado;
    private rojeru_san.complementos.RSTableMetro tblEmpledosUser;
    private rojeru_san.RSMTextFull txtApellidoEmpleado;
    private rojeru_san.RSMPassView txtContraseña;
    private rojeru_san.RSMTextFull txtDui;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtNombre10;
    private javax.swing.JLabel txtNombre2;
    private javax.swing.JLabel txtNombre3;
    private javax.swing.JLabel txtNombre4;
    private javax.swing.JLabel txtNombre5;
    private javax.swing.JLabel txtNombre6;
    private javax.swing.JLabel txtNombre7;
    private javax.swing.JLabel txtNombre8;
    private javax.swing.JLabel txtNombre9;
    private rojeru_san.RSMTextFull txtNombreEmpleado;
    private rojeru_san.RSMTextFull txtNombreFiltro;
    private rojeru_san.RSMTextFull txtTelefono;
    private rojeru_san.RSMTextFull txtUsuario;
    // End of variables declaration//GEN-END:variables
}
