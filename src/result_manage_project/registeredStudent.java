/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_manage_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author prana
 */
public class registeredStudent extends javax.swing.JFrame {

    /**
     * Creates new form registeredStudent
     */
    public registeredStudent() {
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

        jPanel1 = new javax.swing.JPanel();
        addnewstudent = new javax.swing.JButton();
        addResult = new javax.swing.JButton();
        allStudentResult = new javax.swing.JButton();
        registeredStudent = new javax.swing.JButton();
        logoutAdminHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        addnewstudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addnewstudent.setText("Add New Student");
        addnewstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewstudentActionPerformed(evt);
            }
        });

        addResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addResult.setText("Add result");
        addResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResultActionPerformed(evt);
            }
        });

        allStudentResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allStudentResult.setText("All Student Result");
        allStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentResultActionPerformed(evt);
            }
        });

        registeredStudent.setBackground(new java.awt.Color(102, 153, 255));
        registeredStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registeredStudent.setText("Registered Student");
        registeredStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentActionPerformed(evt);
            }
        });

        logoutAdminHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutAdminHome.setText("Log Out");
        logoutAdminHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutAdminHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutAdminHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addnewstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registeredStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(allStudentResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addnewstudent)
                .addGap(33, 33, 33)
                .addComponent(registeredStudent)
                .addGap(41, 41, 41)
                .addComponent(addResult)
                .addGap(41, 41, 41)
                .addComponent(allStudentResult)
                .addGap(55, 55, 55)
                .addComponent(logoutAdminHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 19, -1, 375));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addnewstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewstudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminHome().setVisible(true);
    }//GEN-LAST:event_addnewstudentActionPerformed

    private void addResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addResult().setVisible(true);
    }//GEN-LAST:event_addResultActionPerformed

    private void allStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new allStudentResult().setVisible(true);
    }//GEN-LAST:event_allStudentResultActionPerformed

    private void registeredStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredStudent().setVisible(true);
    }//GEN-LAST:event_registeredStudentActionPerformed

    private void logoutAdminHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutAdminHomeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_logoutAdminHomeActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3600/srms","root","Pranav@#369");
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery("select * from student");
            
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString() );
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeredStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addResult;
    private javax.swing.JButton addnewstudent;
    private javax.swing.JButton allStudentResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutAdminHome;
    private javax.swing.JButton registeredStudent;
    // End of variables declaration//GEN-END:variables
}
