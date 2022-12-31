/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import static com.mycompany.projectuas.view.ManageAdmin.admin;
//import static com.mycompany.projectuas.view.RegisterAdmin.akun;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class LoginPage {
    
    public static void main(String[] args) {
        loginPage();
    }
    
     public static void loginPage() {
    int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|GAMERY PLAYSTATION");
            System.out.println("+--------------------------------------");
            System.out.println("Selamat datang, silakan melakukan login terlebih dahulu");
            System.out.println("[1] Register Admin");
            System.out.println("[2] Login Admin");
            System.out.println("[3] Exit");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            
            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Pilihan harus dalam Angka");
            }
            
            switch (menu) {
                case 1:
                    ManageAdmin.ViewManageAdmin();
                    ;
                break;
                case 2:
                   LoginAdmin.login();
                break;
                case 3:
                    System.out.println("Keluar aplikasi...!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                break;
            }
            System.out.println("");
            System.out.print("Apakah ingin melanjutkan? y/n: ");
            scanner = new Scanner(System.in);
            pilihan = scanner.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                keluar = true;
            }    
        } while (!keluar);
        System.out.println("Terima kasih sudah menggunakan aplikasi.");
        System.exit(0);
    }
}