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
public class soal1 { //public class bernama soal1
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int bilangan; //memasukkan variabel bilangan ke dalam tipe data int
        
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Masukkan bilangan bulat :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        bilangan=key.nextInt(); //mendefinisi variabel bilangan sebagai angka yang akan dimasukkan dari keyboard
        
        if (bilangan%2==0) { //percabangan dengan syarat jika sisa bagi bilangan sama dengan nol
            System.out.println("Genap"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika memenuhi syarat
        } else { //percabangan jika syarat tidak terpenuhi
            System.out.println("Ganjil"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
            
        
    }
}
