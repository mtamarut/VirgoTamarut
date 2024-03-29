/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.gui;

import javax.swing.JFrame;

/**
 *
 * @author TAMARUT
 */
public class MenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuGUI
     */
    public MenuGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGetPatients = new javax.swing.JButton();
        btnAddNewPatient = new javax.swing.JButton();
        btnStaffManagment = new javax.swing.JButton();
        btnBills = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGetPatients.setText("Show Patients");
        btnGetPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetPatientsMouseClicked(evt);
            }
        });

        btnAddNewPatient.setText("Add New Patient");
        btnAddNewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNewPatientMouseClicked(evt);
            }
        });

        btnStaffManagment.setText("Staff Managment");
        btnStaffManagment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStaffManagmentMouseClicked(evt);
            }
        });

        btnBills.setText("Billing history");
        btnBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStaffManagment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddNewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetPatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnGetPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStaffManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBills, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetPatientsMouseClicked
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowPatientsGUI s = new ShowPatientsGUI();
                s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                s.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnGetPatientsMouseClicked

    private void btnAddNewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewPatientMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewPatientGUI p = new NewPatientGUI();
                p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                p.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnAddNewPatientMouseClicked

    private void btnStaffManagmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffManagmentMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StaffManagmentGUI sm = new StaffManagmentGUI();
                sm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                sm.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnStaffManagmentMouseClicked

    private void btnBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillsActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BillingHistoryGUI bh = new BillingHistoryGUI();
                bh.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                bh.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnBillsActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewPatient;
    private javax.swing.JButton btnBills;
    private javax.swing.JButton btnGetPatients;
    private javax.swing.JButton btnStaffManagment;
    // End of variables declaration//GEN-END:variables
}
