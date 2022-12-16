/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class ConnectionManager {
    private String DB_URL ="jdbc:mysql://localhost:3306/";
    private String username;
    private String password;
    private Connection connection;

    public ConnectionManager(String username, String password, Connection connection) {
        this.username = username;
        this.password = password;
        this.connection = connection;
    }

    public String getDB_URL() {
        return DB_URL;
    }

    public void setDB_URL(String DB_URL) {
        this.DB_URL = DB_URL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public Connection connect (){
        if (connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(getDB_URL(), 
                        getUsername(), getPassword());
            } 
            catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ConnectionManager.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
