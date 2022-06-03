
package Views;


public class MainView extends javax.swing.JFrame {

    
    public MainView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnPatients = new javax.swing.JMenu();
        mnRegister = new javax.swing.JMenuItem();
        mnPatientIndex = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        mnPatients.setText("Pacientes");

        mnRegister.setText("Cadastrar");
        mnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegisterActionPerformed(evt);
            }
        });
        mnPatients.add(mnRegister);

        mnPatientIndex.setText("Exibir Todos");
        mnPatientIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPatientIndexActionPerformed(evt);
            }
        });
        mnPatients.add(mnPatientIndex);

        jMenuBar1.add(mnPatients);

        jMenu1.setText("Consultas");

        jMenuItem1.setText("Mostrar Todas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");

        mnExit.setText("Sair");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu2.add(mnExit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnExitActionPerformed
    
    private void mnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegisterActionPerformed
        RegisterPatientView rpv = new RegisterPatientView();
        rpv.setVisible(true);
        desktop.add(rpv);
    }//GEN-LAST:event_mnRegisterActionPerformed

    private void mnPatientIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPatientIndexActionPerformed
        IndexPatientsView ipv = new IndexPatientsView();
        ipv.setVisible(true);
        desktop.add(ipv);
    }//GEN-LAST:event_mnPatientIndexActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AllAppointmentsView aav = new AllAppointmentsView();
        aav.setVisible(true);
        desktop.add(aav);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    
   
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnPatientIndex;
    private javax.swing.JMenu mnPatients;
    private javax.swing.JMenuItem mnRegister;
    // End of variables declaration//GEN-END:variables
}
