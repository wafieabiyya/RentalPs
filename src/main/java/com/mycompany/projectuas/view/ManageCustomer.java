/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectuas.view;

import com.mycompany.projectuas.pojo.Customer;
import com.mycompany.projectuas.service.CustomerService;
import com.mycompany.projectuas.serviceimpl.CustomerServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ManageCustomer {
    static List<Customer> listCustomer = new ArrayList<>();
    static Customer customer;
    static CustomerService customerService;
    static Scanner scanner;
    
    public static void viewManageCustomer(){
        int menu = 0;
        boolean keluar = false;
        char pilihan;
        Scanner scanner;

        do {
            System.out.println("+--------------------------------------");
            System.out.println("|ADMIN DASHBOARD | CUSTOMER MANAGEMENT");
            System.out.println("+--------------------------------------");
            System.out.println("1. Insert Customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. Display All Customer");
            System.out.println("5. Find Customer by ID");
            System.out.println("+--------------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan menu: ");
            scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    char tampil;
                    customer = new Customer();
                    insertCustomer(customer); 
                    System.out.println("Apakah ingin menampilkan data? y/n: ");
                    tampil = scanner.next().charAt(0);
                    if (tampil == 'y' || tampil == 'Y') {
                        customerService = new CustomerServiceImpl();
                        listCustomer = customerService.findAll();
                        findAllCustomer(listCustomer);
                    }
                break;
                case 2:
                    int updatedId;
                    Customer updatedCustomer = new Customer();
                    System.out.println("Masukkan ID Customer: ");
                    updatedId = scanner.nextInt();
                    updatedCustomer = findCustomer(updatedId);
                    System.out.println("Data Customer yang akan diupdate: ");
                    if (updatedCustomer != null) {
                        System.out.println("ID Customer: " + updatedCustomer.getId());
                        System.out.println("Nama Customer: " + updatedCustomer.getNamaCustomer());
                        System.out.println("Alamat Customer: " + updatedCustomer.getAlamat());
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("");
                    System.out.println("Masukkan data baru: ");
                    editCustomer(updatedCustomer.getId());
                break;
                case 3:
                    int deletedId;
                    Customer deletedCustomer = new Customer();
                    char confirmation;
                    customerService = new CustomerServiceImpl();
                    
                    System.out.print("Masukkan ID Customer: ");
                    deletedId = scanner.nextInt();
                    deletedCustomer = findCustomer(deletedId);
                    System.out.print("Apakah Anda yakin untuk menghapus? y/n: ");
                    confirmation = scanner.next().charAt(0);
                    
                    if (confirmation == 'y' || confirmation == 'Y') {
                        if (deletedCustomer != null) {
                            customerService.delete(deletedId);
                            System.out.println("Data berhasil dihapus!");
                            System.out.println("");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                break;
                case 4:
                    customerService = new CustomerServiceImpl();
                    listCustomer = customerService.findAll();
                    findAllCustomer(listCustomer);
                break;
                case 5:
                    int searchedId;
                    Customer searchedCustomer = new Customer();
                    System.out.print("Masukkan ID Customer: ");
                    searchedId = scanner.nextInt();
                    searchedCustomer = findCustomer(searchedId);
                    if (searchedCustomer != null) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("ID Customer\t: " + searchedCustomer.getId());
                        System.out.println("Nama Customer\t: " + searchedCustomer.getNamaCustomer());
                        System.out.println("Alamat customer\t: " + searchedCustomer.getAlamat());
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
            System.out.print("Apakah ingin melanjutkan? y/n: ");
            scanner = new Scanner(System.in);
            pilihan = scanner.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                keluar = true;
            }
            
        } while (!keluar);
        System.out.println("Kembali ke menu utama!");
    }
       
    
    private static void findAllCustomer(List<Customer> listCustomer) {
        for (Customer customer : listCustomer) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID Customer\t: " + customer.getId());
            System.out.println("Nama Customer\t: " + customer.getNamaCustomer());
            System.out.println("Alamat Customer\t: " + customer.getAlamat());
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
        }
    }
    
    private static void insertCustomer(Customer customer) {
        scanner = new Scanner(System.in);
        customerService = new CustomerServiceImpl();
        String namaCustomer, alamatCustomer;
        
        System.out.println("Nama Customer: ");
        namaCustomer = scanner.nextLine();
        System.out.println("Alamat Customer: ");
        alamatCustomer = scanner.nextLine();
        
        customer.setNamaCustomer(namaCustomer);
        customer.setAlamat(alamatCustomer);
        
        customerService.create(customer);
        System.out.println("Data berhasil disimpan...!");
        System.out.println("");
    }

    private static Customer findCustomer(int updatedId) {
        customer = new Customer();
        customerService = new CustomerServiceImpl();
        customer = customerService.findById(updatedId);
    
        return customer;
    }

    private static void editCustomer(Integer id) {
        scanner = new Scanner(System.in);
        customerService = new CustomerServiceImpl();
        customer = new Customer();
        String namaCustomer, alamatCustomer;
        
        System.out.println("Nama Customer: ");
        namaCustomer = scanner.nextLine();
        System.out.println("Alamat Customer: ");
        alamatCustomer = scanner.nextLine();
        
        customer.setId(id);
        customer.setNamaCustomer(namaCustomer);
        customer.setAlamat(alamatCustomer);
        
        System.out.println("ID..." + customer.getId());
        
        customerService.update(customer);
        System.out.println("Data berhasil diperbarui...!");
        System.out.println("");
    }
    

}

