/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Soal4 { //public class bernama Soal4
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        double luasTembok; //memasukkan variabel luasTembok ke dalam tipe data double
        int harga; //memasukkann variabel harga ke dalam tipe data int
        double total,totalHarga; //memasukkan variabel total dan totalHarga ke dalam tipe data double
        
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Masukkan Luas Tembok Yang Ingin Di Cat :"); 
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        luasTembok=key.nextDouble(); 
        //mendefinisikan variabel luasTembok sebagai angka yang akan dimasukkan dari keyboard dengan tipe data double
        System.out.println("Masukkan Harga Cat per Kaleng :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        harga=key.nextInt();
        //mendefinisikan variabel harga sebagai angka yang akan dimasukkan dari keyboard dengan tipe data int
        
        total=luasTembok/5; //mendefinisikan variabel total sebagai operasi luasTembok dibagi 5
        totalHarga=total*harga; //mendefinisikan variabel totalHarga sebagai operasi total dikali harga
        
        System.out.println("Total Cat Yang Diperlukan :"+total+" Kaleng");
        System.out.println("Total Harga               :Rp "+totalHarga);
        //memunculkan teks yang ada di dalam petik dua dan variabel total dan totalHarga ke dalam output
    }
}
