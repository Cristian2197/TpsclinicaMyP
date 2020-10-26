
package Formularios;

import Formularios.CambiaPanel;
import Logica_Negocio.ConsultaVista;
import Logica_Negocio.Consultas;
import java.sql.Connection;
import Logica_Negocio.Empleados;
import Logica_Negocio.Paciente;
import Logica_Negocio.TipoConsulta;
import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.RowFilter;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class pnlConsulta extends javax.swing.JPanel {
    
    Connection conn;
    Empleados empleado;
    Consultas cons;
    Paciente paci = new Paciente();
    ConsultaVista cv = new ConsultaVista();
    TipoConsulta tpc = new TipoConsulta();
    ArrayList<Paciente> pacientes = new ArrayList<>();
    ArrayList<Empleados> empList = new ArrayList<>();
    ArrayList<TipoConsulta> tipoLst = new ArrayList<>();
    ArrayList<Consultas> consLst = new ArrayList<>();
    ArrayList<ConsultaVista> conView = new ArrayList<>();
    JPanel pnlPrincipal;
    public pnlConsulta(Connection con, Empleados emp, JPanel pnel) throws SQLException {
        initComponents();
        this.conn = con;
        this.empleado = emp;
        this.pnlPrincipal = pnel;
        this.InicializarCampos();
    }

    private void LlenarComboPaciente(ArrayList<Paciente> Datos){
        if(this.cmbPacientes.getItemCount()> 0){
            this.cmbPacientes.removeAllItems();
            
        }
        if(Datos.size() > 0){
            this.cmbPacientes.addItem("Seleccione al paciente");
            for (int i = 0; i < Datos.size(); i++) {
                Paciente pacie = Datos.get(i);
                String campo=pacie.getNombre() + " " + pacie.getApellido();
                this.cmbPacientes.addItem(campo);
            }
        }else{
            this.cmbPacientes.addItem("No hay paciestes, registrarlo antes de crear la consulta");
        }
    }
    
    private void LlenarComboDoctores(ArrayList<Empleados> Datos){
        if(this.cmbDoctores.getItemCount()> 0){
            this.cmbDoctores.removeAllItems();
            
        }
        if(Datos.size() > 0){
            this.cmbDoctores.addItem("Seleccione al doctor");
            for (int i = 0; i < Datos.size(); i++) {
                Empleados emp = Datos.get(i);
                String campo=emp.getNombre() + " " + emp.getApellido();
                this.cmbDoctores.addItem(campo);
            }
        }else{
            this.cmbDoctores.addItem("No hay doctores, registrarlo antes de crear la consulta");
        }
    }
    
     private void LlenarComboDoctoresCamb(ArrayList<Empleados> Datos){
        if(this.cmbDoctoresDisp.getItemCount()> 0){
            this.cmbDoctoresDisp.removeAllItems();
            
        }
        if(Datos.size() > 0){
            this.cmbDoctoresDisp.addItem("Seleccione al doctor");
            for (int i = 0; i < Datos.size(); i++) {
                Empleados emp = Datos.get(i);
                String campo=emp.getNombre() + " " + emp.getApellido();
                this.cmbDoctoresDisp.addItem(campo);
            }
        }else{
            this.cmbDoctoresDisp.addItem("No hay doctores, registrarlo antes de crear la consulta");
        }
    }
    
    public void LlenarComboTipos(ArrayList<TipoConsulta> Datos){
        if(this.cmbTipoConsulta.getItemCount()> 0){
            this.cmbTipoConsulta.removeAllItems();
            
        }
        if(Datos.size() > 0){
            this.cmbTipoConsulta.addItem("Seleccione el tipo");
            for (int i = 0; i < Datos.size(); i++) {
                TipoConsulta tp = Datos.get(i);
                this.cmbTipoConsulta.addItem(tp.getNombre());
                
            }
        }else{
            this.cmbTipoConsulta.addItem("No hay tipos, registrarlo antes de crear la consulta");
        }
    }
    
    public void LlenarComboTiposCamb(ArrayList<TipoConsulta> Datos){
        if(this.cmbConsultaTipo.getItemCount()> 0){
            this.cmbConsultaTipo.removeAllItems();
            
        }
        if(Datos.size() > 0){
            this.cmbConsultaTipo.addItem("Seleccione el tipo");
            for (int i = 0; i < Datos.size(); i++) {
                TipoConsulta tp = Datos.get(i);
                this.cmbConsultaTipo.addItem(tp.getNombre());
                
            }
        }else{
            this.cmbConsultaTipo.addItem("No hay tipos, registrarlo antes de crear la consulta");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="NO ABRIR">       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        rSMTextFull11 = new rojeru_san.RSMTextFull();
        rSMTextFull13 = new rojeru_san.RSMTextFull();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PUESTO = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtHora = new rojeru_san.RSMTextFull();
        rSComboMetro3 = new rojerusan.RSComboMetro();
        rSButton3 = new rojeru_san.RSButton();
        cmbEstado = new rojerusan.RSComboMetro();
        cmbDoctores = new rojerusan.RSComboMetro();
        cmbTipoConsulta = new rojerusan.RSComboMetro();
        rSButton4 = new rojeru_san.RSButton();
        dcFecha = new com.toedter.calendar.JDateChooser();
        cmbPacientes = new rojerusan.RSComboMetro();
        jLabel24 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtNombreFiltro = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllConsultas = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombrePaciente = new rojeru_san.RSMTextFull();
        txtHoraCambio = new rojeru_san.RSMTextFull();
        txtTotalCambio = new rojeru_san.RSMTextFull();
        rSComboMetro2 = new rojerusan.RSComboMetro();
        txtEstadoConsulta = new rojeru_san.RSMTextFull();
        cmbDoctoresDisp = new rojerusan.RSComboMetro();
        cmbConsultaTipo = new rojerusan.RSComboMetro();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        btnGuardar1 = new rojeru_san.RSButton();
        dcFechaCamb = new com.toedter.calendar.JDateChooser();
        txtIdConsulta = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnEliminar = new rojeru_san.RSButton();
        btnImprimir1 = new rojeru_san.RSButton();
        rSButton5 = new rojeru_san.RSButton();

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Paciente:");

        rSMTextFull11.setForeground(new java.awt.Color(51, 109, 136));
        rSMTextFull11.setText("rSMTextFull8");
        rSMTextFull11.setBordeColorFocus(new java.awt.Color(51, 109, 136));

        rSMTextFull13.setForeground(new java.awt.Color(51, 109, 136));
        rSMTextFull13.setText("rSMTextFull8");
        rSMTextFull13.setBordeColorFocus(new java.awt.Color(51, 109, 136));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 27, 56));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 156, 194));
        jLabel1.setText("NUEVA CONSULTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jLabel1)
                .addContainerGap(799, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 80));

        jTabbedPane1.setBackground(new java.awt.Color(246, 190, 214));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        PUESTO.setBackground(new java.awt.Color(246, 190, 214));

        jPanel8.setBackground(new java.awt.Color(246, 190, 214));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Paciente:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Datos de la consulta");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Doctor:");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Fecha:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Consulta:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Hora:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("Total:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("Estado:");

        txtHora.setForeground(new java.awt.Color(51, 109, 136));
        txtHora.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtHora.setPlaceholder("Formato 24h");
        txtHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraKeyTyped(evt);
            }
        });

        rSButton3.setBackground(new java.awt.Color(51, 109, 136));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Guardar.png"))); // NOI18N
        rSButton3.setText("GUARDAR");
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });

        cmbEstado.setBackground(new java.awt.Color(51, 109, 136));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pendiente", "Sin cita" }));
        cmbEstado.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbEstado.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbEstado.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbEstado.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cmbDoctores.setBackground(new java.awt.Color(51, 109, 136));
        cmbDoctores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una doctor" }));
        cmbDoctores.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbDoctores.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbDoctores.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbDoctores.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbDoctores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cmbTipoConsulta.setBackground(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una tipo de consulta" }));
        cmbTipoConsulta.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbTipoConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbTipoConsulta.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbTipoConsultaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        rSButton4.setBackground(new java.awt.Color(255, 51, 51));
        rSButton4.setText("CANCELAR");
        rSButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton4ActionPerformed(evt);
            }
        });

        dcFecha.setDateFormatString("dd-MM-yyyy");

        cmbPacientes.setBackground(new java.awt.Color(51, 109, 136));
        cmbPacientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Doctor", "Secretaria" }));
        cmbPacientes.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbPacientes.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbPacientes.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbPacientes.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbPacientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("sin medicina");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel18))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                    .addComponent(jLabel23))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel19))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTotal))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGap(101, 101, 101)
                                            .addComponent(jLabel21))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rSComboMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 92, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addGap(58, 58, 58)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cmbDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cmbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(rSComboMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout PUESTOLayout = new javax.swing.GroupLayout(PUESTO);
        PUESTO.setLayout(PUESTOLayout);
        PUESTOLayout.setHorizontalGroup(
            PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUESTOLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        PUESTOLayout.setVerticalGroup(
            PUESTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PUESTOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("NUEVA CONSULTA", PUESTO);

        jPanel3.setBackground(new java.awt.Color(246, 190, 214));

        txtNombreFiltro.setBackground(new java.awt.Color(246, 190, 214));
        txtNombreFiltro.setForeground(new java.awt.Color(51, 109, 136));
        txtNombreFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreFiltro.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtNombreFiltro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombreFiltro.setPlaceholder("Buscar por paciente...");
        txtNombreFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreFiltroActionPerformed(evt);
            }
        });
        txtNombreFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreFiltroKeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        tblAllConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "Consulta", "Fecha", "Hora", "Estado"
            }
        ));
        tblAllConsultas.setAlignmentX(1.5F);
        tblAllConsultas.setAlignmentY(1.5F);
        tblAllConsultas.setAltoHead(75);
        tblAllConsultas.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblAllConsultas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblAllConsultas.setFuenteFilas(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblAllConsultas.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tblAllConsultas.setFuenteHead(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tblAllConsultas.setGridColor(new java.awt.Color(255, 255, 255));
        tblAllConsultas.setGrosorBordeHead(0);
        tblAllConsultas.setRowHeight(35);
        tblAllConsultas.setSelectionBackground(new java.awt.Color(231, 156, 194));
        tblAllConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAllConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAllConsultas);

        jPanel1.setBackground(new java.awt.Color(246, 190, 214));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Doctor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 151, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Fecha:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Consulta:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Hora:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Total:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Estado:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Diagnostico:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txtNombrePaciente.setForeground(new java.awt.Color(51, 109, 136));
        txtNombrePaciente.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtNombrePaciente.setEnabled(false);
        jPanel1.add(txtNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 450, -1));

        txtHoraCambio.setForeground(new java.awt.Color(51, 109, 136));
        txtHoraCambio.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        jPanel1.add(txtHoraCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 170, -1));

        txtTotalCambio.setForeground(new java.awt.Color(51, 109, 136));
        txtTotalCambio.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        jPanel1.add(txtTotalCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 450, -1));
        jPanel1.add(rSComboMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 221, 0, -1));

        txtEstadoConsulta.setForeground(new java.awt.Color(51, 109, 136));
        txtEstadoConsulta.setBordeColorFocus(new java.awt.Color(51, 109, 136));
        txtEstadoConsulta.setEnabled(false);
        jPanel1.add(txtEstadoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 170, -1));

        cmbDoctoresDisp.setBackground(new java.awt.Color(51, 109, 136));
        cmbDoctoresDisp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Dra. Soraya Cornejo" }));
        cmbDoctoresDisp.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbDoctoresDisp.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbDoctoresDisp.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbDoctoresDisp.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbDoctoresDisp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(cmbDoctoresDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 450, -1));

        cmbConsultaTipo.setBackground(new java.awt.Color(51, 109, 136));
        cmbConsultaTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Consulta general" }));
        cmbConsultaTipo.setColorArrow(new java.awt.Color(51, 109, 136));
        cmbConsultaTipo.setColorBorde(new java.awt.Color(51, 109, 136));
        cmbConsultaTipo.setColorFondo(new java.awt.Color(51, 109, 136));
        cmbConsultaTipo.setColorSeleccion(new java.awt.Color(51, 109, 136));
        cmbConsultaTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(cmbConsultaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 170, 40));

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane4.setViewportView(txtDiagnostico);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 450, 110));

        btnGuardar1.setBackground(new java.awt.Color(255, 0, 51));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel_121896 (2).png"))); // NOI18N
        btnGuardar1.setText("CANCELAR");
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        dcFechaCamb.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(dcFechaCamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 40));

        txtIdConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtIdConsulta.setAutoscrolls(false);
        txtIdConsulta.setEnabled(false);
        jPanel1.add(txtIdConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Paciente:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 94, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 109, 136));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/ELIMINAR1.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");

        btnImprimir1.setBackground(new java.awt.Color(51, 109, 136));
        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/IMPRIMIR2.png"))); // NOI18N
        btnImprimir1.setText("IMPRIMIR");

        rSButton5.setBackground(new java.awt.Color(51, 109, 136));
        rSButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/Save.png"))); // NOI18N
        rSButton5.setText("GUARDAR");
        rSButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rSButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONSULTA", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // </editor-fold>
    
    private void InicializarCampos() throws SQLException{
        this.conView = this.cv.getAllConsultas(conn);
        this.dcFecha.setMinSelectableDate(new java.util.Date());
        this.dcFecha.setDate(new java.util.Date());
        this.cmbDoctores.setEnabled(false);
        this.txtTotal.setEditable(false);
        this.txtTotal.setEnabled(false);
        this.txtTotal.setText(null);
        if(this.empleado.getId_puesto() == 1){
            this.jPanel8.setVisible(false);
        }else{
            this.jPanel8.setVisible(true);
            this.pacientes = paci.GetAllPacientes(conn);
            this.tipoLst = this.tpc.getAll(conn);
            this.LlenarComboPaciente(this.pacientes);
            this.LlenarComboTipos(tipoLst);
            this.LlenarTabla(this.conView);
        }
    }
        
    private void rSButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton5ActionPerformed
        int indexDoc = this.cmbDoctoresDisp.getSelectedIndex();
        int indexTipo = this.cmbConsultaTipo.getSelectedIndex();
        int indexEstado = this.cmbEstado.getSelectedIndex();
        Consultas consulta = new Consultas();
        String estado;
        if(this.txtDiagnostico.getText().length() > 0){
            estado = "S";
            consulta.setDiagnostico(this.txtDiagnostico.getText());
        }else{
            estado = "P";
            consulta.setDiagnostico("Pendiente");
        }
        java.util.Date fechaN = this.dcFechaCamb.getDate();
        Date fecha = new Date(fechaN.getTime());
        String hora = this.txtHoraCambio.getText();
        Double total = Double.valueOf(this.txtTotalCambio.getText().substring(2));
        Empleados doctor = this.empList.get(indexDoc-1);
        //Paciente paciente = this.pacientes.get(this.conv.getId_paciente());
        TipoConsulta tipo = this.tipoLst.get(indexTipo-1);
        consulta.setDiagnostico(this.txtDiagnostico.getText());
        consulta.setFecha(fecha);
        consulta.setTotal(total);
        consulta.setHora(Time.valueOf(hora));
        consulta.setId_tipoConsul(tipo.getId_tipoConsul());
        consulta.setId_emp(doctor.getId_emp());
        consulta.setId_paciente(this.conv.getId_paciente());
        consulta.setEstado(estado);
        consulta.setId_consul(Integer.valueOf(this.txtIdConsulta.getText()));
        if(!consulta.UpdateConsulta(consulta, conn)){
            JOptionPane.showMessageDialog(null, "Algo salió mal ");
        }else{
            try {
                this.conView = this.cv.getAllConsultas(conn);
                this.LlenarTabla(this.conView);
                this.VaciarCamposModificar();
               
                this.CambiaRecetas(consulta);
                
                this.setVisible(false);
                
            } catch (SQLException ex) {
                Logger.getLogger(pnlConsulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rSButton5ActionPerformed
    
   private void CambiaRecetas(Consultas cons){
        new CambiaPanel(this.pnlPrincipal, new Recetas(this.conn, this.conv, cons, this.pnlPrincipal, this.empleado));
    }
    
    public void VaciarCamposModificar(){
        this.txtIdConsulta.setText(null);
        this.txtDiagnostico.setText(null);
        this.txtHoraCambio.setText(null);
        this.cmbConsultaTipo.setSelectedIndex(0);
        this.cmbDoctoresDisp.setSelectedIndex(0);
        this.txtNombrePaciente.setText(null);
        this.txtEstadoConsulta.setText(null);
        this.txtTotalCambio.setText(null);
        this.dcFechaCamb.setDate(null);
    }
    
    private void cmbTipoConsultaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbTipoConsultaPopupMenuWillBecomeInvisible
       TipoConsulta tp = new TipoConsulta();
        int index = this.cmbTipoConsulta.getSelectedIndex();
        if(index > 0){
            tp = this.tipoLst.get(index-1);
            this.empList = empleado.GetAllEmpleadosEspe(conn, tp.getId_tipoConsul());
            this.LlenarComboDoctores(empList);
            this.cmbDoctores.setEnabled(true);
            this.txtTotal.setText("$" + tp.getPrecio());
        }else{
            if(this.cmbDoctores.getItemCount()> 0){
                this.cmbDoctores.removeAllItems();
                this.cmbDoctores.addItem("Seleccione al doctor");
                this.cmbDoctores.setEnabled(false);
            }
        }
    }//GEN-LAST:event_cmbTipoConsultaPopupMenuWillBecomeInvisible

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton4ActionPerformed
        try {
            this.InicializarCampos();
        } catch (SQLException ex) {
            Logger.getLogger(pnlConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSButton4ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        if(this.cmbPacientes.getSelectedIndex() == 0 &&
            this.cmbDoctores.getSelectedIndex() == 0 &&
            this.cmbTipoConsulta.getSelectedIndex() == 0 &&
            this.txtHora.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos");
        }else{
            int indexDoc = this.cmbDoctores.getSelectedIndex();
            int indexPac = this.cmbPacientes.getSelectedIndex();
            int indexTipo = this.cmbTipoConsulta.getSelectedIndex();
            int indexEstado = this.cmbEstado.getSelectedIndex();
            String estado;
            if(indexEstado == 0){
                estado = "P";
            }else{
                estado = "S";
            }
            java.util.Date fechaN = this.dcFecha.getDate();
            Date fecha = new Date(fechaN.getTime());
            String hora = this.txtHora.getText();
            Double total = Double.valueOf(this.txtTotal.getText().substring(1));
            Empleados doctor = this.empList.get(indexDoc-1);
            Paciente paciente = this.pacientes.get(indexPac-1);
            TipoConsulta tipo = this.tipoLst.get(indexTipo-1);
            Consultas consulta = new Consultas();
            consulta.setDiagnostico("Pendiente");
            consulta.setFecha(fecha);
            consulta.setTotal(total);
            consulta.setHora(Time.valueOf(hora + ":00"));
            consulta.setId_tipoConsul(tipo.getId_tipoConsul());
            consulta.setId_emp(doctor.getId_emp());
            consulta.setId_paciente(paciente.getId_paci());
            consulta.setEstado(estado);
            if(!consulta.AddConsulta(consulta, conn)){
                JOptionPane.showMessageDialog(null, "Algo salió mal ");
            }else{
                try {
                    this.InicializarCampos();
                } catch (SQLException ex) {
                    Logger.getLogger(pnlConsulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void txtHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraKeyTyped
        String c= String.valueOf(evt.getKeyChar());

        if (!c.matches("\\d+(\\.\\d{1,2})?")){

            evt.consume();
        }else{
            if(this.txtHora.getText().length() == 2){
                this.txtHora.setText(this.txtHora.getText() + ":");
            }
            if(this.txtHora.getText().length() == 5){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtHoraKeyTyped
    TableRowSorter trs;
    private void txtNombreFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreFiltroKeyTyped
        
        txtNombreFiltro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke) {
                
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtNombreFiltro.getText(), 0));
            }
        });
        trs = new TableRowSorter(this.model);
        this.tblAllConsultas.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreFiltroKeyTyped

    private void txtNombreFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreFiltroActionPerformed
    ConsultaVista conv ;
    private void tblAllConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAllConsultasMouseClicked
        int index = this.tblAllConsultas.getSelectedRow();
        ArrayList<ConsultaVista> consLocal = new ArrayList<>();
        if(this.tblAllConsultas.getRowCount() == this.conView.size()){
            this.conv = this.conView.get(index);
            //this.LlenarCampo(this.conv);
        }else{
            String texto = this.txtNombreFiltro.getText();
            for (int i = 0; i < this.conView.size(); i++) {
                ConsultaVista c = this.conView.get(i);
                if( c.getNombre_paciente().toLowerCase().indexOf(texto.toLowerCase()) >= 0){
                    consLocal.add(c);
                }
            }
            this.conv = consLocal.get(index);
        }
        this.LlenarCampo(this.conv);
    }//GEN-LAST:event_tblAllConsultasMouseClicked
    
    public void LlenarCampo(ConsultaVista conv){
        this.empList = empleado.GetAllEmpleadosEspe(conn, conv.getId_tipo_consulta());
        this.LlenarComboDoctoresCamb(empList);
        this.LlenarComboTiposCamb(this.tipoLst);
        this.txtEstadoConsulta.setText(conv.getEstado());
        this.txtNombrePaciente.setText(conv.getNombre_paciente());
        this.txtHoraCambio.setText(conv.getHora().toString());
        this.dcFechaCamb.setDate(conv.getFecha());
        this.txtTotalCambio.setText("$ " + conv.getTotal());
        this.cmbDoctoresDisp.setSelectedItem(conv.getNombre_doctor());
        this.cmbConsultaTipo.setSelectedItem(conv.getTipo_consulta());
        this.txtIdConsulta.setText(String.valueOf(conv.getId_consulta()));
        this.conv = conv;
    }
    
    
    DefaultTableModel model;
    public void LlenarTabla(ArrayList<ConsultaVista> array) throws SQLException{
        //Collections.sort(array, Collections.reverseOrder());
        this.model = new DefaultTableModel();
        
        model.addColumn("Paciente");
        model.addColumn("Tipo");
        model.addColumn("Fecha");
        model.addColumn("Hora");
        model.addColumn("Estado");
       
        for (int i = 0; i < array.size(); i++) {
            ConsultaVista current = array.get(i);
            Time hora = current.getHora();
            model.addRow(new Object[]{
                current.getNombre_paciente(),
                current.getTipo_consulta(),
                current.getFecha(),
                hora.toString(),
                current.getEstadoValue()
            });
        }
        this.tblAllConsultas.setModel(model);
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PUESTO;
    private rojeru_san.RSButton btnEliminar;
    private rojeru_san.RSButton btnGuardar1;
    private rojeru_san.RSButton btnImprimir1;
    private rojerusan.RSComboMetro cmbConsultaTipo;
    private rojerusan.RSComboMetro cmbDoctores;
    private rojerusan.RSComboMetro cmbDoctoresDisp;
    private rojerusan.RSComboMetro cmbEstado;
    private rojerusan.RSComboMetro cmbPacientes;
    private rojerusan.RSComboMetro cmbTipoConsulta;
    private com.toedter.calendar.JDateChooser dcFecha;
    private com.toedter.calendar.JDateChooser dcFechaCamb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButton rSButton5;
    private rojerusan.RSComboMetro rSComboMetro2;
    private rojerusan.RSComboMetro rSComboMetro3;
    private rojeru_san.RSMTextFull rSMTextFull11;
    private rojeru_san.RSMTextFull rSMTextFull13;
    private rojeru_san.complementos.RSTableMetro tblAllConsultas;
    private javax.swing.JTextArea txtDiagnostico;
    private rojeru_san.RSMTextFull txtEstadoConsulta;
    private rojeru_san.RSMTextFull txtHora;
    private rojeru_san.RSMTextFull txtHoraCambio;
    private javax.swing.JTextField txtIdConsulta;
    private rojeru_san.RSMTextFull txtNombreFiltro;
    private rojeru_san.RSMTextFull txtNombrePaciente;
    private javax.swing.JTextField txtTotal;
    private rojeru_san.RSMTextFull txtTotalCambio;
    // End of variables declaration//GEN-END:variables
}
