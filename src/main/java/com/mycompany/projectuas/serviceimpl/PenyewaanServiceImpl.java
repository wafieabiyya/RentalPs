/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.serviceimpl;

import com.mycompany.projectuas.pojo.Admin;
import com.mycompany.projectuas.pojo.Customer;
import com.mycompany.projectuas.pojo.Game;
import com.mycompany.projectuas.pojo.Penyewaan;
import com.mycompany.projectuas.pojo.Playstation;
import com.mycompany.projectuas.service.PenyewaanService;
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
public class PenyewaanServiceImpl implements PenyewaanService{
    
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    

    @Override
    public List<Penyewaan> findAll() {
        List<Penyewaan> listPenyewaan = new ArrayList<>();
        
        Penyewaan penyewaan = null;
        Customer customer = null;
        Playstation playstation = null;
        Game game = null;
        Admin admin = null;
        
        String query = 
                "SELECT pw.ID_penyewaan, pw.lama_sewa,"
                + "cs.ID_customer, cs.nama_customer, cs.alamat_customer,"
                + "ps.ID_ps, ps.jenis_ps, ps.controller_ps, ps.harga_sewa"
                + "gm.ID_game, gm.nama_game,"
                + "admin.ID_admin, admin.nama_admin FROM penyewaan pw, customer cs,"
                + "playstation ps, game gm, admin adm,"
                + "WHERE pw.ID_customer = cs.ID_customer "
                + "AND pw.ID_ps = ps.ID_ps AND pw.ID_game = gm.ID_game";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                penyewaan = new Penyewaan();
                penyewaan.setIdPenyewaan(rs.getInt("ID_penyewaan"));
                penyewaan.setLamaSewa(rs.getInt("lama_sewa"));
                
                customer = new Customer();
                customer.setId(rs.getInt("ID_customer"));
                customer.setNamaCustomer(rs.getString("nama_customer"));
                customer.setAlamat(rs.getString("alamat_customer"));
                
                playstation = new Playstation();
                playstation.setIdPs(rs.getInt("ID_ps"));
                playstation.setJenisPs(rs.getString("jenis_ps"));
                playstation.setControllerPs(rs.getString("controller_ps"));
                playstation.setHargaSewa(rs.getDouble("harga_sewa"));
                
                game = new Game();
                game.setID(rs.getInt("ID_game"));
                game.setNamaGame(rs.getString("nama_game"));
                
                admin = new Admin();
                admin.setID(rs.getInt("ID_admin"));
                admin.setNamaAdmin(rs.getString("nama_admin"));
                
                penyewaan.setCustomer(customer);
                penyewaan.setGame(game);
                penyewaan.setPlaystation(playstation);
                
                listPenyewaan.add(penyewaan);
                
            }
            conMan.dc();
        }
        catch (SQLException e) {
           Logger.getLogger(PenyewaanServiceImpl.class.getName()).
                   log(Level.SEVERE, null, e);
        }
      return listPenyewaan;
    }

    @Override
    public Integer create(Penyewaan object) {
      int result = 0;
      String query = "INSERT INTO penyewaan(lama_sewa, ID_game, ID_ps,"
              + " ID_customer) VALUES"
              + "("+object.getLamaSewa()+","
              + ""+object.getGame().getID()+","
              + ""+object.getPlaystation().getIdPs()+","
              + ""+object.getCustomer().getId()+")";
      conMan = new ConnectionManager();
      conn = conMan.connect();
      
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conMan.dc();     
        } catch (SQLException e) {
            Logger.getLogger(PenyewaanServiceImpl.class.getName()).
                    log(Level.SEVERE, null, e);
        }
      return result;
    }

    @Override
    public Integer update(Penyewaan object) {
       int result = 0;
       String query = "UPDATE penyewaan SET lama_sewa = "+object.getLamaSewa()+","
               + "ID_game = "+object.getGame().getID()+", "
               + "ID_ps = "+object.getPlaystation().getIdPs()+", "
               + "ID_customer = "+object.getCustomer().getId()+" "
               + "WHERE ID_penyewaan = "+object.getIdPenyewaan()+"";
       conMan = new ConnectionManager();
       conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conMan.dc();
        } catch (SQLException e) {
           Logger.getLogger(PenyewaanServiceImpl.class.getName()).
                   log(Level.SEVERE, null, e);
        }
       return result;
    }

    @Override
    public Penyewaan findById(int id) {
        
        Penyewaan penyewaan = null;
        Game game = null;
        Playstation playstation = null;
        Customer customer = null;
        Admin admin = null;
            
        String query ="SELECT pw.ID_penyewaan, pw.lama_sewa,"
                + "cs.ID_customer, cs.nama_customer, cs.alamat_customer,"
                + "ps.ID_ps, ps.jenis_ps, ps.controller_ps, ps.harga_sewa"
                + "gm.ID_game, gm.nama_game,"
                + "admin.ID_admin, admin.nama_admin FROM penyewaan pw, customer cs,"
                + "playstation ps, game gm, admin adm,"
                + "WHERE pw.ID_customer = cs.ID_customer "
                + "AND pw.ID_ps = ps.ID_ps "
                + "AND pw.ID_game = gm.ID_game"
                + "AND pw.ID_penyewaan = "+id+"";;
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()){
                penyewaan = new Penyewaan();
                penyewaan.setIdPenyewaan(rs.getInt("ID_penyewaan"));
                penyewaan.setLamaSewa(rs.getInt("lama_sewa"));
                
                customer = new Customer();
                customer.setId(rs.getInt("ID_customer"));
                customer.setNamaCustomer(rs.getString("nama_customer"));
                customer.setAlamat(rs.getString("alamat_customer"));
                
                playstation = new Playstation();
                playstation.setIdPs(rs.getInt("ID_ps"));
                playstation.setJenisPs(rs.getString("jenis_ps"));
                playstation.setControllerPs(rs.getString("controller_ps"));
                playstation.setHargaSewa(rs.getDouble("harga_sewa"));
                
                game = new Game();
                game.setID(rs.getInt("ID_game"));
                game.setNamaGame(rs.getString("nama_game"));
                
                admin = new Admin();
                admin.setID(rs.getInt("ID_admin"));
                admin.setNamaAdmin(rs.getString("nama_admin"));
                
                penyewaan.setCustomer(customer);
                
            }
        } catch (SQLException e) {
            Logger.getLogger(PenyewaanServiceImpl.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return penyewaan;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String query = "DELETE FROM penyewaan WHERE ID_penyewaan = "+id+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(PenyewaanServiceImpl.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;
    } 
}
