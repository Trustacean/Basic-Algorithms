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
public class soal5 { //public class bernama soal5
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int uts1, uts2, uas; //memasukkan variabel ke dalam tipe data int
        double ntotal; //memasukkan variabel ke dalam tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.print("Nilai UTS Pertama :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        uts1=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.print("Nilai UTS Kedua :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        uts2=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.print("Nilai UAS :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        uas=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        
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
