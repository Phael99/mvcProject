
package Views;

import Controllers.AppointmentController;
import javax.swing.table.TableModel;


public class IndexAppointmentsView extends javax.swing.JFrame {
    
    int patientId;
    AppointmentController ac = new AppointmentController();
    TableModel tb = null;
    int line;
    
    public IndexAppointmentsView() {
        initComponents();
        tb = ac.showByPatient(patientId);
        tbAppointments.setModel(tb);
    }
    
    public IndexAppointmentsView(int patientId, String name) {
        initComponents();
        this.patientId = patientId;
        tb = ac.showByPatient(patientId);
        tbAppointments.setModel(tb);
        
        txtAppointment.setText("Consultas de " + name);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAppointments = new javax.swing.JTable();
        btnRegisterAppointment = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtAppointment = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAppointmentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAppointments);

        btnRegisterAppointment.setText("Cadastrar Consulta");
        btnRegisterAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterAppointmentActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar Consulta");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtAppointment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAppointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAppointment.setText("Consultas de");

        btnDelete.setText("Excluir Consulta");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegisterAppointment)
                        .addGap(86, 86, 86)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addComponent(txtAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAppointment)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterAppointment)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterAppointmentActionPerformed
        
        new RegisterAppointmentView(patientId).setVisible(true);
    }//GEN-LAST:event_btnRegisterAppointmentActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int id = Integer.parseInt(tbAppointments.getModel().getValueAt(line, 0).toString());
        
        new EditAppointmentView(id).setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void tbAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAppointmentsMouseClicked
        line = tbAppointments.getSelectedRow();
        
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tbAppointmentsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.parseInt(tbAppointments.getModel().getValueAt(line, 0).toString());
        
        new DeleteAppointmentView(id).setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndexAppointmentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexAppointmentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexAppointmentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexAppointmentsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexAppointmentsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRegisterAppointment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAppointments;
    private javax.swing.JLabel txtAppointment;
    // End of variables declaration//GEN-END:variables
}
