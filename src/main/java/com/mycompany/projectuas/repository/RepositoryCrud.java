/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projectuas.repository;

import java.util.List;

/**
 *
 * @author lenovo
 */
public interface RepositoryCrud <T, ID>{
    List <T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(String id);
    ID delete(String id);
}
