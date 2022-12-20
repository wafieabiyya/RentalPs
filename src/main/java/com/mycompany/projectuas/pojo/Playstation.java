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
   private String jensisPs;
   private String controllerPs;
   private double hargaSewa;

    public Playstation() {
    }

    public Playstation(Integer IdPs, String jensisPs, String controllerPs, double hargaSewa) {
        this.IdPs = IdPs;
        this.jensisPs = jensisPs;
        this.controllerPs = controllerPs;
        this.hargaSewa = hargaSewa;
    }

    public Integer getIdPs() {
        return IdPs;
    }

    public void setIdPs(Integer IdPs) {
        this.IdPs = IdPs;
    }

    public String getJensisPs() {
        return jensisPs;
    }

    public void setJensisPs(String jensisPs) {
        this.jensisPs = jensisPs;
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
