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
public class tugas3 {
    public static void main(String[] args) {
        //deklarasi array bertipe data int
        int [] nilai;
        //deklarasi variabel
        int jumlahData,total=0,max,min;
        double rataRata;
        //kelas scanner baru
        Scanner key = new Scanner(System.in);
        //menginput nilai ke dalam variabel jumlahDara
        System.out.println("Jumlah Data:");
        jumlahData=key.nextInt();
        
        //memesan banyak indeks untuk array nilai sebanyak nilai jumlahData
        nilai=new int[jumlahData];
        
        //memasukkan nilai indeks array nilai sebanyak indeks yang telah dipesan
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan Nilai Data - "+(i+1));
            nilai[i]=key.nextInt();
            
            //menghitung total nilai dari semua indeks array nilai
            total=total+nilai[i];
        }
        //mengoperasikan rumus ratarata
        rataRata=total/nilai.length;
        
        max=nilai[0];
        //looping untuk mencari nilai maksimal
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        
        min=nilai[0];
        //looping untuk mencari nilai minimum
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        //mencetak nilai rataRata, nilai maksimal dan nilai minimum
        System.out.println("Rata-rata Nilai : "+rataRata);
        System.out.println("Nilai Maks      : "+max);
        System.out.println("Nilai Min       : "+min);
    }
}
