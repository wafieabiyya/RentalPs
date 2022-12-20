/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.pojo;

/**
 *
 * @author lenovo
 */
public class MenuMakanan {
    private Integer ID;
    private String namaMakanan;
    private double hargaMakanan;

    public MenuMakanan() {
    }

    public MenuMakanan(Integer ID, String namaMakanan, double hargaMakanan) {
        this.ID = ID;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
    
    
}
