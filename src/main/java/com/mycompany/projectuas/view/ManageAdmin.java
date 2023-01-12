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
import javax.swing.SpringLayout;

/**
 *
 * @author lenovo
 */
public class ManageAdmin {
//    static List<Admin> listAdmin = new ArrayList<>();
//    static Admin admin = new Admin();
//    static AdminService adminService;
//    static Scanner sc = new Scanner (System.in);
//    
//    public static void ViewManageAdmin(){
//        int menu = 0;
//        boolean endSesion = false;
//        char choice = 0;
//        
//        do{
//            System.out.println("+--------------------------------------");
//            System.out.println("|ADMIN DASHBOARD | Admin MANAGEMENT");
//            System.out.println("+--------------------------------------");
//            System.out.println("1. Insert Admin");
//            System.out.println("2. Update Admin");
//            System.out.println("3. Delete Admin");
//            System.out.println("4. Display All Admin");
//            System.out.println("5. Find Admin by ID");
//            System.out.println("+--------------------------------------");
//            System.out.println("");
//            System.out.print("Masukkan pilihan menu: ");
//            
//            menu = sc.nextInt();
//            
//            switch (menu) {
//                case 1:
//                    char display;
//                    admin = new Admin();
//                    insertAdmin(admin);
//                    System.out.print("Apakah Data Ingin Ditampilkan? y/n: ");
//                    display = sc.next().charAt(0);
//                    if(display == 'Y'|| display == 'y'){
//                        adminService = new AdminServiceImpl();
//                        listAdmin = adminService.findAll();
//                        FindAllAdmin(listAdmin);
//                    }
//                    break;
//                case 2:
//                    int updadtedId;
//                    Admin updatedAdmin = new Admin();
//                    System.out.print("Masukan ID: ");
//                    updadtedId = sc.nextInt();
//                    updatedAdmin = findAdmin(updadtedId);
//                    System.out.println("Data Admin Yang Akan DiUpdate:");
//                    if (updatedAdmin != null){
//                        System.out.println("ID Admin: "+updatedAdmin.getID());
//                        System.out.println("Nama Admin: "+updatedAdmin.getNamaAdmin());  
//                    }
//                    else {
//                        System.out.println("Data Not Founded!");
//                    }
//                    System.out.println("");
//                    System.out.println("Insert New Data!");
//                    editAdmin(updatedAdmin.getID());
//                    
//                    break;
//                case 3:
//                    int deletedId;
//                    Admin deletedAdmin = new Admin();
//                    char confirmation;
//                    adminService = new AdminServiceImpl();
//                    
//                    System.out.print("Masukan ID: ");
//                    deletedId = sc.nextInt();
//                    deletedAdmin = findAdmin(deletedId);
//                    System.out.print("Yakin Untuk Menghapus ID? y/n: ");
//                    confirmation = sc.next().charAt(0);
//                    if (confirmation == 'Y'||confirmation == 'y'){
//                        adminService.delete(deletedId);
//                        System.out.println("Data Deleted!");
//                        System.out.println("");
//                    }
//                    else {
//                        System.out.println("Data Not Founded!");
//                    }
//                    break;
//                case 4:
//                    adminService = new AdminServiceImpl ();
//                    listAdmin = adminService.findAll();
//                    FindAllAdmin(listAdmin);
//                    break;
//                case 5:
//                    int searchedId;
//                    Admin searchedAdmin = new Admin();
//                    System.out.print("Masukan ID: ");
//                    searchedId = sc.nextInt();
//                    searchedAdmin = findAdmin(searchedId);
//                    if (searchedAdmin != null){
//                        System.out.println("-----------------------------------------------------------------");
//                        System.out.println("ID Admin \t\t: "+searchedAdmin.getID());
//                        System.out.println("Nama Admin \t\t: "+searchedAdmin.getNamaAdmin());
//                        System.out.println("-----------------------------------------------------------------");
//                    }
//                    else{
//                        System.out.println("Data Not Founded!");
//                    }
//                    break;
//                default:
//                    System.out.println("Pilihan yang Anda masukkan salah!");
//                 break;
//            }
//            System.out.println("");
//            System.out.print("Ingin Lanjut? y/n: ");
//            choice = sc.next().charAt(0);
//            if (choice == 'N'|| choice == 'n'){
//                endSesion = true;
//            } 
//        }
//        while (!endSesion);
//        System.out.println("Back To Main Menu");
//    }
//    public static void FindAllAdmin(List<Admin> listAdmin){
//        for (Admin admin : listAdmin){
//            System.out.println("-----------------------------------------------------------------");
//            System.out.println("ID Admin \t\t: "+admin.getID());
//            System.out.println("Nama Admin\t\t: "+admin.getNamaAdmin());
//            System.out.println("-----------------------------------------------------------------");
//            System.out.println("");
//        }
//    }
//    public static void insertAdmin(Admin admin){
//        adminService = new AdminServiceImpl();
//        String namaAdmin;
//        
//        System.out.print("Nama Admin: ");
//        namaAdmin = sc.next();
//        
//        admin.setNamaAdmin(namaAdmin);
//        adminService.create(admin);
//        System.out.println("Successfully Added!");
//        System.out.println("");
//        
//    }
//    public static Admin  findAdmin(int updatedId){
//        admin = new Admin();
//        adminService = new AdminServiceImpl();
//        admin = adminService.findById(updatedId);
//        
//        return admin;
//    }
//    public static void editAdmin(Integer Admin){
//        adminService = new AdminServiceImpl();
//        admin = new Admin();
//        String namaAdmin;
//        
//        System.out.print("Nama Admin: ");
//        namaAdmin = sc.next();
//        
//        admin.setNamaAdmin(namaAdmin);
//        adminService.update(admin);
//        System.out.println("Admin Edited!");
//        System.out.println(""); 
//    }
}
