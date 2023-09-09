/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;

import java.util.Scanner;

/**
 *
 * @author Crusts
 */
public class Tugas3 { //public class bernama Tugas3
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int nilaiN ; //mendeklarasikan variabel sebagai tipe data int
        int n1=1,n2=1,n3; //mendeklarasikan variabel sebagai tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru
        System.out.println("Masukkan Panjang Deret:"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        nilaiN=key.nextInt(); //mendefeinisikan variabel nilaiN sebagai angka yang akan diinput
        
        System.out.print(n1+","+n2+","); //memunculkan teks yang ada di dalam petik dua ke dalam output
        for (nilaiN=nilaiN-3; nilaiN>=0; nilaiN--) {  //perulangan
            //deklarasi ; statement ; decrement nilaiN
            n3=n2+n1; //mengoperasikan rumus deret fibonaci
            System.out.print(n3+","); //memunculkan teks yang ada di dalam petik dua dan variabel n3 ke dalam output
            n1=n2; //mengubah nilai n1 sebagai nilai n2
            n2=n3; //mengubah nilai n2 sebagai nilai n3
        }
    }
}
