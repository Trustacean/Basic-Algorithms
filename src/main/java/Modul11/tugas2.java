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

public class tugas2 {
    public static void main(String[] args) {
        //deklarasi variabel tipe data long
        long baris,hasil;
        
        //kelas scanner baru
        Scanner key = new Scanner(System.in);
        System.out.println("Masukkan Nilai :");
        //input angka ke variabel
        baris=key.nextLong();
        
        //perulangan untuk mengulang operasi sejumlah nilai baris yang telah diinput
        for (int i = 0; i <= baris; i++) {
            
            //memanggil method faktorial sekaligus mengoperasikan rumus kombinasi
            hasil=(faktorial(baris)/(faktorial(baris-i)*faktorial(i)));
            
            //mencetak hasil kombinasi
            System.out.print(hasil+" ");
        }
    }
    //sub program untuk mengoperasikan faktorial
    static long faktorial(long n) {
        //deklarasi variabel tipe data long
        long hasil=1;
        
        //perulangan untuk mengoperasikan rumus faktorial
        for (int i = 1; i <= n; i++) {
            hasil=hasil*i;
            
        }
        return hasil; //mengembalikkan nilai variabel hasil
    }
}
