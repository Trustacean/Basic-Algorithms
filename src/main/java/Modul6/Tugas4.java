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
public class Tugas4 { //public clasa bernama Tugas4
    public static void main(String[] args) { //main untuk memulai eksekusi
        int jumlah,suhuCelsius,v; //memasukkan variabel ke dalam tipe data int
        int reamur,fahrenheit;
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Jumlah Suhu Yang Ingin Di Hitung :"); 
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        jumlah=key.nextInt(); //wmendefinisikan jumlah sebagai nilai yang akan dimasukkan dari keyboard
        
        v=1; //mendefinisikan nilai v
        while (v<=jumlah) { //pengulangan dengan syarat v lebih kecil atau sama dengan jumlah  
            System.out.println("Masukkan Suhu Ke-"+v); //memunculkan teks yang ada di dalam petik dua ke dalam output
            suhuCelsius=key.nextInt(); //mendefinisikan variabel suhuCelsius sebagai nilai yang akan dimasukkan
            v++; //menambahkan variabel v dengan 1
            reamur=(suhuCelsius*4/5); //mengoperasikan rumus konversi celsius ke reamur
            fahrenheit=(suhuCelsius*9/5)+32; //mengoperasikan rumus konversi celsius ke fahrenheit
            
            System.out.println("Reamuhr    :"+reamur); 
            System.out.println("Fahrenheit :"+fahrenheit);
            //memunculkan teks yang ada di dalam petik dua dan variabel reamur dan fahrenheit ke dalam output 
        }
        
    }
}
