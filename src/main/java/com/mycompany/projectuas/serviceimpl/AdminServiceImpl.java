/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.serviceimpl;

import com.mycompany.projectuas.pojo.Admin;
import com.mycompany.projectuas.service.AdminService;
import com.mycompany.projectuas.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class AdminServiceImpl implements AdminService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Admin> findAll() {
        List<Admin> listAdmin = new ArrayList<>();
        String query = "SELECT *FROM Admin";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);
         while (rs.next()){
             Admin admin = new Admin();
             admin.setID(rs.getInt("ID_admin"));
             admin.setNamaAdmin(rs.getString("nama_admin"));
             
             listAdmin.add(admin);
         }
         conMan.dc();
        } 
        catch (SQLException e) {
            Logger.getLogger(ConnectionManager.class.getName()).
                    log(Level.SEVERE, null,e);
        }
        
      return listAdmin;
    }

    @Override
    public Integer create(Admin object) {
        int result = 0;
        String query = "INSERT INTO Admin (ID_admin, nama_admin) "
                + "VALUES"
                + "("+object.getID()
                +",'"+object.getNamaAdmin()+"')";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conMan.dc();
        } 
        catch (SQLException e) {
            Logger.getLogger(AdminService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public Integer update(Admin object) {
        int result = 0;
        
        String query = "UPDATE Admin Set nama_admin = '"+object.getNamaAdmin()+"', "
                + "WHERE ID_admin = "+object.getID()+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
           result = stmt.executeUpdate(query);
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(AdminServiceImpl.class.getName()).
                    log(Level.SEVERE, null,e);
        }
        return result;
    }

    @Override
    public Admin findById(int id) {
        Admin admin = null;
        String query = "SELECT * FROM Admin WHERE ID_admin = " +id+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()){
                
                admin = new Admin();
                admin.setID(rs.getInt("ID_admin"));
                admin.setNamaAdmin(rs.getString("nama_admin"));
            }
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(AdminService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return admin;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String query = "DELETE Admin WHERE ID_admin = "+id+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(AdminServiceImpl.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;
    }
    
}
