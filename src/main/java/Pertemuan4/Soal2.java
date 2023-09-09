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
public class Soal2 { //pubic class bernama Soal2
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int jarak1Hari, bbmPerLiter, biayaParkir, biayaTol; 
        //memasukkan variabel jarak1Hari, bbmPerLiter, biayaParkir, dan biayaTol ke dalam tipe data int
        double bbmPerKilo;
        //memasukkan variabel bbmPerKilo ke dalam tipe data double
        int biayaGunaKendaraan;
        //memasukkan variabel biayaGunaKendaraan ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Masukkan jarak tempuh hari ini :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        jarak1Hari=key.nextInt();
        //mendefinisikan jarak1Hari sebagai angka yang akan dimasukkan dari keyboard dengan tipe data int
        System.out.println("Harga BBM per liter :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        bbmPerLiter=key.nextInt();
        //mendefinisikan bbmPerLiter sebagai angka yang akan dimasukkan dari keyboard dengan tipe data int
        System.out.println("Rata-rata kebutuhan BBM per kilometer :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        bbmPerKilo=key.nextDouble();
        //mendefinisikan bbmPerKilo sebagai angka yang akan dimasukkan dari keyboard dengan tipe data double
        System.out.println("Biaya parkir :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        biayaParkir=key.nextInt();
        //mendefinisikan biayaParkir sebagai angka yang akan dimasukkan dari keyboard dengan tipe data int
        System.out.println("Biaya tol :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        biayaTol=key.nextInt();
        //mendefinisikan biayaTol sebagai angka yang akan dimasukkan dari keyboard dengan tipe data int
        
        biayaGunaKendaraan=(int) ((bbmPerKilo*jarak1Hari*bbmPerLiter)+biayaParkir+biayaTol);
        //mendefinisikan biayaGunaKendaraan sebagai operasi
        //bbm/Km dikasli jarak dikali bbm/liter ditambah biaya parkir dan biaya tol
        System.out.println("        Biaya Penggunaan Kendaraan Hari Ini\n");
        System.out.println("Jarak Tempuh                 :"+jarak1Hari+" Km");
        System.out.println("Harga Bensin per Liter       :Rp "+bbmPerLiter+",00");
        System.out.println("Rata-rata Kebutuhan BBM/KM   :"+bbmPerKilo+" Liter");
        System.out.println("Biaya Parkir                 :Rp "+biayaParkir+",00");
        System.out.println("Biaya Tol                    :Rp "+biayaTol+",00");
        System.out.println("________________________________________");
        System.out.println("Biaya Penggunaan Kendaraan   :Rp "+biayaGunaKendaraan+",00");
        //memunculkan teks yang ada di dalam petik dua dan variabel-variabel ke dalam output
    }
}
