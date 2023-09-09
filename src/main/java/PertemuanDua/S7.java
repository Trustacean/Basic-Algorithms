/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanDua;

/**
 *
 * @author Crusts
 */
public class S7 { //public class bernama "S7"
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int BI; //memasukkan variabel BI (berat ideal) ke dalam tipe data int
        int TB; //memasukkan variabel TB (tinggi badan) ke dalam
        
        TB=170; //mendefinisikan variabel TB sebagai 170
        BI=TB-110; //mendefinisikan variabel BI sebagai operasi TB-110
        
        System.out.println("Berat ideal dari tinggi badan "+TB+" adalah :"+BI);
        //memunculkan tulisan "Berat ideal dari tinggi badan ", variabel TB, " adalah ", dan variabel BI
        //ke dalam output
    }
}
