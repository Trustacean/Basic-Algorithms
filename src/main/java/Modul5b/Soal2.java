/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5b;
/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Soal2 { //public class bernama Soal2
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int month; //memasukkan variabel ke dalam tipe data int
        String monthString; //memasukkan variabel ke dalam tipe data String
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Bulan (angka)"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        month=key.nextInt(); //mengidentifikasikan variabel month sebagai angka yang akan dimasukkan dari keyboard
        
        switch (month) { //percabangan untuk membandingkan nilai month
            case 1: //jika month=1
            case 3: //jika month=3
            case 5: //jika month=5
            case 7: //jika month=7
            case 8: //jika month=8
            case 10: //jika month=10 
            case 12: //jika month=12
                monthString="31 Hari"; //mendefinisikan variabel monthString sebagai teks 31 Hari jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat di atas terpenuhi
            case 2: //jika month=2
                monthString="28-29 Hari"; //mendefinisikan variabel monthString sebagai teks 29 Hari jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat di atas terpenuhi
            case 4: //jika month=4
            case 6: //jika month=6
            case 9: //jika month=9
            case 11: //jika month=11
                monthString="30 Hari"; //mendefinisikan variabel monthString sebagai teks 30 Hari jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat di atas terpenuhi
            default: monthString="Invalid Month"; //jika syarat syarat di atas tidak terpenuhi
        }
        System.out.println(monthString); //memunculkan variabel monthString ke dalam output
    }
}
