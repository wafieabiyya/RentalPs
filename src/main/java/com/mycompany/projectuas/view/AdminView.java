/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import com.mycompany.projectuas.pojo.Admin;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class AdminView {
    public static void menuAdmin(Admin admin) {
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD");
            System.out.println("+--------------------------------------");
            System.out.println("Selamat datang: " + admin.getUserName());
            System.out.println("[1] Manage Customer");
            System.out.println("[2] Manage Game");
            System.out.println("[3] Manage Playstation");
            System.out.println("[4] Penyewaan Playstation");
            System.out.println("[5] Logout");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    ManageCustomer.viewManageCustomer();
                break;
                case 2:
                    ManageGame.viewManageGame();
                break;
                case 3:
                    ManagePlaystation.viewManagePlaystation();
                break;
                case 4:
                    ManagePenyewaan.viewManagePenyewaan();
                break;
                case 5:
                    System.out.println("");
                    
                    System.out.print("Apakah ingin logout? Y/N: ");
                    scanner = new Scanner(System.in);
                    pilihan = scanner.next().charAt(0);
                    if (pilihan == 'y' || pilihan == 'Y') {
                        admin.setLoginStatus(false);
                        System.out.println("Logout!");
                        LoginPage.loginPage();
                    }
                break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                break;
            }
        } while (admin.isLoginStatus());
        System.out.println("Terima kasih sudah menggunakan aplikasi.");
        System.exit(0);
    }
}
