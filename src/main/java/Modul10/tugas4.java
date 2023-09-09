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

public class tugas4 {

    public static void main(String[] args) {
        //deklarasi array dan variabel bertipe data int
        int[] arrayA = {2, 7, 3, 9, 4, 1, 34, 25, 76, 80, 90, 54, 21, 78};
        int nilaiDicari;
        int cek = 0;
        //kelas scanner baru
        Scanner key = new Scanner(System.in);
        //menginput angka untuk variabel nilaiDicari
        System.out.println("Masukkan Nilai Data Yang Ingin Dicari :");
        nilaiDicari = key.nextInt();
        //looping untuk mencari indeks dari angka yang diinput
        for (int i = 0; i < arrayA.length; i++) {
            //jika indeks ditemukan
            if (arrayA[i] == nilaiDicari) {
                //memunculkan tulisan yang menandakan bahwa nilai ada di indeks . .
                System.out.println("Nilai " + nilaiDicari + " Ada Di Index Ke - " + i);
            }
            //jika indeks tidak ditemukan
            if (arrayA[i] != nilaiDicari) {
                cek++;
            }
            
        }
        //jika semua nilai indeks dicek dan nilai tidak ditemukan
        if (cek == arrayA.length) {
            System.out.println("Nilai Tidak Ada Dalam Array!");
        }

    }
}
