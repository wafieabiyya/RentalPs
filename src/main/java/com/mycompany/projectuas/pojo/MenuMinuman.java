/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.pojo;

/**
 *
 * @author lenovo
 */
public class MenuMinuman {
    private Integer ID;
    private String namaMinuman;
    private double hargaMinuman;

    public MenuMinuman() {
    }

    public MenuMinuman(Integer ID, String namaMinuman, double hargaMinuman) {
        this.ID = ID;
        this.namaMinuman = namaMinuman;
        this.hargaMinuman = hargaMinuman;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public double getHargaMinuman() {
        return hargaMinuman;
    }

    public void setHargaMinuman(double hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }
    
}
