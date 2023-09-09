/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Soal5 { //public class bernama Soal5
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int al,ti,sm; //memasukkan variabel ke dalam tipe data int
        int alti2,sm2; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Alas, Tinggi, dan Sisi Miring Becara Berurutan :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        al=key.nextInt(); //mendefinisikan variabel al sebagai angka yang akan dimasukkan dari keyboard
        ti=key.nextInt(); //mendefinisikan variabel al sebagai angka yang akan dimasukkan dari keyboard
        sm=key.nextInt(); //mendefinisikan variabel al sebagai angka yang akan dimasukkan dari keyboard
        
        alti2=(al*al)+(ti*ti); //mengoperasikan alas dan tinggi alti2=alas^2+tinggi^2
        sm2=sm*sm; //mengoperasikan sisi miring sm2=sm*sm
        if (alti2==sm2) { //percabangan dengan syarat alti2=sm2
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (al==ti) { //percabangan dengan syarat alas = tinggi
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Segitiga Siku-Siku Sama Kaki");
            }
            else { //percabangan jika syarat diatas tidak terpenuhi
                //operasi dibawah akan dilakukan jika syarat tidak dipenuhi
                System.out.println("Segitiga Siku-Siku");
            }
        }
        else if (al==ti&&al==sm) { //percabangan lain dengan syarat alas=tinggi dan alas=sisi miring
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            System.out.println("Segitiga Sama Sisi"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
        else if (al==ti||al==sm||ti==sm) { //percabangan lain dengan syarat alas=tinggi auat alas=sisi miring atau tinggi=sisi miring
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            System.out.println("Segitiga Sama Kaki"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
        else { //percabangan jika syarat-syarat diatas tidak terpenuhi
            //operasi dibawah akan dilakukan jika syarat-syarat di atas tidak dipenuhi
            System.out.println("Segitiga Sembarang");
        }
    }
}
