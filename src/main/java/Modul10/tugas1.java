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

public class tugas1 {

    public static void main(String[] args) {
        //deklarasi array bertipe data int
        int[] hitung;
        int[] cadangan;
        hitung = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for (int i = 0; i <= 4; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            hitung[i] = Keyboard.nextInt();
        }
        cadangan = hitung;
        //Menampilkan indeks array hitung dari akhir ke awal
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke " + (i + 1) + " adalah "
                    + hitung[4 - i]);
        }
        //Menampilkan indeks array cadangan dari akhir ke awal
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data Cadangan ke " + (i + 1) + " adalah "
                    + cadangan[4 - i]);
        }
    }
}
