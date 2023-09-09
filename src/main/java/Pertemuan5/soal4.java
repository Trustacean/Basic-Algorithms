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
public class soal4 { //public class bernama soal4
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        int harga, jumlah;
        int total, totaldisk, disc; //memasukkan variabel ke dalam tipe data int
        
        harga=10000; //mendefinisikan harga sebagai 10000
        System.out.println("Jumlah :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        jumlah=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        total=harga*jumlah; //mendefinisikan total sebagai operasi harga dikali jumlah
        disc=total/10; //mendefinisikan variabel disc sebagai operasi total dibagi 10
        totaldisk=total-disc; //mendefinisikan variabel totaldisk sebagai operasi total dikurang disc
        
        
        System.out.println("Harga    :"+harga); //memunculkan teks yang ada di dalam petik dua ke dalam output
        System.out.println("Jumlah   :"+jumlah); //memunculkan teks yang ada di dalam petik dua ke dalam output
        if (total>=1000000) { //percabangan dengan syarat total lebih dari atau sama dengan 1000000
            System.out.println("Discount :"+disc);
            System.out.println("_________________");
            System.out.println("Total    :"+totaldisk);
            //memunculkan teks yang ada di dalam petik dua dan variabel ke dalam output jika syarat terpenuhi
        } else { //percabangan jika tidak memenuhi syarat diatas
            System.out.println("_________________");
            System.out.println("Total    :"+total);
            //memunculkan teks yang ada di dalam petik dua dan variabel ke dalam output
        }
    }
}
