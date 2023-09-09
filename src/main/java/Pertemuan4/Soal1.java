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
public class Soal1 { //public class bernama Soal1
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int tinggicm, tinggim, berat; //memasukkan variabel tinggicm, tinggim, dan berat ke dalam tipe data int
        double IMT; //memasukkan variabel IMT (Indeks massa tubuh) ke dalam tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Masukkan tinggi :"); //memunculkan teks yang ada di dalam petik dua ke dalam output dengan tipe int
        tinggicm=key.nextInt(); //mendefinisikan variabel tinggi sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Masukkan berat :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        berat=key.nextInt(); //mendefinisikan variabel berat sebagai angka yang akan dimasukkan dari keyboard dengan tipe int
        
        tinggim=tinggicm/100; //mendefinisikan variabel tinggim sebagai operasi tinggi cm dibagi 100
        IMT=berat/(tinggim*tinggim); //mendefinisikan variabel IMT sebagai operasi berat dibagi tinggi kuadrat
        
        System.out.println("Indeks massa tubuh adalah :"+IMT);
        //memunculkan teks yang ada di dalam petik dua dan variabel int ke dalam output
    }
}
