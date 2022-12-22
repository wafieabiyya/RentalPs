/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import com.mycompany.projectuas.pojo.Admin;
import com.mycompany.projectuas.service.AdminService;
import com.mycompany.projectuas.serviceimpl.AdminServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ManageAdmin {
    static List<Admin> listAdmin = new ArrayList<>();
    static Admin admin;
    static AdminService adminService;
    static Scanner sc = new Scanner (System.in);
    
    public static void ViewManageAdmin(){
        int menu = 0;
        boolean endSesion = false;
        char choice = 0;
        
        do{
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD | Admin MANAGEMENT");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Admin");
            System.out.println("2. Update Admin");
            System.out.println("3. Delete Admin");
            System.out.println("4. Display All Admin");
            System.out.println("5. Find Admin by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan menu: ");
            
            menu = sc.nextInt();
            
            switch (menu) {
                case 1:
                    char display;
                    admin = new Admin();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        while (!endSesion);
      
    }
    public static void FindAllAdmin(List<Admin> listAdmin){
        for (Admin admin : listAdmin){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID Admin \t\t: "+admin.getID());
            System.out.println("Nama Admin\t\t: "+admin.getNamaAdmin());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }
    public static void insertAdmin(Admin admin){
        adminService = new AdminServiceImpl();
        String namaAdmin;
        
        System.out.print("Nama Admin: ");
        namaAdmin = sc.next();
        
        admin.setNamaAdmin(namaAdmin);
        adminService.create(admin);
        System.out.println("Successfully Added!");
        System.out.println("");
        
    }
    public static Admin  findAdmin(int updatedId){
        admin = new Admin();
        adminService = new AdminServiceImpl();
        
        return admin;
    }
    public static void editAdmin(Admin admin){
        adminService = new AdminServiceImpl();
        admin = new Admin();
        String namaAdmin;
        
        System.out.print("Nama Admin: ");
        namaAdmin = sc.next();
        
        admin.setNamaAdmin(namaAdmin);
        adminService.update(admin);
        System.out.println("Admin Edited!");
        System.out.println("");
        
    }
}
