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

public class tugas7 {

    public static void main(String[] args) {
        //deklarasi variabel bertipe data int
        int banyakData;
        //kelas scanner baru
        Scanner key = new Scanner(System.in);
        //input angka untuk nilai variabel banyakData
        System.out.println("Masukkan Banyak Data : ");
        banyakData = key.nextInt();
        //deklarasi array bertipe data int
        int data[] = new int[banyakData];
        int temp; //deklarasi temporary storage
        //perulangan untuk menginput nilai semua indeks dari array data
        for (int i = 0; i < banyakData; i++) {
            System.out.println("Masukkan Nilai Data Ke - " + (i + 1));
            data[i] = key.nextInt();
        }
        //perulangan bubble sort
        for (int i = 0; i < banyakData - 1; i++) {
            for (int j = 0; j < banyakData - (i + 1); j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        //perulangan untuk menampilkan semua indeks array data
        for (int j = 0; j < banyakData; j++) {
            System.out.println(data[j]);
        }
    }
}
