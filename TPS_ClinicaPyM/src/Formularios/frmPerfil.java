
package Formularios;

import Logica_Negocio.Empleados;
import Logica_Negocio.EmpleadosVista;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;


public class frmPerfil extends javax.swing.JPanel {

    Connection conn;
    Empleados empl;
    EmpleadosVista empV;
    
    public frmPerfil(Empleados emp, Connection conexion) throws SQLException {
        initComponents();
        this.empl = emp;
        this.conn = conexion;
        this.empV = new EmpleadosVista();
        if(emp.getId_emp() != 3){
            empV = empV.getEmpleadoxId(conn, emp.getId_emp());
            this.LlenarCamposDeVista(empV);
        }
    }
    
    public void LlenarCamposDeVista(EmpleadosVista empV){
        this.txtID.setText(String.valueOf(empV.getId_emp()));
        this.txtNombre.setText(empV.getNombreuno());
        this.txtApellido.setText(empV.getApellido());
        this.txtDUI.setText(empV.getDui());
        this.txtTelefono.setText(empV.getTelefono());
        this.txtFechaNac.setText(String.valueOf(empV.getFecha_nacimiento()));
        this.txtPuesto.setText(empV.getPuesto());
        this.txtUsuario.setText(empV.getUsuario());
    }
    public void LlenarCampos(Empleados emp){
        this.txtID.setText(String.valueOf(emp.getId_emp()));
        this.txtNombre.setText(emp.getNombre());
        this.txtApellido.setText(emp.getApellido());
        this.txtDUI.setText(emp.getDui());
        this.txtTelefono.setText(emp.getTelefono());
        this.txtFechaNac.setText(String.valueOf(emp.getFechaNacimiento()));
        this.txtPuesto.setText("Administrador de sistema");
        this.txtUsuario.setText(empV.getUsuario());
        this.txtPassword.setText("");
    }
    
    public void ActualizarDatos(){
        
        Empleados emp = new Empleados();
        emp.setNombre(this.txtNombre.getText());
        emp.setApellido(this.txtApellido.getText());
        emp.setDui(this.txtDUI.getText());
        emp.setTelefono(this.txtTelefono.getText());
        emp.setUsuario(this.txtUsuario.getText());
        if(!this.txtPassword.getText().isEmpty()){
            emp.setContraseña(this.EncriptarContra(this.txtPassword.getText()));
        }else{
            emp.setContraseña(this.empV.getContraseña());
        }
        emp.setId_emp(Integer.valueOf(this.txtID.getText()));
        emp.setId_puesto(this.empl.getId_puesto());
        emp.setFechaNacimiento(this.empV.getFecha_nacimiento());
        emp.ModificarEmpleado(this.conn);
        this.LlenarCampos(emp);
    }
    
    public String EncriptarContra(String contraseña){
        String encriptada;
        encriptada = DigestUtils.md5Hex(contraseña);
        return encriptada;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreEmpleado = new rojeru_san.RSMTextFull();
        rSLabelAnimated1 = new rojeru_san.rslabel.RSLabelAnimated();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        rSPanel2 = new necesario.RSPanel();
        lblID = new javax.swing.JLabel();
        txtID = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new app.bolivia.swing.JCTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new app.bolivia.swing.JCTextField();
        lblDUI = new javax.swing.JLabel();
        txtDUI = new app.bolivia.swing.JCTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new app.bolivia.swing.JCTextField();
        lblFechaNac = new javax.swing.JLabel();
        txtFechaNac = new app.bolivia.swing.JCTextField();
        txtPuesto = new app.bolivia.swing.JCTextField();
        lblPuesto = new javax.swing.JLabel();
        rSPanel3 = new necesario.RSPanel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new app.bolivia.swing.JCTextField();
        lblContraseña = new javax.swing.JLabel();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        txtPassword = new rojeru_san.rsfield.RSPass();
        rSButtonRoundEffect1 = new rojeru_san.rsbutton.RSButtonRoundEffect();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNombreFiltro = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();

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

        jPanel2.setBackground(new java.awt.Color(231, 156, 194));

        rSPanel2.setBackground(new java.awt.Color(246, 190, 214));
        rSPanel2.setColorBackground(new java.awt.Color(246, 190, 214));

        lblID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblID.setText("ID:");

        txtID.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("DATOS");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.setEditable(false);

        lblApellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        txtApellido.setEditable(false);

        lblDUI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDUI.setText("DUI:");

        txtDUI.setEditable(false);

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefono.setText("Telefono:");

        txtTelefono.setEditable(false);

        lblFechaNac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFechaNac.setText("Fecha Nacimiento:");

        txtFechaNac.setEditable(false);

        txtPuesto.setEditable(false);

        lblPuesto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuesto.setText("Puesto:");

        javax.swing.GroupLayout rSPanel2Layout = new javax.swing.GroupLayout(rSPanel2);
        rSPanel2.setLayout(rSPanel2Layout);
        rSPanel2Layout.setHorizontalGroup(
            rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanel2Layout.createSequentialGroup()
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel2))
                    .addGroup(rSPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanel2Layout.createSequentialGroup()
                                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblID)
                                    .addComponent(lblNombre)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaNac))
                                .addGap(41, 41, 41))
                            .addGroup(rSPanel2Layout.createSequentialGroup()
                                .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)))
                        .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        rSPanel2Layout.setVerticalGroup(
            rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(31, 31, 31)
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDUI)
                    .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(34, 34, 34)
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac))
                .addGap(28, 28, 28)
                .addGroup(rSPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuesto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSPanel3.setColorBackground(new java.awt.Color(246, 190, 214));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("DATOS DE USUARIO");

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        rSButtonRoundEffect1.setBackground(new java.awt.Color(0, 51, 109));
        rSButtonRoundEffect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/actualizar.png"))); // NOI18N
        rSButtonRoundEffect1.setText("ACTUALIZAR");
        rSButtonRoundEffect1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rSButtonRoundEffect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundEffect1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanel3Layout = new javax.swing.GroupLayout(rSPanel3);
        rSPanel3.setLayout(rSPanel3Layout);
        rSPanel3Layout.setHorizontalGroup(
            rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(202, 202, 202))
            .addGroup(rSPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRoundEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        rSPanel3Layout.setVerticalGroup(
            rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(77, 77, 77)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(24, 24, 24)
                .addGroup(rSPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(rSButtonRoundEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(rSPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(rSPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATOS", jPanel2);

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

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "USUARIO", "CONTRASEÑA"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        jScrollPane1.setViewportView(rSTableMetro1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("USUARIO", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1450, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreFiltroKeyTyped
      
    }//GEN-LAST:event_txtNombreFiltroKeyTyped

    private void rSButtonRoundEffect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundEffect1ActionPerformed
        if(this.txtUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo de nombre de usuario debe ir lleno para poder actualizar su usuario");
        }else{
            this.ActualizarDatos();
        }
    }//GEN-LAST:event_rSButtonRoundEffect1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDUI;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private rojeru_san.rsbutton.RSButtonRoundEffect rSButtonRoundEffect1;
    private rojeru_san.rslabel.RSLabelAnimated rSLabelAnimated1;
    private necesario.RSPanel rSPanel2;
    private necesario.RSPanel rSPanel3;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private rojerusan.RSTableMetro rSTableMetro1;
    private app.bolivia.swing.JCTextField txtApellido;
    private app.bolivia.swing.JCTextField txtDUI;
    private app.bolivia.swing.JCTextField txtFechaNac;
    private app.bolivia.swing.JCTextField txtID;
    private app.bolivia.swing.JCTextField txtNombre;
    private rojeru_san.RSMTextFull txtNombreEmpleado;
    private rojeru_san.RSMTextFull txtNombreFiltro;
    private rojeru_san.rsfield.RSPass txtPassword;
    private app.bolivia.swing.JCTextField txtPuesto;
    private app.bolivia.swing.JCTextField txtTelefono;
    private app.bolivia.swing.JCTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
