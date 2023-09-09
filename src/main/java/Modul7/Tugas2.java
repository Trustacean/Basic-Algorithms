/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;


/**
 *
 * @author Crusts
 */
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        int uts1, uts2, uas; //memasukkan variabel ke dalam tipe data int
        double ntotal; //memasukkan variabel ke dalam tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        do { //menjalankan perintah di bawah
            System.out.print("Nilai UTS Pertama :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            uts1=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
            
            if (uts1<0) { //percabangan dengan syarat nilai uts1 kurang dari nol
                System.out.println("Nilai Tidak Boleh Negatif . ."); 
                //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        } while (uts1<0); //jika nilai uts1<0 diulang dari do
        
        do { //menjalankan perintah di bawah           
            System.out.print("Nilai UTS Kedua :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            uts2=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
            
            if (uts2<0) { //percabangan dengan syarat nilai uts2 kurang dari nol
                System.out.println("Nilai Tidak Boleh Negatif . ."); 
                //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        } while (uts2<0); //jika nilai uts2<0 diulang dari do
        
        do { //menjalankan perintah di bawah
            System.out.print("Nilai UAS :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            uas=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
            
            if (uas<0) { //percabangan dengan syarat nilai uas kurang dari nol
                System.out.println("Nilai Tidak Boleh Negatif . ."); 
                //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        } while (uas<0); //jika nilai uas<0 diulang dari do
        
        
        ntotal=(uts1*3/10)+(uts2*3/10)+(uas*2/5); //mendefinisikan variabel ntotal sebagai operasi
        if (ntotal>=80) { //percabangan dengan syarat ntotal lebih dari atau sama dengan 80
            System.out.println("A"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (ntotal<80&&65<=ntotal) { //percabangan dengan syarat ntotal diantata 65 sampai 79
            System.out.println("B"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (ntotal<65&&55<=ntotal) { //percabangan dengan syarat ntotal diantata 55 sampai 64
            System.out.println("C"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (ntotal<55&&50<=ntotal) { //percabangan dengan syarat ntotal diantata 54 sampai 50
            System.out.println("D"); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else { //percabangan jika syarat-syarat diatas tidak terpenuhi
            System.out.println("E"); //memunculkan teks yang ada di dalam petik dua ke dalam output 
        }
    }
}
