/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.pojo;

/**
 *
 * @author lenovo
 */
public class Playstation {
   private Integer IdPs;
   private String jenisPs;
   private String controllerPs;
   private double hargaSewa;

    public Playstation() {
    }

    public Playstation(Integer IdPs, String jenisPs, String controllerPs, double hargaSewa) {
        this.IdPs = IdPs;
        this.jenisPs = jenisPs;
        this.controllerPs = controllerPs;
        this.hargaSewa = hargaSewa;
    }

    public Integer getIdPs() {
        return IdPs;
    }

    public void setIdPs(Integer IdPs) {
        this.IdPs = IdPs;
    }

    public String getJenisPs() {
        return jenisPs;
    }

    public void setJenisPs(String jenisPs) {
        this.jenisPs = jenisPs;
    }

    public String getControllerPs() {
        return controllerPs;
    }

    public void setControllerPs(String controllerPs) {
        this.controllerPs = controllerPs;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    
    
  }
