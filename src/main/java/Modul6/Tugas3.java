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
public class Tugas3 { //public class bernama Tugas3
    public static void main(String[] args) { //main untuk memulai eksekusi
        int suhuMinim,suhuMaks,selisihCels;  //memasukkan variabel ke dalam tipe data int
        int definisiCelsius; //memasukkan variabel ke dalam tipe data int
        int reamur,fahrenheit; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru
        
        System.out.println("Suhu Minimal :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        suhuMinim=key.nextInt(); //mendefinisikan suhuMinim sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Suhu Maksimal :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        suhuMaks=key.nextInt(); //mendefinisikan suhuMaks sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Selisih :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        selisihCels=key.nextInt(); //mendefinisikan selisihCels sebagai angka yang akan dimasukkan dari keyboard
        definisiCelsius=suhuMinim; //mendefinsikan definisicelius sebagai nilai suhuMinim
        
        System.out.println("Celcius\t\t\tReamuhr\t\t\tFahrenheit"); 
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        while (definisiCelsius<=suhuMaks) { //pengulangan dengan syarat definisiCelsius lebih kecil atau sama dengan suhuMaks
            reamur=definisiCelsius*4/5; //mengoperasikan rumus reamur dan memasukkan nilai ke variabel reamur
            fahrenheit=(definisiCelsius*9/5)+32;
        //mengoperasikan rumus fahrenheit dan memasukkan nilainya ke variabel fahrenheit
            
            System.out.println(definisiCelsius+"\t\t\t"+reamur+"\t\t\t"+fahrenheit); 
        //memunculkan teks yang ada di dalam petik dua ke dalam output
            
            definisiCelsius=definisiCelsius+selisihCels; //menambahkan nilai definisiCelsius dengan nilai selisihCelsius
        }
        
    }
}
