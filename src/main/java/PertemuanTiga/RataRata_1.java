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
public class RataRata_1 {  //public class bernama RataRata_1
    public static void main(String[] args) {  //main untuk memulai eksekusi JVM
        int Tugas1,Tugas2,Tugas3; //memasukkan variabel Tugas1,Tugas2, dan Tugas3 ke dalam tipe data int
        double Rerata; //memasukkan variabel Rerata ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama "key"
        
        System.out.println("Tugas 1 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        Tugas1=key.nextInt(); //mendefinisi variabel  sebagai angka yang akan dimasukkan dari key
        System.out.println("Tugas 2 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        Tugas2=key.nextInt(); //mendefinisi variabel sebagai angka yang akan dimasukkan dari key
        System.out.println("Tugas 3 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        Tugas3=key.nextInt(); //mendefinisi variabel sebagai angka yang akan dimasukkan dari key
        
        Rerata=(Tugas1+Tugas2+Tugas3)/3; //mendefinisi variabel Rerata sebagai operasi rata rata dari ketiga variabel tugas
        
        System.out.println("    SD ESEMPE\n");
        System.out.println("Tugas Pertama   :"+Tugas1);
        System.out.println("Tugas Kedua     :"+Tugas2);
        System.out.println("Tugas Ketiga    :"+Tugas3);
        System.out.println("____________________");
        System.out.println("Nilai Rata-rata :"+Rerata);
        //memunculkan teks yang ada di dalam petik dua dan variabel Tugas1,Tugas2,Tugas3 dan Rerata  ke dalam output 
    }
}
