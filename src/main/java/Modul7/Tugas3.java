/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;
/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Tugas3 { //public class bernama Tugas3
    public static void main(String[] args) { //main untuk mengeksekusi program
        int BIASA,BAGUS,UNGGUL; //memasukkan variabel ke dalam tipe data int
        int beratMangga,jumlahMangga,WManngga; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru
        
        System.out.println("Jumlah Mangga Yang Ingin Di Hitung");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        jumlahMangga=key.nextInt(); //mendefinisikan jumlahMangga sebagai angka yang akan dimasukkan dari keyboard
        
        BIASA=0; //mendefinisikan variabel
        BAGUS=0;
        UNGGUL=0;
        //mendefinisikan kecil,sedang,dan besar sebagai 0
        WManngga=1; //mendefinisikan WMangga sebagai 1
        while (WManngga<=jumlahMangga) { //pengulangan dengan syarat WMangga kurang dari atau sama dengan jumlahMangga
            do { //perintah dibawah akan dijalankan
                System.out.println("Berat Mangga Ke-"+WManngga); //memunculkan teks yang ada di dalam petik dua ke dalam output
                beratMangga=key.nextInt(); //mendefinisikan beratMangga sebagai nilai yang akan dimasukkan dari keyboard
                
                if (beratMangga<=0) { //percabangan dengan syarat berat mangga kurang dari sama dengan nol
                    System.out.println("Berat Mangga Tidak Boleh Kurang Dari Atau Sama Dengan Nol. . .");
                    //memunculkan teks yang ada di dalam petik dua ke dalam output
                }
            } while (beratMangga<=0); //jika berat mangga kurang dari atau sama dengan nol, perintah do akan diulang
            
            
            if (beratMangga>0) { //percabangan dengan syarat berat mangga lebih dari nol
                if (beratMangga<500) { //percabangan dengan syarat beratMangga lebih kecil dari 200
                BIASA=BIASA+1; //menambah nilai kecil dengan 1
                }
                else if (beratMangga>=500&&beratMangga<750) { //percabangan dengan syarat beratMangga di antara 200 sampai 599
                BAGUS=BAGUS+1; //menambah nilai sedang dengan 1
                }
                else if (beratMangga>=750) { //percabangan dengan syarat beratMangga lebih besar atau sama dengan 600
                UNGGUL=UNGGUL+1; //menambah nilai besar dengan 1
                }
                WManngga++; //menjumlahkan nilai WMangga dengan 1
            }
            
        }
        
        System.out.println("Dari "+jumlahMangga+" Mangga Yang Yang Ditimbang");
        System.out.println("Biasa  :"+BIASA);
        System.out.println("Bagus  :"+BAGUS);
        System.out.println("Unggul :"+UNGGUL);
        //memunculkan teks yang ada di dalam petik dua dan variabek kecil, sedang, dan besar ke dalam output
    }
}

