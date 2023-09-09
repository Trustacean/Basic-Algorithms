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
public class soal7 { //public clasas bernama soal7
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int b1,b2,b3; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Bilangan 1 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        b1=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Bilangan 2 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        b2=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Bilangan 3 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        b3=key.nextInt(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        
        if (b1<=b2&&b1<=b3) { //percabangan dengan syarat b1<=b2&&b1<=b3
            System.out.print(b1+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b2<=b1&&b2<=b3) { //percabangan dengan syarat b2<=b1&&b2<=b3
            System.out.print(b2+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b3<=b1&&b3<=b2) { //percabangan dengan syarat b3<=b1&&b3<=b2
            System.out.print(b3+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        }
        if (b1>=b2&&b1<=b3) { //percabangan dengan syarat b1>=b2&&b1<=b3
            System.out.print(b1+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b2>=b1&&b2<=b3) { //percabangan dengan syarat b2>=b1&&b2<=b3
            System.out.print(b2+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b2>=b3&&b2<=b1) { //percabangan dengan syarat b2>=b3&&b2<=b1
            System.out.print(b2+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b1>=b3&&b1<=b2) { //percabangan dengan syarat b1>=b3&&b1<=b2
            System.out.print(b1+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b3>=b1&&b3<=b2) { //percabangan dengan syarat b3>=b1&&b3<=b2
            System.out.print(b3+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b3>=b2&&b3<=b1) { //percabangan dengan syarat b3>=b2&&b3<=b1
            System.out.print(b3+","); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        }
        if (b1>=b2&&b1>=b3) { //percabangan dengan syarat b1>=b2&&b1>=b3
            System.out.print(b1); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b2>=b1&&b2>=b3) { //percabangan dengan syarat b2>=b1&&b2>=b3
            System.out.print(b2); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        } else if (b3>=b1&&b3>=b2) { //percabangan dengan syarat b3>=b1&&b3>=b2
            System.out.print(b3); //memunculkan teks yang ada di dalam petik dua ke dalam output jika syarat terpenuhi
        }
    }
}
