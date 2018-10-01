package Tugas;

import java.io.*;
import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) throws IOException{
        System.out.println("==================================");
        System.out.println("            Buat Akun             ");
        System.out.println("==================================");
        Scanner buat = new Scanner (System.in);
        System.out.print("Username Baru   : ");
        String nama = buat.next();
        System.out.print("Password Baru   : ");
        String pass = buat.next();
        System.out.print("Ulang Password  : ");
        String ulang = buat.next();
         if (ulang.equals(pass)){
                System.out.println("\n----------------------------------");
                System.out.println("                     Akun disimpan");
           
            }
     
        System.out.println("\n==================================");
        System.out.println("          Masukkan Akun           ");
        
        InputStreamReader a = new  InputStreamReader (System.in);
        BufferedReader b = new BufferedReader (a); 
        
        try{
            System.out.print("\nMasukkan Username : ");
            String User = b.readLine();
            System.out.print("Masukkan Password : ");
            String pas = b.readLine();
            
            if (User.equals(nama) && (pas.equals(pass))){
                System.out.println("\n----------------------------------");
                System.out.println("      Selamat login berhasil");
                  System.out.println("\n==================================");
            }
            else
            {
                System.out.println("\n-------------------------------------");
                System.out.println("Maaf Username dan Password anda salah");   
                  System.out.println("\n==================================");
                }
          } catch (IOException e) {
            System.out.println("Tidak boleh"+e);
            System.exit(0);
        }
   
    }
}
