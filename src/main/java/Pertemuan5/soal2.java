/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class soal2 { //public class bernama soal2
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int umur1,umur2; //memasukkan variabel umur1 dan umur2 ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Masukkan nama :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        String nama1=key.next(); //memasukkan sekaligus mendefinisikan String nama1 sebagai kata yang akan dimasukkan dari keyboard
        System.out.println("Masukkan umur :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        umur1=key.nextInt(); //mendefinisikkan variabel umur1 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Masukkan nama :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        String nama2=key.next(); //memasukkan sekaligus mendefinisikan String nama2 sebagai kata yang akan dimasukkan dari keyboard
        System.out.println("Masukkan umur :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        umur2=key.nextInt(); //mendefinisikan variabel umur2 sebagai angka yang akan dimasukkan dari keyboard
        
        if (umur1>umur2) { //percabangan dengan syarat umur1 lebih besar dari umur2
            System.out.println(nama1+" lebih tua dari "+nama2); //memunculkan teks yang ada di dalam petik dua ke dalam output jika memenuhi persyaratan
        } else if (umur1<umur2) { //percabangan lain dengan syarat umur1 lebih kecil dari umur2
            System.out.println(nama2+" lebih tua dari "+nama1); //memunculkan teks yang ada di dalam petik dua ke dalam output jika memenuhi persyaratan
        } else { //percabangan jika tidak memenuhi semua syarat di atas
            System.out.println(nama1+" seumuran dengan "+nama2); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
    }
    
}
