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
    private Integer idPenyewaan;
    String tanggal;
    private int lamaSewa;
    private Customer customer;
    private Game game;
    private Playstation playstation;

    public Penyewaan() {
    }

    public Penyewaan(Integer idPenyewaan, String tanggal, int lamaSewa, Customer customer, Game game, Playstation playstation) {
        this.idPenyewaan = idPenyewaan;
        this.tanggal = tanggal;
        this.lamaSewa = lamaSewa;
        this.customer = customer;
        this.game = game;
        this.playstation = playstation;
    }

    public Integer getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(Integer idPenyewaan) {
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

    

}
