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
public class soal3 { //public class bernama soal3
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int tinggi,berat; //memasukkan variabel tinggi dan berat ke dalam tipe data int
        int beratId; //memasukkan variabel beratId ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Masukkan tinggi :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        tinggi=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Masukkan berat :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        berat=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        
        beratId=tinggi-berat; //mendefinisikan variabel beratId sebagai operasi tinggi dikurangi berat
        
        if (90<=beratId&&beratId<=110) { 
        //percabangan dengan syarat jika beratId beradda diantara 90 dan 110
            System.out.println("Ideal"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (beratId<90) {
            System.out.println("Gemuk"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else {
            System.out.println("Kurus"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        }
    }
}
