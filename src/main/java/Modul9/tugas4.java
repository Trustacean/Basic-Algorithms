/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program

public class tugas4 { //public class bernama tugas4

    public static void main(String[] args) { //main untuk memulai jvm
        int bilangan = 0; //mendeklarasikan variabel dengan tipe data int
        int lanjut, panjang; //mendeklarasikan variabel dengan tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru

        
        do { //melakukan perintah di dalam
            System.out.println("Masukkan Panjang :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            panjang = key.nextInt();//mendefinisikan variabel panjang sebagai angka yang akan di input
            
            for (int i = 0; i < panjang; i++) {  //perulangan
                //deklarasi i=0, syarat perulangan i kurang dari panjang, increment i untuk tiap perulangan
                bilangan = bilangan + i; //menambah nilai bilangan dengan nilai i
                System.out.print(bilangan+" ");
                //memunculkan nilai variabel bilangan ke dalam output
            }
            bilangan = 0; //mengubah nilai bilangan menjadi 0
            System.out.println("");
            do { //melakukan perintah di dalam
                System.out.println("Apakah Ingin Lanjut?"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                System.out.println("Ya = 2"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                System.out.println("Tidak = 1"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                lanjut=key.nextInt(); //mengefinisikan nilai lanjut sebagai angka yang akan di input
            } while (lanjut>2||lanjut<1); //jika syarat nilai lanjut lebih dari 2 atau kurang dari 1 terpenuhi, perintah do akan di ulang
            
            if (lanjut==2) { //percabangan dengan syarat nilai lanjut = 2
                break; //keluar dari perulangan
            }
            
        } while (true); //mengulang perintah do
    }
}
