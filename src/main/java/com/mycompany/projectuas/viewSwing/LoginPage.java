/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectuas.viewSwing;

import com.mycompany.projectuas.pojo.Admin;
import com.mycompany.projectuas.service.AdminService;
import com.mycompany.projectuas.serviceimpl.AdminServiceImpl;
import com.mycompany.projectuas.utilities.ConnectionManager;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.tools.Tool;

/**
 *
 * @author lenovo
 */
public class LoginPage extends javax.swing.JFrame {
    
    AdminServiceImpl log = new AdminServiceImpl();
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.connect();
    
    String username, password;
    boolean login = false;
       
    public LoginPage() {
        initComponents(); 
        this.setLocationRelativeTo(null);
    }
    public void close(){
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    public void clearField (){
        txt_userName.setText("");
        txt_password.setText("");
    }
    public void showPass (){
        if(radio_show.isSelected()){
            txt_password.setEchoChar((char)0);
            radio_show.setText("Hide Password");
        }
        else{
            txt_password.setEchoChar('*');
            radio_show.setText("Show Password");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_signIn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        radio_show = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btn_signUp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel5.setText("LOGIN PAGE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 100, 100, 22);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 160, 70, 20);

        txt_userName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_userName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_userName);
        txt_userName.setBounds(50, 180, 250, 30);

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 230, 70, 20);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(19, 6, 0, 0);

        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_password);
        txt_password.setBounds(50, 250, 250, 30);

        btn_signIn.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_signIn.setText("Sign In");
        btn_signIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signIn);
        btn_signIn.setBounds(50, 330, 250, 30);

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel11.setText("Dont have any account?");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 370, 170, 17);

        radio_show.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        radio_show.setText("Show Password");
        radio_show.setContentAreaFilled(false);
        radio_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_showActionPerformed(evt);
            }
        });
        jPanel1.add(radio_show);
        radio_show.setBounds(50, 290, 120, 20);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(296, 220, 0, 0);

        btn_signUp.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_signUp.setForeground(new java.awt.Color(4, 21, 98));
        btn_signUp.setText("Sign Up");
        btn_signUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_signUp.setBorderPainted(false);
        btn_signUp.setContentAreaFilled(false);
        btn_signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signUpMouseClicked(evt);
            }
        });
        btn_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signUpActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signUp);
        btn_signUp.setBounds(210, 360, 80, 40);

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("Input your account here");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 120, 210, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jLabel2.setText("GAMERY PLAYSTATION");

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Rental PS 4 dan PS 5");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\playstation-logotype.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 360, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userNameActionPerformed
        
    }//GEN-LAST:event_txt_userNameActionPerformed

    private void radio_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_showActionPerformed
        
    }//GEN-LAST:event_radio_showActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed
        int login = log.login(txt_userName.getText(), txt_password.getText());
        if (login == 1){
            JOptionPane.showMessageDialog(null, "Login Berhasil","Pesan",
                    JOptionPane.INFORMATION_MESSAGE);
        
        DashboardHomePage dashboardHomePage = new DashboardHomePage();
        dashboardHomePage.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Username and password is wrong", "pesan",
                    JOptionPane.WARNING_MESSAGE);
            clearField();
        }
    }//GEN-LAST:event_btn_signInActionPerformed

    private void btn_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signUpActionPerformed
        RegisterPage registerPage = new RegisterPage();
        registerPage.setVisible(true);
        close();
    }//GEN-LAST:event_btn_signUpActionPerformed

    private void btn_signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signUpMouseClicked
        
    }//GEN-LAST:event_btn_signUpMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_signIn;
    private javax.swing.JButton btn_signUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radio_show;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
