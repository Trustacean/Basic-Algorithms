/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Crusts
 */
import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        //deklarasi variabel
        int n, r;
        int c;
        //kelas scanner baru
        Scanner key = new Scanner(System.in);

        System.out.println("Program Hitung Kombinasi");
        System.out.println("Total Objek :");
        //input angka ke variabel
        n = key.nextInt();
        System.out.println("Yang Ingin Di Pilih :");
        //input angka ke variabel
        r = key.nextInt();

        //mengoperasikan rumus Kombinasi
        c = faktorial(n) / (faktorial(n - r) * faktorial(r));

        //mencetak hasil kombinasi
        System.out.println("Hasil Kombinasi :" + c);
    }

    //method untuk mengoperasikan rumus faktorial
    static int faktorial(int n) {
        //deklarasi variabel method
        int hasil = 1;

        //perulangan untuk faktorial
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                hasil = hasil * i;
            }
        }
        return hasil;
    }
}
