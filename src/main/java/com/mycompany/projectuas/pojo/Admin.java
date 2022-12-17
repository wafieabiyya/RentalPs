/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.pojo;

/**
 *
 * @author lenovo
 */
public class Admin {
    private Integer ID;
    private String namaDepan;
    private String namaBelakang;
    private int umur;
    private String jobDesk;
    private boolean statusAdmin;
    private Akun akun;    

    public Admin() {
    }

    public Admin(Integer ID, String namaDepan, String namaBelakang, int umur, String jobDesk, boolean statusAdmin, Akun akun) {
        this.ID = ID;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.umur = umur;
        this.jobDesk = jobDesk;
        this.statusAdmin = statusAdmin;
        this.akun = akun;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJobDesk() {
        return jobDesk;
    }

    public void setJobDesk(String jobDesk) {
        this.jobDesk = jobDesk;
    }

    public boolean isStatusAdmin() {
        return statusAdmin;
    }

    public void setStatusAdmin(boolean statusAdmin) {
        this.statusAdmin = statusAdmin;
    }

    public Akun getAkun() {
        return akun;
    }

    public void setAkun(Akun akun) {
        this.akun = akun;
    }
    
    
    
}
