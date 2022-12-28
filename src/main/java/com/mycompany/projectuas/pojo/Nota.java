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
    private double totalBayar;

    public Nota() {
    }

    public Nota(Integer idNota, Penyewaan penyewaan, double totalBayar) {
        this.idNota = idNota;
        this.penyewaan = penyewaan;
        this.totalBayar = totalBayar;
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

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
    public void totalBayar(){
        totalBayar = penyewaan.getLamaSewa()*penyewaan.getPlaystation().getHargaSewa();     
    }
}
