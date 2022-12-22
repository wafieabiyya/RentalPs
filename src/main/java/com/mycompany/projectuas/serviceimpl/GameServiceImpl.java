/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.serviceimpl;

import com.mycompany.projectuas.pojo.Game;
import com.mycompany.projectuas.service.GameService;
import com.mycompany.projectuas.utilities.ConnectionManager;
import java.sql.ResultSet;
import java.sql.Connection;
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
public class GameServiceImpl implements GameService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stm;
    ResultSet rs;
    

    @Override
    public List<Game> findAll() {
        List<Game> listGame = new ArrayList<>();
        String query = "SELECT *FROM Game";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()){
                Game game = new Game();
                game.setID(rs.getInt("ID_game"));
                game.setNamaGame(rs.getString("nama_game"));
                
                listGame.add(game);
            }
            conMan.dc();
            
        } catch (SQLException e) {
            Logger.getLogger(GameService.class.getName()).
                    log(Level.SEVERE, null, e);
        } 
        return listGame;
    }

    @Override
    public Integer create(Game object) {
        int result = 0;
        String query = "INSERT INTO Game (ID_game, nama_game) "
                + "VALUES"
                + "("+object.getID()
                +",'"+object.getNamaGame()+"')";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stm = conn.createStatement();
            stm.executeUpdate(query);
            conMan.dc();
        } 
        catch (SQLException e) {
            Logger.getLogger(GameServiceImpl.class.getName()).
                    log(Level.SEVERE, null, e);
        }
         return result;
    }

    @Override
    public Integer update(Game object) {
        int result = 0;
        
        String query = "UPDATE Game Set nama_game = '"
                +object.getNamaGame()+"', "
                + "WHERE ID_game = "
                +object.getID()+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stm = conn.createStatement();
            result = stm.executeUpdate(query);
            conn = conMan.dc();
            
        } catch (Exception e) {
            Logger.getLogger(GameService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public Game findById(int id) {
        Game game = null;
        String query = "SELECT *FROM Game WHERE ID_game = "+id+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
           stm = conn.createStatement();
           rs = stm.executeQuery(query);
           conn = conMan.dc();
        } catch (Exception e) {
            Logger.getLogger(GameService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return game;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String query = "DELTE Game WHERE ID_game = "+id+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stm = conn.createStatement();
            result = stm.executeUpdate(query);
            
            conn = conMan.dc();
        } catch (Exception e) {
            Logger.getLogger(GameService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;   
    } 
}
