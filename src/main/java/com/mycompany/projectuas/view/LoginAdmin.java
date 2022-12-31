/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;
import com.mycompany.projectuas.pojo.Akun;
import com.mycompany.projectuas.pojo.Admin;
import com.mycompany.projectuas.service.AdminService;
import com.mycompany.projectuas.service.AkunService;
import com.mycompany.projectuas.serviceimpl.AdminServiceImpl;
import com.mycompany.projectuas.serviceimpl.AkunServiceImpl;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class LoginAdmin {
    static Scanner sc = new Scanner (System.in);
    
    public static void login (){
        AkunService akunService = new AkunServiceImpl();
        AdminService adminService = new AdminServiceImpl();
        Admin admin;
        Akun akun = null;
        String username, password;
        boolean login = false;
        do {            
            System.out.println("+-------------------------------------------+");
            System.out.println("|LOGIN ADMIN                                |");
            System.out.println("+-------------------------------------------+");
            System.out.print("| Username: ");
            username = sc.nextLine();
            System.out.print("| Password: ");
            password = sc.nextLine();
            System.out.println("+-------------------------------------------+");
            System.out.println();
            admin = akunService.login(username, password);
            
      if ( admin !=null ){
          login = true;
          admin.setLoginStatus(true);
          System.out.println("Login Sucessfull");
          System.out.println("");
          AdminView.menuAdmin(admin);
        }
      else {
          System.out.println("Akun anda belum terdaftar, silahkan buat...");
                  
      }
        } while (!login);

    }
}
