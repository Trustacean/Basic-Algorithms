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
public class soal6 { //public class bernama soal6
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        double alas,sisiMiring,tinggi; //memasukkan variabel ke dalam tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Alas :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        alas=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Tinggi :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        tinggi=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Sisi miring :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        sisiMiring=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        
        if (Math.sqrt(alas*alas+tinggi*tinggi)==sisiMiring) { //percabangan dengan syarat akar dari alas kuadrat ditambah tinggi kuadrat sama dengan sisi miring
            System.out.println("Segitiga Siku-siku"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else { //percabangan jika tidak memenuhi syarat diatas
            System.out.println("Segitiga Bukan Siku-siku"); //memunculkan teks yang ada di dalam petik dua ke dalam output 
        }
        
    }
}
