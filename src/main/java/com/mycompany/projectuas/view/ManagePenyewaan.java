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
            System.out.println("|ADMIN DASHBOARD | PENDAFTARAN POLI");
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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                    
                default:
                    throw new AssertionError();
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
            System.out.println("Customer\t\t\t: " + penyewaan.getCustomer().getNamaCustomer());
            System.out.println("Lama Sewa\t: " + penyewaan.getLamaSewa());
            System.out.println("Playstation\t\t\t: " + penyewaan.getPlaystation().getJenisPs());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");    
       }
   }
   private static void insertPenyewaan (Penyewaan penyewaan){
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
