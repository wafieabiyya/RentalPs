/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import com.mycompany.projectuas.pojo.Nota;
import com.mycompany.projectuas.pojo.Penyewaan;
import com.mycompany.projectuas.service.NotaService;
import com.mycompany.projectuas.serviceimpl.PenyewaanServiceImpl;
import static com.mycompany.projectuas.view.ManagePenyewaan.listPenyewaan;
import static com.mycompany.projectuas.view.ManagePenyewaan.penyewaan;
import static com.mycompany.projectuas.view.ManagePenyewaan.penyewaanService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ManageNota {
    static List<Nota> listNota = new ArrayList<>();
    static Nota nota;
    static NotaService notaService;
    static Scanner sc = new Scanner (System.in);
    
    public static void viewManageNota(){
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD | PRINT NOTA");
            System.out.println("+--------------------------------------");
            System.out.println("1. Display All Penyewaan");
            System.out.println("2. Print Nota by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.println("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    penyewaanService = new PenyewaanServiceImpl();
                    listPenyewaan = penyewaanService.findAll();
                    findAllPenyewaan(listPenyewaan);
                break;
                case 2:
                    int searchedId;
                    Penyewaan searchedPenyewaan = new Penyewaan();
                    System.out.println("Masukkan ID Penyewaan: ");
                    searchedId = scanner.nextInt();
                    searchedPenyewaan = findPenyewaan(searchedId);
                    if (searchedPenyewaan != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID Penyewaan\t\t: " + searchedPenyewaan.getIdPenyewaan());
                        System.out.println("Tanggal Sewa\t: " + searchedPenyewaan.getTanggal());
                        System.out.println("Lama Sewa\t: " + searchedPenyewaan.getLamaSewa());
                        System.out.println("Customer\t: " + searchedPenyewaan.getCustomer().getNamaCustomer());
                        System.out.println("Playstation\t\t: " + searchedPenyewaan.getPlaystation().getJenisPs());
                        System.out.println("Harga Sewa\t\t: " + searchedPenyewaan.getPlaystation().getHargaSewa());
                        System.out.println("=========================================");
                        System.out.println("Total Harga\t\t: " + nota.getTotalBayar());
                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                break;
            }
            System.out.println("");
            System.out.println("Apakah ingin melanjutkan? y/n: ");
            scanner = new Scanner(System.in);
            pilihan = scanner.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                keluar = true;
            }
            
        } while (!keluar);
        System.out.println("Kembali ke menu utama!"); 
    }
    
    private static void findAllPenyewaan (List<Penyewaan> listPenyewaan){
       for (Penyewaan penyewaan : listPenyewaan){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID\t\t: " + penyewaan.getIdPenyewaan());
            System.out.println("Tanggal Penyewaan\t: "+penyewaan.getTanggal());
            System.out.println("Customer\t: " + penyewaan.getCustomer().getNamaCustomer());
            System.out.println("Lama Sewa\t: " + penyewaan.getLamaSewa());
            System.out.println("Playstation\t: " + penyewaan.getPlaystation().getJenisPs());
            System.out.println("Harga Sewa\t: "+penyewaan.getPlaystation().getHargaSewa());
                    
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");    
       }
    }
    
    private static Penyewaan findPenyewaan (int updatedId){
       penyewaan = new Penyewaan();
       penyewaanService = new PenyewaanServiceImpl();
       penyewaan = penyewaanService.findById(updatedId);
       
       return penyewaan;
   }
}
