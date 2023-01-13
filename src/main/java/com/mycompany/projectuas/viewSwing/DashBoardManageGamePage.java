/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectuas.viewSwing;

import com.mycompany.projectuas.pojo.Game;
import com.mycompany.projectuas.service.GameService;
import com.mycompany.projectuas.serviceimpl.GameServiceImpl;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class DashBoardManageGamePage extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardManageGamePage
     */
    GameService gameService;
    public DashBoardManageGamePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
    }
    private void emptyField(){
        txt_IdGame.setText("");
        txt_namaGame.setText("");
    }
    private void loadData(){
        gameService = new GameServiceImpl();
        List<Game> listGame = new ArrayList<>();
        listGame = gameService.findAll();
        Object [][] objectGame = new Object[listGame.size()][2];
        
        int counter = 0;
        for (Game game : listGame){
            objectGame [counter][0] = game.getID();
            objectGame [counter][1] = game.getNamaGame();
            counter++;
            
        }
        tbl_game.setModel(new javax.swing.table.DefaultTableModel(
        objectGame, new String[]{
            "ID Game", "Nama Game"
        }));
    }
    private void loadData(Game game){
        Object[][] objectGame = new Object[1][2];
        objectGame [0][0] = game.getID();
        objectGame[0][1] = game.getNamaGame();
        
        tbl_game.setModel(new javax.swing.table.DefaultTableModel(
        objectGame, new String[]{
            "ID Game", "Nama Game"
        }));
    }
    private Game findGame (String id){
        Game game = new Game();
        gameService = new GameServiceImpl();
        game = gameService.findById(id);
        
        return game;
    }
     public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }


    
    public DashBoardManageGamePage(Game game){
    initComponents();
    this.setLocationRelativeTo(null);
    
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_IdGame = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_namaGame = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_game = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_print = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_referesh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_manageGame = new javax.swing.JButton();
        btn_manageAdmin = new javax.swing.JButton();
        btn_managePs = new javax.swing.JButton();
        btn_customer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("ID Game       :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(6, 19, 140, 20);

        txt_IdGame.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_IdGame.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_IdGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdGameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_IdGame);
        txt_IdGame.setBounds(150, 20, 32, 20);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setText("Nama Game     :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 60, 140, 20);

        txt_namaGame.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_namaGame.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_namaGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaGameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_namaGame);
        txt_namaGame.setBounds(150, 50, 160, 32);

        btn_save.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_save);
        btn_save.setBounds(485, 6, 123, 48);

        btn_delete.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete);
        btn_delete.setBounds(652, 6, 124, 48);

        btn_edit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel3.add(btn_edit);
        btn_edit.setBounds(485, 66, 123, 48);

        btn_clear.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear);
        btn_clear.setBounds(652, 66, 124, 48);

        tbl_game.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tbl_game.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Game", "Nama Game"
            }
        ));
        tbl_game.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_gameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_game);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 370, 800, 180);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("LIST GAME");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 270, 94, 25);

        txt_search.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(txt_search);
        txt_search.setBounds(10, 300, 92, 31);

        btn_print.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_print.setText("Print");
        btn_print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel3.add(btn_print);
        btn_print.setBounds(485, 132, 291, 48);

        btn_search.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(4, 21, 98));
        btn_search.setText("Search");
        btn_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel3.add(btn_search);
        btn_search.setBounds(10, 340, 92, 19);

        btn_referesh.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_referesh.setForeground(new java.awt.Color(4, 21, 98));
        btn_referesh.setText("Refresh");
        btn_referesh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_referesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refereshActionPerformed(evt);
            }
        });
        jPanel3.add(btn_referesh);
        btn_referesh.setBounds(120, 340, 90, 19);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(120, 90, 830, 580);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 3, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        btn_logout.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_logout.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\log-out.png")); // NOI18N
        btn_logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 2, true));
        btn_logout.setBorderPainted(false);
        btn_logout.setContentAreaFilled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_logout);
        btn_logout.setBounds(20, 600, 50, 45);

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

        jPanel4.add(jPanel2);
        jPanel2.setBounds(0, 0, 110, 680);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Manage Game");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(360, 10, 340, 30);

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setText("This application helps manage the needs of the Playstation rental business easily.");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(160, 40, 730, 20);

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel12.setText("You can control anytime and anywhere through this application.");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(250, 60, 560, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refereshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refereshActionPerformed
        loadData();
    }//GEN-LAST:event_btn_refereshActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String id;
        Game searchedGame = new Game();
        id = (txt_search.getText());
        searchedGame = findGame(id);
        if (searchedGame !=null){
            loadData(searchedGame);
        }
        else{
            JOptionPane.showMessageDialog(null, "ID not founded!");
        }
        emptyField();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("Report List Game");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            tbl_game.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException e) {
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void tbl_gameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gameMouseClicked
        String nama;
        String id;
        int row = tbl_game.getSelectedRow();
        id = (tbl_game.getValueAt(row, 0).toString());
        nama = tbl_game.getValueAt(row, 1).toString();

        txt_IdGame.setText(id+"");
        txt_namaGame.setText(nama);
    }//GEN-LAST:event_tbl_gameMouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        emptyField();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        String namaGame,ID;
       
        gameService = new GameServiceImpl();
        ID =(txt_IdGame.getText());
        namaGame = txt_namaGame.getText();

        Game game = new Game();
        game.setID(ID);
        game.setNamaGame(namaGame);

        gameService.update(game);
        JOptionPane.showMessageDialog(null, "Game Updated!");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String id;
        gameService = new GameServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;

        id = (txt_IdGame.getText());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to delete it?",""
            + "warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){

            gameService.delete(id);
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String namaGame,ID;
       
        gameService = new GameServiceImpl();
        ID = (txt_IdGame.getText());
        namaGame = txt_namaGame.getText();

        Game game = new Game();
        game.setID(ID);
        game.setNamaGame(namaGame);

        gameService.create(game);
        JOptionPane.showMessageDialog(null, "Game Added!");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_namaGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaGameActionPerformed

    private void txt_IdGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdGameActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        close();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        DashboardHomePage dashboardHomePage = new DashboardHomePage();
        dashboardHomePage.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_manageGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageGameActionPerformed
        DashBoardManageGamePage dashBoardManageGamePage = new DashBoardManageGamePage();
        dashBoardManageGamePage.setVisible(true);
    }//GEN-LAST:event_btn_manageGameActionPerformed

    private void btn_managePsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managePsActionPerformed
        DashboardManagePs dashboardManagePs = new DashboardManagePs();
        dashboardManagePs.setVisible(true);
    }//GEN-LAST:event_btn_managePsActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashBoardManageGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoardManageGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoardManageGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoardManageGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardManageGamePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_customer;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_manageAdmin;
    private javax.swing.JButton btn_manageGame;
    private javax.swing.JButton btn_managePs;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_referesh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_game;
    private javax.swing.JTextField txt_IdGame;
    private javax.swing.JTextField txt_namaGame;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
