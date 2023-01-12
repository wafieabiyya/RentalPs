/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.serviceimpl;

import com.mycompany.projectuas.service.AdminService;
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
public class AdminServiceImpl implements AdminService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public int login(String username, String password) {
        int login = 0;
        conMan = new ConnectionManager();
        conn = conMan.connect();
        String query = "SELECT *FROM admin WHERE username='"+username+"'"
                + " AND password='"+password+"'";
        try {
           stmt = conn.createStatement();
           rs = stmt.executeQuery(query);
           while(rs.next()){
               if(username.equals(rs.getString("username"))&& password.equals(rs.getString("password"))){
                  login = 1; 
               }
               else{
                   login =0;
               }
           }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return login;
    }

    @Override
    public boolean Register(String namaAdmin, String email, String username, String password) {
        conMan = new ConnectionManager();
        conn = conMan.connect();
        String query = "INSERT INTO Admin Values"
                    + "('"+namaAdmin+"'"
                    + ",'"+email+"'"
                    + ",'"+username+"'"
                    + ",'"+password+"')";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            Logger.getLogger(AdminServiceImpl.class.getName()).
                    log(Level.SEVERE, null,e);
            return false;
            }
        }           
    }