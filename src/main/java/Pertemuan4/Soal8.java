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
public class Soal8 { //public class bernama Soal8
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int cels; //memasukkan variabel cels ke dalam tipe data int
        double fahren; //memasukkan variabel fahren ke dalam tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        
        System.out.println("Suhu dalam celcius :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        cels=key.nextInt(); //mendefinisikan variabel cels sebagai angka yang akan dimasukkan dari keyboard
        
        fahren=((9*cels)/5)+32; //mendefinisikan variabel fahren sebagai operasi (9/5)*celcius+32
        System.out.println("Suhu "+cels+" derajat celcius = "+fahren+" derajat fahrenheit");
        //memunculkan teks yang ada di dalam petik dua dan variabel cels dan fahren ke dalam output
    }
}
