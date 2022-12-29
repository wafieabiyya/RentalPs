/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.serviceimpl;

import com.mycompany.projectuas.pojo.Customer;
import com.mycompany.projectuas.service.CustomerService;
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
public class CustomerServiceImpl implements CustomerService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Customer> findAll() {
        List<Customer> listCustomer = new ArrayList<>();
        String query = "SELECT *FROM customer";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);
         while (rs.next()){
             Customer customer = new Customer();
             customer.setId(rs.getInt("ID_customer"));
             customer.setNamaCustomer(rs.getString("nama_customer"));
             customer.setAlamat(rs.getString("alamat_customer"));
             
             listCustomer.add(customer);
         }
         conMan.dc();
        } 
        catch (SQLException e) {
            Logger.getLogger(ConnectionManager.class.getName()).
                    log(Level.SEVERE, null,e);
        }
        
      return listCustomer;
    }
    
    @Override
    public Integer create(Customer object) {
        int result = 0;
        String query = "INSERT INTO customer (ID_customer, nama_customer, alamat_customer) "
                + "VALUES"
                + "("+object.getId()
                +",'"+object.getNamaCustomer()
                +"','"+object.getAlamat()+"')";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conMan.dc();
        } 
        catch (SQLException e) {
            Logger.getLogger(CustomerService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public Integer update(Customer object) {
    int result = 0;
        
        String query = "UPDATE customer Set nama_customer ="
                + "'"+object.getNamaCustomer()
                +"', alamat_customer='"+object.getAlamat()+"'"
                + "WHERE ID_customer = "+object.getId()+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
           result = stmt.executeUpdate(query);
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).
                    log(Level.SEVERE, null,e);
        }
        return result;
    }

    @Override
    public Customer findById(int id) {        
    Customer customer = null;
        String query = "SELECT * FROM customer WHERE ID_customer = " +id+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()){
                
                customer = new Customer();
                customer.setId(rs.getInt("ID_customer"));
                customer.setNamaCustomer(rs.getString("nama_customer"));
                customer.setAlamat(rs.getString("alamat_customer"));
            }
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(CustomerService.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return customer;
    }

    @Override
    public Integer delete(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    int result = 0;
        String query = "DELETE from customer WHERE ID_customer="+id+"";
        conMan = new ConnectionManager();
        conn = conMan.connect();
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(query);
            conMan.dc();
        } catch (SQLException e) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).
                    log(Level.SEVERE, null, e);
        }
        return result;
    }

}
