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
public class tugas3 { //public class bernama tugas3
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        int panjang, bilangan=2; //mendeklarasikan variabel dengan tipe data int
        int indikator=0; //mendeklarasikan variabel dengan tipe data int
        
        System.out.println("Masukkan Panjang Deret Bilangan Prima :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        panjang=key.nextInt(); //mendefinisikan nilai variabel panjang sebagai angka yang akan diinput
        
        for (int i = 1; i <= panjang; bilangan++) { //perulangan
            //mendeklarasikan i sebagai 1, i kurang dari sama dengan panjang sebagai syarat perulangan, increment bilangan tiap perulangan.
            for (int j = 1; j <= bilangan; j++) { //perulangan
                //mendeklarasikan j sebagai 1, j kurang dari sama dengan panjang sebagai syarat perulangan, increment j tiap perulangan.
                if (bilangan%j==0) { //percabangan dengan syarat sisa bagi bilangan dengan j = 0
                indikator++; //increment indikator
                }
            }
            if (indikator==2) { //percabangan dengan syarat indikator = 2
                System.out.println(bilangan); //memunculkan nilai variabel bilangan ke dalam output
                i++; //increment i
                indikator=0; //mengubah nilai variabel indikator menjadi 0
            }
            else { //jika tidak memenuhi percabangan di atas
                indikator=0; //mengubah nilai variabel indikator menjadi 0
            }
        }
    }
}
