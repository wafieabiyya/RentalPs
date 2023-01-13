/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectuas.viewSwing;

import com.mycompany.projectuas.pojo.Admin;

/**
 *
 * @author lenovo
 */
public class DashboardHomePage extends javax.swing.JFrame {

    /**
     * Creates new form DashboardHomePage
     */
    public DashboardHomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public DashboardHomePage(Admin admin){
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        jPanel2 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_manageGame = new javax.swing.JButton();
        btn_manageAdmin = new javax.swing.JButton();
        btn_managePs = new javax.swing.JButton();
        btn_customer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 3, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        btn_logout.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_logout.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\log-out (1).png")); // NOI18N
        btn_logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 2, true));
        btn_logout.setBorderPainted(false);
        btn_logout.setContentAreaFilled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_logout);
        btn_logout.setBounds(30, 500, 50, 45);

        btn_home.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_home.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\house.png")); // NOI18N
        btn_home.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 2, true));
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_home);
        btn_home.setBounds(30, 120, 50, 49);

        btn_manageGame.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_manageGame.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\console.png")); // NOI18N
        btn_manageGame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 2, true));
        btn_manageGame.setBorderPainted(false);
        btn_manageGame.setContentAreaFilled(false);
        btn_manageGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageGameActionPerformed(evt);
            }
        });
        jPanel2.add(btn_manageGame);
        btn_manageGame.setBounds(30, 180, 50, 49);

        btn_manageAdmin.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_manageAdmin.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\user.png")); // NOI18N
        btn_manageAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 2, true));
        btn_manageAdmin.setBorderPainted(false);
        btn_manageAdmin.setContentAreaFilled(false);
        btn_manageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btn_manageAdmin);
        btn_manageAdmin.setBounds(30, 240, 50, 49);

        btn_managePs.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_managePs.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\videogame.png")); // NOI18N
        btn_managePs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 2, true));
        btn_managePs.setBorderPainted(false);
        btn_managePs.setContentAreaFilled(false);
        btn_managePs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managePsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_managePs);
        btn_managePs.setBounds(30, 300, 50, 49);

        btn_customer.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_customer.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\customer.png")); // NOI18N
        btn_customer.setToolTipText("");
        btn_customer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 2, true));
        btn_customer.setBorderPainted(false);
        btn_customer.setContentAreaFilled(false);
        btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_customer);
        btn_customer.setBounds(30, 360, 50, 49);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\playstation-logotype.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 20, 70, 64);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 110, 570);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Home Page");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(290, 10, 300, 30);

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setText("This application helps manage the needs of the Playstation rental business easily.");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(80, 40, 730, 20);

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel12.setText("You can control anytime and anywhere through this application.");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(170, 60, 560, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(110, 0, 880, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_managePsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managePsActionPerformed
        DashboardManagePs dashboardManagePs = new DashboardManagePs();
        dashboardManagePs.setVisible(true);
    }//GEN-LAST:event_btn_managePsActionPerformed

    private void btn_manageGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageGameActionPerformed
        DashBoardManageGamePage dashBoardManageGamePage = new DashBoardManageGamePage();
        dashBoardManageGamePage.setVisible(true);
    }//GEN-LAST:event_btn_manageGameActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        DashboardHomePage dashboardHomePage = new DashboardHomePage();
        dashboardHomePage.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
       LoginPage loginPage = new LoginPage();
       loginPage.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customerActionPerformed
        DashboardManageCustomerPage dashboardManageCustomerPage = new DashboardManageCustomerPage();
        dashboardManageCustomerPage.setVisible(true);
    }//GEN-LAST:event_btn_customerActionPerformed

    private void btn_manageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageAdminActionPerformed
       DashboardManagePenyewaanPage dashboardManagePenyewaanPage = new DashboardManagePenyewaanPage();
       dashboardManagePenyewaanPage.setVisible(true);
    }//GEN-LAST:event_btn_manageAdminActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_customer;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_manageAdmin;
    private javax.swing.JButton btn_manageGame;
    private javax.swing.JButton btn_managePs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
