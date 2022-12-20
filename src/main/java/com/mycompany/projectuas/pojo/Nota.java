/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.pojo;

/**
 *
 * @author lenovo
 */
public class Nota {
    private Integer idNota;
    private Penyewaan penyewaan;
    private MenuMakanan menuMakanan;
    private MenuMinuman menuMinuman;

    public Nota() {
    }

    public Nota(Integer idNota, Penyewaan penyewaan, MenuMakanan menuMakanan, MenuMinuman menuMinuman) {
        this.idNota = idNota;
        this.penyewaan = penyewaan;
        this.menuMakanan = menuMakanan;
        this.menuMinuman = menuMinuman;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public Penyewaan getPenyewaan() {
        return penyewaan;
    }

    public void setPenyewaan(Penyewaan penyewaan) {
        this.penyewaan = penyewaan;
    }

    public MenuMakanan getMenuMakanan() {
        return menuMakanan;
    }

    public void setMenuMakanan(MenuMakanan menuMakanan) {
        this.menuMakanan = menuMakanan;
    }

    public MenuMinuman getMenuMinuman() {
        return menuMinuman;
    }

    public void setMenuMinuman(MenuMinuman menuMinuman) {
        this.menuMinuman = menuMinuman;
    }
    
}
