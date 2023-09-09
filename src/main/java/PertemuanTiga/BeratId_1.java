/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class BeratId_1 { //public class bernama "BeratId"
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int TB; //memasukkan variabel TB (Tinggi badan) ke dalam tipe data int
        int BI; //memasukkan variabel BI (Berat ideal) ke dalam tipe data int
        Scanner key=new Scanner(System.in); //membuat scanner baru bernama "key"
        System.out.println("Program menghitung berat badan ideal."); 
        //memunculkan teks yang ada di dalam tanda petik dua ke dalam output
        
        System.out.println("Masukkan tinggi badan :"); //memunculkan teks yang ada di dalam tanda petik dua
        //ke dalam output
        TB=key.nextInt(); //mendefinisikan variabel TB sebagai angka yang akan dimasukkan dari keyboard
        BI=TB-110; //mendefinisikan variabel BI sebagai operasi TB-110
        
        System.out.println("Berat ideal dengan tinggi badan "+TB+" adalah :"+BI);
        //memunculkan teks yang ada di dalam tanda petik dua dan variabel TB dan BI ke dalam output
    }
}
