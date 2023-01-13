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
        Object [][] objectCustomer = new Object[listCustomer.size()][4];
        
        int counter = 0;
        for (Customer customer : listCustomer){
            objectCustomer [counter][0] = customer.getId();
            objectCustomer [counter][1] = customer.getNamaCustomer();
            objectCustomer [counter][2] = customer.getAlamat();
            objectCustomer [counter][3] = customer.getStatus();
            
            counter ++;
            
        }
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
        objectCustomer, new String []{
            "ID Customer","Nama Customer", "Alamat Customer, Status"
        }));
    }
    private void loadData(Customer customer){
        Object [][] objectCustomer = new Object[1][4];
        objectCustomer [0][0] = customer.getId();
        objectCustomer [0][1] = customer.getNamaCustomer();
        objectCustomer [0][2] = customer.getAlamat();
        objectCustomer [0][3] = customer.getStatus();
         tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
        objectCustomer, new String []{
            "ID Customer","Nama Customer", "Alamat Customer, Status"
        }));
    }
    private Customer findCustomer (String id){
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
        jLabel8 = new javax.swing.JLabel();
        cmb_status = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_manageGame = new javax.swing.JButton();
        btn_manageAdmin = new javax.swing.JButton();
        btn_managePs = new javax.swing.JButton();
        btn_customer = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        tbl_customer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Customer", "Nama Customer", "Alamat Customer", "Status"
            }
        ));
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_customer);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 380, 840, 170);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setText("ID Customer             :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 20, 220, 20);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("Nama Customer           :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 60, 220, 20);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setText("Alamat Customer         :");
        jLabel6.setToolTipText("");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 110, 220, 20);

        txt_namaCustomer.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_namaCustomer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(txt_namaCustomer);
        txt_namaCustomer.setBounds(240, 60, 212, 31);

        txt_area_alamat.setColumns(20);
        txt_area_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_area_alamat);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(240, 110, 212, 86);

        btn_save.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel3.add(btn_save);
        btn_save.setBounds(570, 10, 123, 48);

        btn_Edit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_Edit.setText("Edit");
        btn_Edit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Edit);
        btn_Edit.setBounds(570, 90, 123, 48);

        btn_delete.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete);
        btn_delete.setBounds(710, 10, 123, 48);

        btn_clear.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear);
        btn_clear.setBounds(710, 90, 123, 48);

        btn_print.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btn_print.setText("Print");
        btn_print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel3.add(btn_print);
        btn_print.setBounds(570, 150, 264, 48);

        txt_idCust.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_idCust.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(txt_idCust);
        txt_idCust.setBounds(238, 15, 55, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("LIST CUSTOMER");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 250, 139, 25);

        txt_search.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt_search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        jPanel3.add(txt_search);
        txt_search.setBounds(10, 280, 85, 36);

        btn_search.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_search.setText("Search");
        btn_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel3.add(btn_search);
        btn_search.setBounds(10, 340, 92, 19);

        btn_refresh.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 21, 98), 1, true));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel3.add(btn_refresh);
        btn_refresh.setBounds(110, 340, 91, 19);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setText("Status                  :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 210, 220, 20);

        cmb_status.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Non Member" }));
        cmb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_statusActionPerformed(evt);
            }
        });
        jPanel3.add(cmb_status);
        cmb_status.setBounds(240, 210, 121, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(120, 90, 850, 560);

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

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 3\\ISB-205 Pemrograman Berbasis Objek\\Project Rental PS\\RentalPs\\src\\main\\java\\IMAGE REPAIR\\playstation-logotype.png")); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 20, 70, 64);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 110, 680);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Manage Customer");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(270, 10, 410, 30);

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setText("This application helps manage the needs of the Playstation rental business easily.");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(60, 40, 730, 20);

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel12.setText("You can control anytime and anywhere through this application.");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(150, 60, 560, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(110, 0, 820, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String namaCustomer,alamatCustomer, statusCustomer,id;
        
        customerService = new CustomerServiceImpl();
        id = (txt_idCust.getText());
        namaCustomer = txt_namaCustomer.getText();
        alamatCustomer = txt_area_alamat.getText();
        statusCustomer = cmb_status.getSelectedItem().toString();
        
        Customer customer = new Customer ();
        customer.setId(id);
        customer.setNamaCustomer(namaCustomer);
        customer.setAlamat(alamatCustomer);
        customer.setStatus(statusCustomer);
        
        customerService.create(customer);
        JOptionPane.showMessageDialog(null, "Customer Added");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String id;
        customerService = new CustomerServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        id = (txt_idCust.getText());
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
        String namaCustomer,alamatCustomer, statusCustomer,id;
        
        customerService = new CustomerServiceImpl();
        id = (txt_idCust.getText());
        namaCustomer = txt_namaCustomer.getText();
        alamatCustomer = txt_area_alamat.getText();
        statusCustomer = cmb_status.getSelectedItem().toString();
        
        Customer customer = new Customer ();
        customer.setId(id);
        customer.setNamaCustomer(namaCustomer);
        customer.setAlamat(alamatCustomer);
        customer.setStatus(statusCustomer);
        
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
        String id;
        Customer searchedCustomer = new Customer();
        id = (txt_search.getText());
        searchedCustomer = findCustomer(id);
        if(searchedCustomer != null){
            loadData(searchedCustomer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Customer not founded");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        String namaCustomer,alamtCustomer, id;
       int row = tbl_customer.getSelectedRow();

        id = (tbl_customer.getValueAt(row, 0).toString());
        namaCustomer = tbl_customer.getValueAt(row, 1).toString();
        alamtCustomer = tbl_customer.getValueAt(row, 2).toString();

        txt_idCust.setText(id+"");
        txt_namaCustomer.setText(namaCustomer);
        txt_area_alamat.setText(alamtCustomer);
    }//GEN-LAST:event_tbl_customerMouseClicked

    private void cmb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_statusActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
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
        close();
    }//GEN-LAST:event_btn_managePsActionPerformed

    private void btn_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customerActionPerformed
        DashboardManageCustomerPage dashboardManageCustomerPage = new DashboardManageCustomerPage();
        dashboardManageCustomerPage.setVisible(true);
        close();
        dispose();
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
    private javax.swing.JButton btn_customer;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_manageAdmin;
    private javax.swing.JButton btn_manageGame;
    private javax.swing.JButton btn_managePs;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextArea txt_area_alamat;
    private javax.swing.JTextField txt_idCust;
    private javax.swing.JTextField txt_namaCustomer;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
