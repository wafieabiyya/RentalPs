/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import com.mycompany.projectuas.pojo.Playstation;
import com.mycompany.projectuas.service.PlaystationService;
import com.mycompany.projectuas.serviceimpl.PlaystationServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ManagePlaystation {
     static List<Playstation> listPlaystation = new ArrayList<>();
    static Playstation playstation;
    static PlaystationService playstationService;
    static Scanner scanner;
    
    public static void viewManageCustomer(){
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD | PLAYSTATION MANAGEMENT");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Playstation");
            System.out.println("2. Update Playstation");
            System.out.println("3. Delete Playstation");
            System.out.println("4. Display All Playstation");
            System.out.println("5. Find Playstation by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    playstation = new Playstation();
                    insertPlaystation(playstation); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        playstationService = new PlaystationServiceImpl();
                        listPlaystation = playstationService.findAll();
                        findAllPlaystation(listPlaystation);
                    }
                break;
                case 2:
                    int updatedId;
                    Playstation updatedPlaystation = new Playstation();
                    System.out.println("Masukkan ID Customert: ");
                    updatedId = scanner.nextInt();
                    updatedPlaystation = findPlaystation(updatedId);
                    System.out.println("Data obat yang akan diupdate: ");
                    if (updatedPlaystation != null) {
                        System.out.println("ID Playstation: " + updatedPlaystation.getIdPs());
                        System.out.println("Jenis Playstation: " + updatedPlaystation.getJenisPs());
                        System.out.println("Controller Playstation: " + updatedPlaystation.getControllerPs());
                        System.out.println("Harga Sewa: " + updatedPlaystation.getHargaSewa());
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editCustomer(updatedPlaystation.getIdPs());
                break;
                case 3:
                    int deletedId;
                    Playstation deletedPlaystation = new Playstation();
                    char confirmation;
                    playstationService = new PlaystationServiceImpl();
                    
                    System.out.println("Masukkan ID Customer: ");
                    deletedId = scanner.nextInt();
                    deletedPlaystation = findPlaystation(deletedId);
                    System.out.println("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = scanner.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedPlaystation != null) {
                            playstationService.delete(deletedId);
                            System.out.println("Data berhasil dihapus...!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                break;
                case 4:
                    playstationService = new PlaystationServiceImpl();
                    listPlaystation = playstationService.findAll();
                    findAllPlaystation(listPlaystation);
                break;
                case 5:
                    int searchedId;
                    Playstation searchedPlaystation = new Playstation();
                    System.out.println("Masukkan ID Obat: ");
                    searchedId = scanner.nextInt();
                    searchedPlaystation = findPlaystation(searchedId);
                    if (searchedPlaystation != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID PS\t\t: " + searchedPlaystation.getIdPs());
                        System.out.println("Jenis PS\t: " + searchedPlaystation.getJenisPs());
                        System.out.println("Controller PS\t\t: " + searchedPlaystation.getControllerPs());
                        System.out.println("Harga Sewa\t\t: " + searchedPlaystation.getHargaSewa());
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
       
    
    private static void findAllPlaystation(List<Playstation> listPlaystation) {
        for (Playstation playstation : listPlaystation) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID PS\t\t: " + playstation.getIdPs());
            System.out.println("Jenis PS\t: " + playstation.getJenisPs());
            System.out.println("Controller PS\t\t: " + playstation.getControllerPs());
            System.out.println("Harga Sewa\t\t: " + playstation.getHargaSewa());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }
    
    private static void insertPlaystation(Playstation playstation) {
        scanner = new Scanner(System.in);
        playstationService = new PlaystationServiceImpl();
        String jenisPlaystation, controllerPlaystation;
        double hargaSewa;
        
        System.out.println("Jenis Playstation: ");
        jenisPlaystation = scanner.nextLine();
        System.out.println("Controller Playstation: ");
        controllerPlaystation = scanner.nextLine();
        System.out.println("Harga Sewa: ");
        hargaSewa = scanner.nextDouble();
        
        playstation.setJenisPs(jenisPlaystation);
        playstation.setControllerPs(controllerPlaystation);
        playstation.setHargaSewa(hargaSewa);
        
        playstationService.create(playstation);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static Playstation findPlaystation(int updatedId) {
        playstation= new Playstation();
        playstationService = new PlaystationServiceImpl();
        playstation = playstationService.findById(updatedId);
    
        return playstation;
    }

    private static void editCustomer(Integer id) {
        scanner = new Scanner(System.in);
        playstationService = new PlaystationServiceImpl();
        playstation = new Playstation();
       String jenisPlaystation, controllerPlaystation;
        double hargaSewa;
        
        System.out.println("Jenis Playstation: ");
        jenisPlaystation = scanner.nextLine();
        System.out.println("Controller Playstation: ");
        controllerPlaystation = scanner.nextLine();
        System.out.println("Harga Sewa: ");
        hargaSewa = scanner.nextDouble();
        
        playstation.setJenisPs(jenisPlaystation);
        playstation.setControllerPs(controllerPlaystation);
        playstation.setHargaSewa(hargaSewa);
        
        System.out.println("ID..." + playstation.getIdPs());
        
        playstationService.update(playstation);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
}
