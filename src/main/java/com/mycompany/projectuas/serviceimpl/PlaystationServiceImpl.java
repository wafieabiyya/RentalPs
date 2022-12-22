/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.serviceimpl;

import com.mycompany.projectuas.pojo.Playstation;
import com.mycompany.projectuas.service.PlaystationService;
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
public class PlaystationServiceImpl implements PlaystationService{

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    
    @Override
    public List<Playstation> findAll() {
        List<Playstation> listPlaystation = new ArrayList<>();
        String query = "SELECT *FROM playstation";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);
         while (rs.next()){
             Playstation playstation = new Playstation();
             playstation.setIdPs(rs.getInt("ID_ps"));
             playstation.setJensisPs(rs.getString("jenis_ps"));
             playstation.setControllerPs(rs.getString("controller_ps"));
             playstation.setHargaSewa(rs.getDouble("harga_sewa"));
             listPlaystation.add(playstation);
         }
         conMan.dc();
        } 
        catch (SQLException e) {
            Logger.getLogger(ConnectionManager.class.getName()).
                    log(Level.SEVERE, null,e);
        }
        
      return listPlaystation;
    }

    @Override
    public Integer create(Playstation object) {
    int result = 0;
        String query = "INSERT INTO playstation (ID_ps, jenis_ps, controller_ps, harga_sewa) "
                + "VALUES"
                + "("+object.getIdPs()
                +",'"+object.getJensisPs()
                +",'"+object.getControllerPs()
                +",'"+object.getHargaSewa()
                +"')";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conMan.dc();
        } 
        catch (SQLException e) {
            Logger.getLogger(PlaystationService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;    
    }

    @Override
    public Integer update(Playstation object) {
//        int result = 0;
//        
//        String query = "UPDATE playstation Set nama_customer ="
//                + " '"+object.getNamaCustomer()
//                +"','"+object.getAlamat()+"'"
//                + "WHERE ID_customer = "+object.getId()+"";
//        conMan = new ConnectionManager();
//        conn = conMan.connect();
//        
//        try {
//            stmt = conn.createStatement();
//           result = stmt.executeUpdate(query);
//            conMan.dc();
//        } catch (SQLException e) {
//            Logger.getLogger(CustomerServiceImpl.class.getName()).
//                    log(Level.SEVERE, null,e);
//        }
//        return result;
    }

    @Override
    public Playstation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
