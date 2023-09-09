/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Crusts
 */
import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        //deklarasi array bertipe data int
        int[] hitung;
        //deklarasi variabel bertipe data double
        double rerata, total = 0;
        
        //memesan banyaknya indeks untuk array hitung
        hitung = new int[5];
        //kelas scanner baru
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for (int i = 0; i <= 4; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            hitung[i] = Keyboard.nextInt();
        }
        //Menampilkan banyak data
        System.out.println("Banyak Dara : " + hitung.length);
        
        //looping untuk menghitung total dari data
        for (int i = 0; i <= 4; i++) {
            total = total + hitung[4 - i];
        }
        //mengoperasikan rumus ratarata
        rerata = total / hitung.length;
        //menampilkan nilai ratarata
        System.out.println("Rata-rata Data Adalah : " + rerata);
        //deklarasi variabel bertipe data int
        int max = hitung[0];
        //looping untuk mencari nilai maksimum dari data
        for (int i = 0; i <= 4; i++) {
            if (hitung[i] > max) {
                max = hitung[i];
            }
        }
        //menampilkan nilai maksimum dari data
        System.out.println("Data Terbesar : "+max);
        //deklarasi variabel bertipe data int
        int min = hitung[0];
        //looping untuk mencari nilai minimum dari data
        for (int i = 0; i <= 4; i++) {
            if (hitung[i] < min) {
                min = hitung[i];
            }
        }
        //mencetak nilai minimum dari data
        System.out.println("Data Terkecil : "+min);
        //menampilkan data
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke " + (i + 1) + " adalah "
                    + hitung[4 - i]);
        }
    }
}
