/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

/**
 *
 * @author Crusts
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) { //main untuk memulai eksekusi
        double a,b,c,D,x1,x2; //memasukkan variabel ke dalam tipe data double
        Scanner dataKuadrat=new Scanner(System.in); //membuat kelas scanner baru
        do { //melakukan perintah dibawah
            System.out.println("Masukkan koefisien dari X kuadrat :");
            //memunculkan teks yang ada di dalam petik dua ke dalam output
            a=dataKuadrat.nextDouble(); //mendefinisikan a sebagai angka yang akan dimasukkan dari keyboard
            if (a==0) { //percabangan dengan syarat jika a==0
                System.out.println("ERROR"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                System.out.println("Nilai koefisien dari X kuadrat tidak boleh nol."); 
                //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        } while (a==0); //ulangi perintah do jika syarat a==0 memenuhi        
        
        System.out.println("Masukkan koefisien dari X"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        b=dataKuadrat.nextDouble(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Masukkan nilai dari konstanta :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        c=dataKuadrat.nextDouble(); //mendefinisikan variabel sebagai angka yang akan dimasukkan dari keyboard
        
        D=b*b-(4*a*c); //mendefinisikan variabel D sebagai operasi D=b*b-(4*a*c)
        
        if(D<0||a==0) { //percabangan dengan syarat D<0 atau a==0
            //operasi dibawah akan dilakukan jika syarat memenuhi
            System.out.println("Unreal"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
        else if (D==0) { //percabangan bersyarat D=0 jika sebelumnya tidak memenuhi
            //operasi dibawah akan dilakukan jika syarat memenuhi
            x1=-b/(2*a); //mendefinnisikan x1 sebagai operasi (2*a)
            System.out.println("Akar tunggal yakni :"+x1); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
        else { //percabangan jika syarat syarat sebelumnya tidak memenuhi
            //operasi dibawah akan dilakukan jika syarat-syarat sebelumnya tidak memenuhi
            x1=((-b+Math.sqrt(D))/(2*a)); //mendefinisikan variabel x1 sebagai operasi 1=((-b+Math.sqrt(D))/(2*a))
            x2=((-b-Math.sqrt(D))/(2*a)); //mendefinisikan variabel x2 sebagai operasi x2=((-b-Math.sqrt(D))/(2*a))
            System.out.println("Akar kuadrat pertama :"+x1); //memunculkan variabel ke dalam output
            System.out.println("Akar kuadrat kedua   :"+x2);
        }
        
    }
    
}
