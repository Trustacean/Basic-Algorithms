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
public class Soal6 { //public class bernama Toko_1
    public static void main(String[] args) {  //main untuk memulai eksekusi JVM
        int HB,JB; //memasukkan variabel HB (Harga barang) dan JB (Jumlah barang) ke dalam tipe data int
        int TB,D,TBD; //memasukkkan variabel TB (Total), D (Discount), dan TBD (Total-Discount) ke dalam tipe data int
        Scanner key=new Scanner(System.in); //membuat scanner baru bernama "key"
        System.out.println("TOKO MAKMURMER"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        
        System.out.println("Masukkan harga barang :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        HB=key.nextInt(); //mendefinisikan varirabel HB sebagai angka yang akan dimasaukkan dari key
        System.out.println("Masukkan jumlah barang"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        JB=key.nextInt(); //mendefinisikan variabel JB sebagai angka yang akan dimasukkan dari key
        
        TB=HB*JB; //mendefinisikan variabel TB sebagai operasi perkalian Harga barang dikali Jumlah
        D=TB*2/10; //mendefinisikan D sebagai operasi 20% x Total
        TBD=TB-D; //mendefinisikan TBD sebagai Harga total dikurangi discount
        
        System.out.println("TOKO MAKMURMER\n");
        System.out.println("Harga Barang :"+HB);
        System.out.println("Jumlah Barang :"+JB);
        System.out.println("_________________");
        System.out.println("Harga Sebelum Discount :    "+TB);
        System.out.println("Discount               :    "+D);
        System.out.println("Harga Setelah Discount :    "+TBD);
        //memunculkan teks yang ada di dalam petik dua dan variabel HB, JB, TB, D, dan TBD ke dalam output
    }
}
