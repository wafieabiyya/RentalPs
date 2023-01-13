/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.pojo;

/**
 *
 * @author lenovo
 */
public class Penyewaan {
    private String idPenyewaan;
    String tanggal;
    private int lamaSewa;
    private Customer customer;
    private Game game;
    private Playstation playstation;
    private double totalHarga;

    public Penyewaan() {
    }

    public Penyewaan(String idPenyewaan, String tanggal, int lamaSewa, Customer customer, Game game, Playstation playstation, double totalHarga) {
        this.idPenyewaan = idPenyewaan;
        this.tanggal = tanggal;
        this.lamaSewa = lamaSewa;
        this.customer = customer;
        this.game = game;
        this.playstation = playstation;
        this.totalHarga = totalHarga;
    }

    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Playstation getPlaystation() {
        return playstation;
    }

    public void setPlaystation(Playstation playstation) {
        this.playstation = playstation;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    

}
