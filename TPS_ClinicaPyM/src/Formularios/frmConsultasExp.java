
package Formularios;
import Logica_Negocio.Expediente;
import Logica_Negocio.ConsultaVista;
import Logica_Negocio.Medicina;
import Logica_Negocio.Paciente;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class frmConsultasExp extends javax.swing.JFrame {

    /**
     * Creates new form frmConsultasExp
     * @param id
     */
    int id;
    Connection conn;
    ArrayList<ConsultaVista> cons;
    Expediente exp = new Expediente();
    
    public frmConsultasExp() {
        initComponents();
    }
    
    public void addId(int idPaci, Connection conn){
        this.id = idPaci;
        this.conn = conn;
        cons = exp.getConsultas(conn, this.id);
        this.txtNombre.setText(cons.get(0).getNombre_paciente());
        this.LlenarTabla();
    }
    
    DefaultTableModel model;
    public void LlenarTabla(){
        
        this.model = new DefaultTableModel();
        
        model.addColumn("Tipo consulta");
        model.addColumn("Doctor");
        model.addColumn("Fecha");
        model.addColumn("Hora");
        model.addColumn("Estado");
        model.addColumn("Total");
       
        for (int i = 0; i < this.cons.size(); i++) {
            ConsultaVista current = this.cons.get(i);
            
            model.addRow(new Object[]{
                current.getTipo_consulta(),
                current.getNombre_doctor(),
                current.getFecha(),
                current.getHora(),
                current.getEstado(),
                current.getTotal()
            });
        }
        this.tblExpediente.setModel(model);
    }
    
    public void LlenarMedicamentos(int id_consul){
        ArrayList<Medicina> medicina = this.exp.getMedicina(conn, id_consul);
        String med = "";
        for (int i = 0; i < medicina.size(); i++) {
            Medicina get = medicina.get(i);
            med += get.getNombre() + " - " + get.getErrorSql() + " | Vendidos: " + get.getStock() +  "\n";
        }
        this.txtMedicamentos.setText(med);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new app.bolivia.swing.JCTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new app.bolivia.swing.JCTextField();
        lblTconsulta = new javax.swing.JLabel();
        txtTipoConsulta = new app.bolivia.swing.JCTextField();
        lblDoctor = new javax.swing.JLabel();
        txtDoctor = new app.bolivia.swing.JCTextField();
        lblDiagnostico = new javax.swing.JLabel();
        lblDiagnostico1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMedicamentos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnoostico = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpediente = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(246, 190, 214));

        lblID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblID.setText("ID:");

        txtID.setEditable(false);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.setEditable(false);

        lblTconsulta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTconsulta.setText("Tipo Consulta:");

        txtTipoConsulta.setEditable(false);

        lblDoctor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDoctor.setText("Doctor:");

        txtDoctor.setEditable(false);

        lblDiagnostico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDiagnostico.setText("Diagnostico:");

        lblDiagnostico1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDiagnostico1.setText("Medicamentos:");

        txtMedicamentos.setEditable(false);
        txtMedicamentos.setColumns(20);
        txtMedicamentos.setRows(5);
        jScrollPane3.setViewportView(txtMedicamentos);

        txtDiagnoostico.setEditable(false);
        txtDiagnoostico.setColumns(20);
        txtDiagnoostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnoostico);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre)
                    .addComponent(lblTconsulta)
                    .addComponent(lblDoctor)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(lblDiagnostico1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDiagnostico)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiagnostico))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTconsulta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDoctor)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblDiagnostico1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(246, 190, 214));

        tblExpediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblExpediente.setColorBackgoundHead(new java.awt.Color(51, 109, 136));
        tblExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExpedienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExpediente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExpedienteMouseClicked
        int id = this.tblExpediente.getSelectedRow();
        ConsultaVista cons = this.cons.get(id);
        this.txtID.setText(String.valueOf(cons.getId_consulta()));
        this.txtDoctor.setText(cons.getNombre_doctor());
        this.txtDiagnoostico.setText(cons.getDiagnostico());
        this.txtTipoConsulta.setText(cons.getEstadoValue());
        this.LlenarMedicamentos(cons.getId_consulta());
    }//GEN-LAST:event_tblExpedienteMouseClicked

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
            java.util.logging.Logger.getLogger(frmConsultasExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultasExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultasExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultasExp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultasExp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblDiagnostico1;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTconsulta;
    private rojerusan.RSTableMetro tblExpediente;
    private javax.swing.JTextArea txtDiagnoostico;
    private app.bolivia.swing.JCTextField txtDoctor;
    private app.bolivia.swing.JCTextField txtID;
    private javax.swing.JTextArea txtMedicamentos;
    private app.bolivia.swing.JCTextField txtNombre;
    private app.bolivia.swing.JCTextField txtTipoConsulta;
    // End of variables declaration//GEN-END:variables
}
