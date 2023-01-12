/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projectuas.repository;

/**
 *
 * @author lenovo
 */
public interface RepositoryAkun<T,ID> {
    int login (String username, String password);
    boolean Register (String namaAdmin, String email, String username, String password);
    
}
