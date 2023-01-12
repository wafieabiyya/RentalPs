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
    private Game findGame (int id){
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        btn_home = new javax.swing.JButton();
        btn_manageGame = new javax.swing.JButton();
        btn_manageAdmin = new javax.swing.JButton();
        btn_manageCustomer = new javax.swing.JButton();
        btn_managePs = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to Game Management Page");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("This page is management game. Functions to manage existing games.");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\playstation.png")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(174, 174, 174))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID Game       :");

        txt_IdGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdGameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nama Game :");

        txt_namaGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaGameActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("LIST GAME");

        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_referesh.setText("Refresh");
        btn_referesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refereshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_IdGame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_namaGame, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_search, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_referesh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(txt_IdGame, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_namaGame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_referesh, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\ri_home-5-line.png")); // NOI18N
        btn_home.setText("Home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_manageGame.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\teenyicons_game-controller-retro-outline.png")); // NOI18N
        btn_manageGame.setText("Manage Game");
        btn_manageGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageGameActionPerformed(evt);
            }
        });

        btn_manageAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\eos-icons_admin-outlined.png")); // NOI18N
        btn_manageAdmin.setText("Manage Admin");
        btn_manageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageAdminActionPerformed(evt);
            }
        });

        btn_manageCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\mdi_people-group-outline.png")); // NOI18N
        btn_manageCustomer.setText("Manage Customer");
        btn_manageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageCustomerActionPerformed(evt);
            }
        });

        btn_managePs.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\iconoir_playstation-gamepad_1.png")); // NOI18N
        btn_managePs.setText("Manage Ps");
        btn_managePs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managePsActionPerformed(evt);
            }
        });

        btn_logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\simple-line-icons_logout.png")); // NOI18N
        btn_logout.setText("Log Out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_manageGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_manageAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_manageCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_managePs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manageGame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manageCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_managePs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_manageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_manageAdminActionPerformed

    private void btn_manageGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_manageGameActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        DashboardHomePage dashboardHomePage = new DashboardHomePage();
        dashboardHomePage.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void txt_IdGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdGameActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int id;
        gameService = new GameServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        id = Integer.parseInt(txt_IdGame.getText());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to delete it?",""
                + "warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            
            gameService.delete(id);
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_manageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageCustomerActionPerformed
        DashboardManageCustomerPage dashboardManageCustomerPage = new DashboardManageCustomerPage();
        dashboardManageCustomerPage.setVisible(true);
    }//GEN-LAST:event_btn_manageCustomerActionPerformed

    private void txt_namaGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaGameActionPerformed

    private void tbl_gameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gameMouseClicked
        String nama; 
        int id;
        int row = tbl_game.getSelectedRow();
        id = Integer.parseInt(tbl_game.getValueAt(row, 0).toString());
        nama = tbl_game.getValueAt(row, 1).toString();
        
        txt_IdGame.setText(id+"");
        txt_namaGame.setText(nama);
    }//GEN-LAST:event_tbl_gameMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String namaGame;
        int ID;
        gameService = new GameServiceImpl();
        ID = Integer.parseInt(txt_IdGame.getText());
        namaGame = txt_namaGame.getText();
        
        Game game = new Game();
        game.setID(ID);
        game.setNamaGame(namaGame);
        
        gameService.create(game);
        JOptionPane.showMessageDialog(null, "Game Added!");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        String namaGame;
        int ID;
        gameService = new GameServiceImpl();
        ID = Integer.parseInt(txt_IdGame.getText());
        namaGame = txt_namaGame.getText();
        
        Game game = new Game();
        game.setID(ID);
        game.setNamaGame(namaGame);
        
        gameService.update(game);
        JOptionPane.showMessageDialog(null, "Game Updated!");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        emptyField();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        close();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("Report List Game");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            tbl_game.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException e) {
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_refereshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refereshActionPerformed
       loadData();
    }//GEN-LAST:event_btn_refereshActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       int id;
       Game searchedGame = new Game();
       id = Integer.parseInt(txt_search.getText());
       searchedGame = findGame(id);
       if (searchedGame !=null){
           loadData(searchedGame);
       }
       else{
           JOptionPane.showMessageDialog(null, "ID not founded!");
       }
       emptyField();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_managePsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managePsActionPerformed
       DashboardManagePs dashboardManagePs = new DashboardManagePs();
       dashboardManagePs.setVisible(true);
    }//GEN-LAST:event_btn_managePsActionPerformed

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
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_manageAdmin;
    private javax.swing.JButton btn_manageCustomer;
    private javax.swing.JButton btn_manageGame;
    private javax.swing.JButton btn_managePs;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_referesh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
