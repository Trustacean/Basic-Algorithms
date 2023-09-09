/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Tugas5 { //public class bernama Tugas5
    public static void main(String[] args) { //main untuk mengeksekusi program
        int kecil,sedang,besar; //memasukkan variabel ke dalam tipe data int
        int beratMangga,jumlahMangga,WManngga; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru
        
        System.out.println("Jumlah Mangga Yang Ingin Di Hitung");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        jumlahMangga=key.nextInt(); //mendefinisikan jumlahMangga sebagai angka yang akan dimasukkan dari keyboard
        
        kecil=0; 
        sedang=0;
        besar=0;
        //mendefinisikan kecil,sedang,dan besar sebagai 0
        WManngga=1; //mendefinisikan WMangga sebagai 1
        while (WManngga<=jumlahMangga) { //pengulangan dengan syarat WMangga kurang dari atau sama dengan jumlahMangga
            System.out.println("Berat Mangga Ke-"+WManngga); //memunculkan teks yang ada di dalam petik dua ke dalam output
            beratMangga=key.nextInt(); //mendefinisikan beratMangga sebagai nilai yang akan dimasukkan dari keyboard
            WManngga++; //menjumlahkan nilai WMangga dengan 1
            
            if (beratMangga<200) { //percabangan dengan syarat beratMangga lebih kecil dari 200
                kecil=kecil+1; //menambah nilai kecil dengan 1
            }
            else if (beratMangga>=200&&beratMangga<600) { //percabangan dengan syarat beratMangga di antara 200 sampai 599
                sedang=sedang+1; //menambah nilai sedang dengan 1
            }
            else if (beratMangga>=600) { //percabangan dengan syarat beratMangga lebih besar atau sama dengan 600
                besar=besar+1; //menambah nilai besar dengan 1
            }
            
        }
        
        System.out.println("Dari "+jumlahMangga+" Mangga Yang Yang Ditimbang");
        System.out.println("Kecil  :"+kecil);
        System.out.println("Sedang :"+sedang);
        System.out.println("Besar  :"+besar);
        //memunculkan teks yang ada di dalam petik dua dan variabek kecil, sedang, dan besar ke dalam output
    }
}
