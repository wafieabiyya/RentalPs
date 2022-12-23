/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import com.mycompany.projectuas.pojo.Game;
import com.mycompany.projectuas.service.GameService;
import com.mycompany.projectuas.serviceimpl.GameServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ManageGame {
    static List<Game> listGame = new ArrayList<>();
    static Game game;
    static GameService gameService;
    static Scanner sc = new Scanner (System.in);
    
    public static void viewManageGame(){
        int menu;
        boolean endSesion = false;
        char choice = 0;
         do {                
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD | Game MANAGEMENT");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Game");
            System.out.println("2. Update Game");
            System.out.println("3. Delete Game");
            System.out.println("4. Display All Game");
            System.out.println("5. Find Game by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan menu: ");
            
            menu = sc.nextInt();
             switch (menu) {
                 case 1:    
                     char display;
                     game = new Game();
                     insertGame(game);
                     System.out.print("Apakah Anda Ingin menampilkan data? y/n: ");
                     display = sc.next().charAt(0);
                     if (display == 'Y'|| display == 'y'){
                         gameService = new GameServiceImpl();
                         listGame = gameService.findAll();
                         findAllGame(listGame);
                     }
                     break;
                 case 2:
                     int updatedId;
                     Game updatedGame = new Game();
                     System.out.print("Masukan ID: ");
                     updatedId = sc.nextInt();
                     updatedGame = findgame(updatedId);
                     System.out.println("Data yang akan diUpdate");
                     if (updatedGame != null){
                         System.out.println("ID Game: "+updatedGame.getID());
                         System.out.println("Nama Game : "+updatedGame.getNamaGame());
                     }
                     else{
                         System.out.println("Game Not Founded!");
                     }
                     System.out.println("");
                     System.out.println("Insert New Game!");
                     editgame(updatedGame.getID());
                     
                     break;
                 case 3: 
                     int deletedId;
                     Game deletedGame = new Game();
                     char confirmation;
                     gameService = new GameServiceImpl();
                     
                     System.out.print("Masukan ID: ");
                     deletedId = sc.nextInt();
                     deletedGame = findgame(deletedId);
                     System.out.print("Yakin untuk menghapus ID ini? y\n: ");
                     confirmation = sc.next().charAt(0);
                     if ( confirmation == 'Y'|| confirmation == 'y'){
                         gameService.delete(deletedId);
                         System.out.println("ID Deleted!");
                         System.out.println("");
                     }
                     else {
                         System.out.println("ID Not Founded!");
                     }
                     break;
                 case 4:
                     gameService = new GameServiceImpl();
                     listGame = gameService.findAll();
                     findAllGame(listGame);
                     break;
                 case 5: 
                     int searchedId;
                     Game searchedGame = new Game();
                     System.out.print("Masukan ID: ");
                     searchedId = sc.nextInt();
                     searchedGame = findgame(searchedId);
                     if (searchedGame != null){
                         System.out.println("-----------------------------------------------------------------");
                        System.out.print("ID Game \t\t: "+searchedGame.getID());
                        System.out.print("Nama Game \t\t: "+searchedGame.getNamaGame());
                        System.out.println("-----------------------------------------------------------------");
                     }
                     else{
                         System.out.println("Data Not Founded!");
                     }
                     break;
                 default:
                   System.out.println("Pilihan yang Anda masukkan salah!");
                     break;
             }
             System.out.println("");
             System.out.print("Ingin Lanjut? y/n: ");
             choice = sc.next().charAt(0);
             if (choice == 'N'|| choice == 'n'){
                 endSesion = true;
             }
            } 
        while (!endSesion);
         System.out.println("Back To Main Menu!");
    }
    public static void findAllGame(List<Game> listGame){
        for (Game game: listGame){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID Game \t\t: "+game.getID());
            System.out.println("Nama Game\t\t: "+game.getNamaGame());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }
    public static void insertGame (Game game){
        gameService = new GameServiceImpl();
        String namaGame;
        
        System.out.print("Nama Game: ");
        namaGame = sc.next();
        
        game.setNamaGame(namaGame);
        gameService.create(game);
        System.out.println("Game Successfully Added!");
        System.out.println("");
    }
    public static Game  findgame (int updatedId){
       game = new Game();
       gameService = new GameServiceImpl();
       game = gameService.findById(updatedId);
       return game;
    }
    public static void editgame (Integer Game){
        gameService = new GameServiceImpl();
        game= new Game();
        String namaGame;
        
        System.out.print("Nama Game: ");
        namaGame= sc.next();
        
        game.setNamaGame(namaGame);
        gameService.update(game);
        System.out.println("Game Edited!");
        System.out.println(""); 
    }
}
