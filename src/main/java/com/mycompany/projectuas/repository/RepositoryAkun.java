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
    T login (String username, String password);
    
}
