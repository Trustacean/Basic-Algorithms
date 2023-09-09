/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Soal3 { //public class bernama Soal3
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int jmlhPenduduk21,tahun; //memasukkan variabel jmlhPenduduk21 dan tahun ke dalam tipe data int
        double tingkTumbuh; //memasukkan variabel tingkTumbuh ke dalam tipe data double
        long prediksi; //memasukkan variabel prediksi ke dalam tipe data long
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Masukkan Tahun Yang Ingin Diprediksi :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        tahun=key.nextInt();
        //mendefinisikan variabel tahun sebagai angka yang akan dimasukkan dari keyboard dengan tipe data int
        
        tingkTumbuh=1.1; //mendefinisikan variabel tingkTumbuh sebagai 1.1
        jmlhPenduduk21=271349889; //mendefinisikan variabel jmlhPenduduk21 sebagai 271349889
        prediksi=Math.round(((tahun-2021)*tingkTumbuh/100)*jmlhPenduduk21+jmlhPenduduk21);
        //mendefinisikan variabek prediksi sebagai operasi (((tahun-2021)*tingkTumbuh/100)*jmlhPenduduk21)+jmlhPenduduk21)
        System.out.println("Prediksi penduduk pada tahun "+tahun+" adalah :"+prediksi);
        //memunculkan teks yang ada di dalam petik dua dan variabel tahun dan prediksi ke dalam output
    }
}
