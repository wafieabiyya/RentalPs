/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectuas.viewSwing;

import com.mycompany.projectuas.pojo.Customer;
import com.mycompany.projectuas.service.CustomerService;
import com.mycompany.projectuas.serviceimpl.CustomerServiceImpl;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class DashboardManageCustomerPage extends javax.swing.JFrame {

    /**
     * Creates new form DashboardManageCustomerPage
     */
    CustomerService customerService;
    
    public DashboardManageCustomerPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
        
    }
    public DashboardManageCustomerPage(Customer customer){
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void emptyField(){
        txt_idCust.setText("");
        txt_namaCustomer.setText("");
        txt_area_alamat.setText("");
        
    }
    private void loadData(){
        customerService = new CustomerServiceImpl();
        List<Customer> listCustomer = new ArrayList<>();
        listCustomer = customerService.findAll();
        Object [][] objectCustomer = new Object[listCustomer.size()][3];
        
        int counter = 0;
        for (Customer customer : listCustomer){
            objectCustomer [counter][0] = customer.getId();
            objectCustomer [counter][1] = customer.getNamaCustomer();
            objectCustomer [counter][2] = customer.getAlamat();
            
            counter ++;
            
        }
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
        objectCustomer, new String []{
            "ID Customer","Nama Customer", "Alamat Customer"
        }));
    }
    private void loadData(Customer customer){
        Object [][] objectCustomer = new Object[1][3];
        objectCustomer [0][0] = customer.getId();
        objectCustomer [0][1] = customer.getNamaCustomer();
        objectCustomer [0][2] = customer.getAlamat();
         tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
        objectCustomer, new String []{
            "ID Customer","Nama Customer", "Alamat Customer"
        }));
    }
    private Customer findCustomer (int id){
        Customer customer = new Customer();
        customerService = new CustomerServiceImpl();
        customer = customerService.findById(id);
        
        return customer;
    }
    public void close (){
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_namaCustomer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_alamat = new javax.swing.JTextArea();
        btn_save = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        txt_idCust = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_manageGame = new javax.swing.JButton();
        btn_manageAdmin = new javax.swing.JButton();
        btn_manageCust = new javax.swing.JButton();
        btn_managePs = new javax.swing.JButton();
        btn_logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to Customer Management Page");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("This page is management customer. here there is admin can control customer");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\playstation.png")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tbl_customer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Customer", "Nama Customer", "Alamat Customer"
            }
        ));
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_customer);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID Customer             :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama Customer       :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Alamat Customer     :");
        jLabel6.setToolTipText("");

        txt_area_alamat.setColumns(20);
        txt_area_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_area_alamat);

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_Edit.setText("Edit");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("LIST CUSTOMER");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idCust, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_namaCustomer))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                            .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_search, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_idCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_namaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\ri_home-5-line.png")); // NOI18N
        btn_home.setText("Home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_manageGame.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\teenyicons_game-controller-retro-outline.png")); // NOI18N
        btn_manageGame.setText("ManageGame");
        btn_manageGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageGameActionPerformed(evt);
            }
        });

        btn_manageAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\eos-icons_admin-outlined.png")); // NOI18N
        btn_manageAdmin.setText("Admin");
        btn_manageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageAdminActionPerformed(evt);
            }
        });

        btn_manageCust.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\mdi_people-group-outline.png")); // NOI18N
        btn_manageCust.setText("Manage Cust");

        btn_managePs.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\iconoir_playstation-gamepad_1.png")); // NOI18N
        btn_managePs.setText("Manage Ps");
        btn_managePs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managePsActionPerformed(evt);
            }
        });

        btn_logOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\ProjectImage\\simple-line-icons_logout.png")); // NOI18N
        btn_logOut.setText("Log Out");
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_manageGame, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_manageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_manageCust, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_managePs, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manageGame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_manageCust, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_managePs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_manageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageAdminActionPerformed
        
    }//GEN-LAST:event_btn_manageAdminActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        DashboardHomePage dashboardHomePage = new DashboardHomePage();
        dashboardHomePage.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_managePsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managePsActionPerformed
        DashboardManagePs dashboardManagePs = new DashboardManagePs();
        dashboardManagePs.setVisible(true);
    }//GEN-LAST:event_btn_managePsActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String namaCustomer,alamatCustomer;
        int id;
        customerService = new CustomerServiceImpl();
        id = Integer.parseInt(txt_idCust.getText());
        namaCustomer = txt_namaCustomer.getText();
        alamatCustomer = txt_area_alamat.getText();
        
        Customer customer = new Customer ();
        customer.setId(id);
        customer.setNamaCustomer(namaCustomer);
        customer.setAlamat(alamatCustomer);
        
        customerService.create(customer);
        JOptionPane.showMessageDialog(null, "Customer Added");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int id;
        customerService = new CustomerServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        id = Integer.parseInt(txt_idCust.getText());
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure want to delete it?",""
                + "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION){
            customerService.delete(id);
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        emptyField();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        String namaCustomer,alamatCustomer;
        int id;
        customerService = new CustomerServiceImpl();
        id = Integer.parseInt(txt_idCust.getText());
        namaCustomer = txt_namaCustomer.getText();
        alamatCustomer = txt_area_alamat.getText();
        
        Customer customer = new Customer ();
        customer.setId(id);
        customer.setNamaCustomer(namaCustomer);
        customer.setAlamat(alamatCustomer);
        
        customerService.update(customer);
        JOptionPane.showMessageDialog(null, "Customer Updated");
        loadData();
        emptyField();

    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("Report List Customer");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tbl_customer.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException e) {
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        loadData();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        int id;
        Customer searchedCustomer = new Customer();
        id = Integer.parseInt(txt_search.getText());
        searchedCustomer = findCustomer(id);
        if(searchedCustomer != null){
            loadData(searchedCustomer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Customer not founded");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_manageGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageGameActionPerformed
        // TODO add your handling code here:
        DashBoardManageGamePage dashBoardManageGamePage = new DashBoardManageGamePage();
        dashBoardManageGamePage.setVisible(true);
    }//GEN-LAST:event_btn_manageGameActionPerformed

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        close();
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        String namaCustomer,alamtCustomer;
        int id;
        int row = tbl_customer.getSelectedRow();

        id = Integer.parseInt(tbl_customer.getValueAt(row, 0).toString());
        namaCustomer = tbl_customer.getValueAt(row, 1).toString();
        alamtCustomer = tbl_customer.getValueAt(row, 2).toString();

        txt_idCust.setText(id+"");
        txt_namaCustomer.setText(namaCustomer);
        txt_area_alamat.setText(alamtCustomer);
    }//GEN-LAST:event_tbl_customerMouseClicked

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
            java.util.logging.Logger.getLogger(DashboardManageCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardManageCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardManageCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardManageCustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardManageCustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logOut;
    private javax.swing.JButton btn_manageAdmin;
    private javax.swing.JButton btn_manageCust;
    private javax.swing.JButton btn_manageGame;
    private javax.swing.JButton btn_managePs;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextArea txt_area_alamat;
    private javax.swing.JTextField txt_idCust;
    private javax.swing.JTextField txt_namaCustomer;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
