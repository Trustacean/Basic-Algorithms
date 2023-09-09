/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor Scanner ke dalam program
public class Lingk_1 { //public class bernama "Lingk_1"
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int r; //memasukkan variabel r (jari-jari) ke dalam tipe data int
        double K,L; //memasukkan variabel K (keliling) dan L (luas) ke dalam tipe data double
        Scanner key=new Scanner(System.in); //membuat scanner baru bernama "key"
        System.out.println("Program menghitung keliling dan luas lingkaran."); 
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        
        System.out.println("Masukkan jari-jari :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        r=key.nextInt(); //mendefinisikan variabel r sebagai angka yang akan dimasukkan dari keyboard
        
        K=3.14*2*r; //mendefinisikan variabel K sebagai operasi phi*2r
        L=r*r*3.14; //mendefinisikan variabel L sebagai operasi phi*r^2
        
        System.out.println("Keliling lingkaran dengan jari-jari "+r+" adalah :"+K);
        //memunculkan teks yang ada di dalam petik dua ke dalam output dan variabel r dan K
        System.out.println("Luas lingkaran dengan jari-jari "+r+" adalah ;"+L);
        //memunculkan teks yang ada di dalam petik dua ke dalam output dan varirabel r dan L
    }
}
