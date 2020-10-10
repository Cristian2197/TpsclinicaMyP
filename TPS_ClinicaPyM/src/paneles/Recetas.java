/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import Logica_Negocio.ConsultaVista;
import Logica_Negocio.Consultas;
import Logica_Negocio.Empleados;
import java.sql.Connection;
import principal.TextPrompt;
/**
 *
 * @author Gerardo
 */
public class Recetas extends javax.swing.JPanel {

    Connection conn;
    ConsultaVista consult;
    
    public Recetas(Connection conn, ConsultaVista consul) {
        initComponents();
        this.conn = conn;
        this.consult = consul;
        this.LlenarCampos(consul);
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
        btnEliminar2 = new rojeru_san.RSButton();
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
        spnHoras = new javax.swing.JSpinner();
        btnTrasladar = new rojeru_san.RSButton();
        lblFechaIngreso1 = new javax.swing.JLabel();
        spnIdConsulta = new javax.swing.JSpinner();
        lblFechaIngreso2 = new javax.swing.JLabel();
        btnGuardar2 = new rojeru_san.RSButton();
        jPanel1 = new javax.swing.JPanel();
        buscar = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        txtFechaInicio = new rojeru_san.RSMTextFull();
        txtFecha = new rojeru_san.RSMTextFull();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblInventarioMedicina = new rojeru_san.complementos.RSTableMetro();
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
        lstReceta.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Acetaminofen Extra Fuerte: 1 - 12 Horas", "Dolofín: 1 - 8 Horas", "PalaGrip: 1 - 12 Horas", "Dorival: 1  - 8 Horas" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstReceta);

        btnGuardar1.setBackground(new java.awt.Color(255, 0, 51));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_121896 (2).png"))); // NOI18N
        btnGuardar1.setText("CANCELAR");

        btnEliminar2.setBackground(new java.awt.Color(51, 109, 136));
        btnEliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/ELIMINAR1.png"))); // NOI18N
        btnEliminar2.setText("ELIMINAR");

        btnImprimir1.setBackground(new java.awt.Color(51, 109, 136));
        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/IMPRIMIR2.png"))); // NOI18N
        btnImprimir1.setText("IMPRIMIR");

        jPanel3.setBackground(new java.awt.Color(246, 190, 214));

        txtNombrePaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePaciActionPerformed(evt);
            }
        });

        lblFechaIngreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaIngreso.setText("Fecha:");

        lblMedicina.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMedicina.setText("Medicina");

        cmdMedicina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acetaminofen", "Loratadina", "Ibuprofeno", "Trimetropin" }));
        cmdMedicina.setColorArrow(new java.awt.Color(51, 109, 136));
        cmdMedicina.setColorBorde(new java.awt.Color(51, 109, 136));
        cmdMedicina.setColorFondo(new java.awt.Color(51, 109, 136));
        cmdMedicina.setColorSeleccion(new java.awt.Color(51, 109, 136));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Unidades: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Horas:");

        spnHoras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnTrasladar.setBackground(new java.awt.Color(246, 190, 214));
        btnTrasladar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrowrigth.png"))); // NOI18N

        lblFechaIngreso1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaIngreso1.setText("Paciente:");

        spnIdConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblFechaIngreso2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaIngreso2.setText("Consulta:");

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
                        .addComponent(cmdMedicina, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnUnidades)
                            .addComponent(spnHoras)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaIngreso)
                            .addComponent(lblFechaIngreso1)
                            .addComponent(lblFechaIngreso2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombrePaci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcFechaN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnIdConsulta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedicina))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(spnUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        btnGuardar2.setBackground(new java.awt.Color(51, 109, 136));
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Guardar.png"))); // NOI18N
        btnGuardar2.setText("GUARDAR");

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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear nueva", jPanel2);

        jPanel1.setBackground(new java.awt.Color(246, 190, 214));

        buscar.setBackground(new java.awt.Color(246, 190, 214));
        buscar.setForeground(new java.awt.Color(51, 109, 136));
        buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscar.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        txtFechaInicio.setText("Fecha inicio");

        txtFecha.setText("Fecha");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        tblInventarioMedicina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Juan Perez", "22/08/2020", "16:15", ""},
                {"Ana Estrada", "14/08/2020", "13:00", ""},
                {null, "", null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Fecha", "Hora", "Accion"
            }
        ));
        tblInventarioMedicina.setAlignmentX(1.5F);
        tblInventarioMedicina.setAlignmentY(1.5F);
        tblInventarioMedicina.setAltoHead(75);
        tblInventarioMedicina.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblInventarioMedicina.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblInventarioMedicina.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblInventarioMedicina.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblInventarioMedicina.setDropMode(javax.swing.DropMode.ON);
        tblInventarioMedicina.setFuenteFilas(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblInventarioMedicina.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblInventarioMedicina.setFuenteHead(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tblInventarioMedicina.setGridColor(new java.awt.Color(255, 255, 255));
        tblInventarioMedicina.setGrosorBordeHead(0);
        tblInventarioMedicina.setRowHeight(35);
        tblInventarioMedicina.setSelectionBackground(new java.awt.Color(231, 156, 194));
        jScrollPane4.setViewportView(tblInventarioMedicina);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(577, 577, 577))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Ver todas", jPanel1);

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

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnEliminar1;
    private rojeru_san.RSButton btnEliminar2;
    private rojeru_san.RSButton btnGuardar1;
    private rojeru_san.RSButton btnGuardar2;
    private rojeru_san.RSButton btnImprimir1;
    private rojeru_san.RSButton btnTrasladar;
    private rojeru_san.RSMTextFull buscar;
    private rojerusan.RSComboMetro cmdMedicina;
    private com.toedter.calendar.JDateChooser dcFechaN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaIngreso1;
    private javax.swing.JLabel lblFechaIngreso2;
    private javax.swing.JLabel lblMedicina;
    private javax.swing.JList<String> lstReceta;
    private javax.swing.JSpinner spnHoras;
    private javax.swing.JSpinner spnIdConsulta;
    private javax.swing.JSpinner spnUnidades;
    private rojeru_san.complementos.RSTableMetro tblInventarioMedicina;
    private rojeru_san.RSMTextFull txtFecha;
    private rojeru_san.RSMTextFull txtFechaInicio;
    private rojeru_san.RSMTextFull txtNombrePaci;
    // End of variables declaration//GEN-END:variables
}
