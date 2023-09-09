/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

/**
 *
 * @author Crusts
 */
public class Tugas1 { //public class bernama Tugas1
    public static void main(String[] args) { //main untuk memulai eksekusi
        int liter,harga; //memasukkan variabel ke dalam tipe data int
        
        liter=1; //mendefinisikan variabel
        harga=6500; //mendefinisikan vairabel
        System.out.println("Harga Per Liter Rp 6500"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        System.out.println("Jumlah Liter\t\tHarga"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        System.out.println("============================"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        while (liter<=20) {            //looping dengan syarat jika liter kurang dari atau sama dengan 20
            //akan dilakukan selama memenuhi syarat
            System.out.println(liter+"\t\t\t"+harga);
            //memunculkan teks yang ada di dalam petik dua ke dalam output
            liter=liter+1; //mendefinisikan variabel
            harga=harga+6500; //mendefinisikan variabel
        }
        System.out.println("============================"); //memunculkan teks yang ada di dalam petik dua ke dalam output
    }
}
