/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import com.mycompany.projectuas.pojo.Customer;
import com.mycompany.projectuas.pojo.Game;
import com.mycompany.projectuas.pojo.Penyewaan;
import com.mycompany.projectuas.pojo.Playstation;
import com.mycompany.projectuas.service.CustomerService;
import com.mycompany.projectuas.service.PenyewaanService;
import com.mycompany.projectuas.service.GameService;
import com.mycompany.projectuas.service.PlaystationService;
import com.mycompany.projectuas.serviceimpl.CustomerServiceImpl;
import com.mycompany.projectuas.serviceimpl.PenyewaanServiceImpl;
import com.mycompany.projectuas.serviceimpl.GameServiceImpl;
import com.mycompany.projectuas.serviceimpl.PlaystationServiceImpl;
import static com.mycompany.projectuas.view.ManageCustomer.customerService;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ManagePenyewaan {
    
    static List<Penyewaan> listPenyewaan = new ArrayList<>();
    static Penyewaan penyewaan;
    static PenyewaanService penyewaanService;
    static Playstation playstation;
    static Game gameService;
    static Scanner sc = new Scanner (System.in);
    
    public static void viewManagePenyewaan(){
        int menu;
        boolean endSesion = false;
        char choice;
        do {      
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD | PENYEWAAN PS");
            System.out.println("+--------------------------------------");
            System.out.println("1. Create Penyewaan");
            System.out.println("2. Update Penyewaan");
            System.out.println("3. Delete Penyewaan");
            System.out.println("4. Display All Penyewaan");
            System.out.println("5. Find Penyewaan by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    penyewaan = new Penyewaan();
                    insertPenyewaan(penyewaan); 
                    System.out.println("Apakah ingin menampilkan data? y/Y: ");
                    tampil = sc.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        penyewaanService = new PenyewaanServiceImpl();
                        listPenyewaan = penyewaanService.findAll();
                        findAllPenyewaan(listPenyewaan);
                    }
                    break;
                case 2:
                    int updatedId;
                    Penyewaan updatedPenyewaan = new Penyewaan();
                    System.out.println("Masukkan ID Penyewaan: ");
                    updatedId = sc.nextInt();
                    updatedPenyewaan = findPenyewaan(updatedId);
                    System.out.println("Data Penyewaan yang akan diupdate: ");
                    if (updatedPenyewaan != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID\t\t\t: " + updatedPenyewaan.getIdPenyewaan());
                        System.out.println("Tanggal Penyewaan\t: " + updatedPenyewaan.getTanggal());
                        System.out.println("Lama Sewa\t\t: " + updatedPenyewaan.getLamaSewa());
                        System.out.println("Customer\t\t: " + updatedPenyewaan.getCustomer().getNamaCustomer());
                        System.out.println("Game\t\t: " + updatedPenyewaan.getGame().getNamaGame());
                        System.out.println("Playstation\t\t: " + updatedPenyewaan.getPlaystation().getJenisPs());
                        System.out.println("Harga Sewa\t\t: " + updatedPenyewaan.getPlaystation().getHargaSewa());
                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editPenyewaan(updatedPenyewaan.getIdPenyewaan());

                    break;
                case 3:
                    int deletedId;
                    Penyewaan deletedPenyewaan = new Penyewaan();
                    char confirmation;
                    penyewaanService = new PenyewaanServiceImpl();
                    
                    System.out.println("Masukkan ID Penyewaan: ");
                    deletedId = sc.nextInt();
                    deletedPenyewaan = findPenyewaan(deletedId);
                    System.out.println("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = sc.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedPenyewaan != null) {
                            penyewaanService.delete(deletedId);
                            System.out.println("Data berhasil dihapus...!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                    break;
                case 4:
                    penyewaanService = new PenyewaanServiceImpl();
                    listPenyewaan = penyewaanService.findAll();
                    findAllPenyewaan(listPenyewaan);
                    break;
                case 5:
                    int searchedId;
                    Penyewaan searchedPenyewaan = new Penyewaan();
                    System.out.println("Masukkan ID Penyewaan: ");
                    searchedId = sc.nextInt();
                    searchedPenyewaan = findPenyewaan(searchedId);
                    if (searchedPenyewaan != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID\t\t: " + searchedPenyewaan.getIdPenyewaan());
                        System.out.println("Tanggal Penyewaan\t: " + searchedPenyewaan.getTanggal());
                        System.out.println("Lama Sewa\t\t\t: " + searchedPenyewaan.getLamaSewa());
                        System.out.println("Customer\t\t\t: " + searchedPenyewaan.getCustomer().getNamaCustomer());
                        System.out.println("Game\t\t\t: " + searchedPenyewaan.getGame().getNamaGame());
                        System.out.println("Playstation\t\t\t: " + searchedPenyewaan.getPlaystation().getJenisPs());
                        System.out.println("Harga Sewa\t\t\t: " + searchedPenyewaan.getPlaystation().getHargaSewa());
                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
                    
                default:
                    break;
            }
            System.out.println("");
            System.out.print("Apakah anda ingin melanjutkan? Y/N: ");
            choice = sc.next().charAt(0);
            if (choice == 'N'|| choice == 'n'){
                endSesion = true;
            } 
        }
        while (!endSesion);
        System.out.println("Kembali Ke Menu Utama");
    }
   private static void findAllPenyewaan (List<Penyewaan> listPenyewaan){
       for (Penyewaan penyewaan : listPenyewaan){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID\t\t\t: " + penyewaan.getIdPenyewaan());
            System.out.println("Tanggal Penyewaan\t: "+penyewaan.getTanggal());
            System.out.println("Customer\t\t: " + penyewaan.getCustomer().getNamaCustomer());
            System.out.println("Lama Sewa\t\t: " + penyewaan.getLamaSewa());
            System.out.println("Playstation\t\t: " + penyewaan.getPlaystation().getJenisPs());
            System.out.println("Harga Sewa\t\t: "+penyewaan.getPlaystation().getHargaSewa());                 
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");    
       }
   }
   private static void insertPenyewaan (Penyewaan penyewaan){
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       
       sc = new Scanner(System.in);
       penyewaanService = new PenyewaanServiceImpl();
       CustomerService customerService = new CustomerServiceImpl();
       GameService gameService = new GameServiceImpl();
       PlaystationService playstationService = new PlaystationServiceImpl();
       
       List<Customer> listCustomer = customerService.findAll();
       List<Game> listGame = gameService.findAll();
       List<Playstation> listPlaystation = playstationService.findAll();
      
       String tanggal;
       
       int lama_sewa,
           id_customer, 
           id_game, 
           id_playstation;
      
       System.out.print("Tanggal: ");
       tanggal = sc.nextLine();
       Date date = new Date();
       LocalDate localDate = LocalDate.parse(tanggal,formatter);
       String tanggalPenyewaan = localDate.toString();
       
       System.out.print("Lama Sewa: ");
       lama_sewa = sc.nextInt();
       
       System.out.println("Daftar Customer:");
       for(Customer customer : listCustomer){
           System.out.println("["+customer.getId()+"]"+" - "+customer.getNamaCustomer());
       }
       System.out.print("Pilih Id Customer: ");
       id_customer = sc.nextInt();
       System.out.println("");
       
       System.out.println("Daftar Game: ");
       for(Game game : listGame){
           System.out.println("["+game.getID()+"]"+" - "+game.getNamaGame());
       }
       System.out.print("Pilih Id Game: ");
       id_game = sc.nextInt();
       System.out.println("");
       
       System.out.println("Daftar Playstation:");
       for(Playstation playstation : listPlaystation){
           System.out.println("["+playstation.getIdPs()+"]"
                   +" - "+playstation.getJenisPs()
                   +" - "+playstation.getHargaSewa());
       }
       System.out.print("Pilih Id Playstaion: ");
       id_playstation = sc.nextInt();
       System.out.println("");
       
       penyewaan.setTanggal(tanggalPenyewaan);
       penyewaan.setLamaSewa(lama_sewa);
       
       Customer customer = new Customer();
       customer.setId(id_customer);
       
       Game game = new Game();
       game.setID(id_game);
       
       Playstation playstation = new Playstation();
       playstation.setIdPs(id_playstation);
       
       penyewaan.setIdPenyewaan(id_playstation);
       penyewaan.setCustomer(customer);
       penyewaan.setGame(game);
       penyewaan.setPlaystation(playstation);
       
       penyewaanService.create(penyewaan);
       System.out.println("Data berhasil disimpan");
       
   }
   private static Penyewaan findPenyewaan (int updatedId){
       penyewaan = new Penyewaan();
       penyewaanService = new PenyewaanServiceImpl();
       penyewaan = penyewaanService.findById(updatedId);
       
       return penyewaan;
   }
   private static void editPenyewaan (Integer Id){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       
       penyewaanService = new PenyewaanServiceImpl();
       CustomerService customerService = new CustomerServiceImpl();
       GameService gameService = new GameServiceImpl();
       PlaystationService playstationService = new PlaystationServiceImpl();
       
       
       List<Customer> listCustomer = customerService.findAll();
       List<Game> listGame = gameService.findAll();
       List<Playstation> listPlaystation = playstationService.findAll();
      
       
       String tanggal;
       
       int lama_sewa,
           id_customer, 
           id_game, 
           id_playstation;
      
       System.out.println("Tanggal[dd-MM-yyyy]");
       tanggal = sc.next();
       LocalDate localDate = LocalDate.parse(tanggal, formatter);
       String tanggalPenyewaan = localDate.toString();
       
       System.out.print("Lama Sewa: ");
       lama_sewa = sc.nextInt();
       
       System.out.println("Daftar Customer:");
       for(Customer customer : listCustomer){
           System.out.println("["+customer.getId()+"]"+" - "+customer.getNamaCustomer());
       }
       System.out.print("Pilih Id Customer: ");
       id_customer = sc.nextInt();
       System.out.println("");
       
       System.out.println("Daftar Game: ");
       for(Game game : listGame){
           System.out.println("["+game.getID()+"]"+"-"+game.getNamaGame());
       }
       System.out.print("Pilih Id Game: ");
       id_game = sc.nextInt();
       System.out.println("");
       
       System.out.println("Daftar Playstation:");
       for(Playstation playstation : listPlaystation){
           System.out.println("["+playstation.getIdPs()+"]"
                   +"-"+playstation.getJenisPs()
                   +"-"+playstation.getHargaSewa());
       }
       System.out.print("Pilih Id Playstaion: ");
       id_playstation = sc.nextInt();
       System.out.println("");
       
       penyewaan.setTanggal(tanggalPenyewaan);
       penyewaan.setLamaSewa(lama_sewa);
       
       Customer customer = new Customer();
       customer.setId(id_customer);
       
       Game game = new Game();
       game.setID(id_game);
       
       Playstation playstation = new Playstation();
       playstation.setIdPs(id_playstation);
       
       penyewaan.setCustomer(customer);
       penyewaan.setGame(game);
       penyewaan.setPlaystation(playstation);
       
       penyewaanService.update(penyewaan);
       System.out.println("Data berhasil diperbarui");
       
   }
}
