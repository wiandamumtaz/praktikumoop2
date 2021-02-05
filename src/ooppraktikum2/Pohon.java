package ooppraktikum2;

import java.util.Scanner;

public class Pohon {
    Scanner input = new Scanner(System.in);
    String nama;
    int tinggi;
    
    void setNama(){
        System.out.print("Masukkan nama Pohon :");
        nama = input.nextLine();
    }
        
    void setTinggi(){
        System.out.print("Masukkan Tinggi Pohon :");
        tinggi = input.nextInt();
        
    }
    
}
