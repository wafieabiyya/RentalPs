/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.serviceimpl;

import com.mycompany.projectuas.pojo.Admin;
import com.mycompany.projectuas.pojo.Akun;
import com.mycompany.projectuas.service.AkunService;
import com.mycompany.projectuas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lenovo
 */
public class AkunServiceImpl implements AkunService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stm;
    ResultSet rs;

    @Override
    public Admin login(String username, String password) {
       Admin admin = null;
       Akun akun = null;
       String query = "SELECT adm.ID_admin, adm.nama_admin,"
               + "ak.ID_akun, ak.email, ak.username, ak.password "
               + "FROM admin adm, akun ak "
               + "WHERE adm.ID_akun = ak.ID_akun "
               + "AND ak.username = '"+username+"' "
               + "AND ak.password = '"+password+"'";
       
       conMan = new ConnectionManager();
       conn = conMan.connect();
       
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(query);
            while(rs.next()){
                
                admin = new Admin();
                
                admin.setID(rs.getInt("ID_admin"));
                admin.setNamaAdmin(rs.getString("nama_admin"));
                
                akun = new Akun();
                
                akun.setID(rs.getInt("ID_akun"));
                akun.setEmail(rs.getString("email"));
                akun.setUsername(rs.getString("username"));
                akun.setPassword(rs.getString("password"));
                
                admin.setAkun(akun);
            }
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(AdminServiceImpl.class.getName()).
                    log(Level.SEVERE, null, e);
        }
       
       return admin;
    }   
}
