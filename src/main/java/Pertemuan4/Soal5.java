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
public class Soal5 { //public class bernama Soal5
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        int d1,d2,d3; //memasukkan variabel d1,d2, dan d3 ke dalam tipe data int
        int t1,t2,t3; //memasukkan variabel t1,t2, dan t3 ke dalam tipe data int
        int jmlh1,jmlh2,jmlh3; //memasukkan variabel jmlh1, jmlh2, dan jmlh3 ke dalam tipe data int
        double V1,V2,V3; //memasukkan variabel v1,v2, dan v3 ke dalam tipe data double
        double bot1,bot2,bot3,total; //memasukkan variabel bot1,bot2,bot3, dan total ke dalam tipe data double
        
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama key
        System.out.println("Diameter botol 1 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        d1=key.nextInt(); //mendefinisikan variabel d1 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Tinggi botol 1 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        t1=key.nextInt(); //mendefinisikan variabel t1 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Jumlah botol 1 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        jmlh1=key.nextInt(); //mendefinisikan variabel jmlh1 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Diameter botol 2 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        d2=key.nextInt(); //mendefinisikan variabel d2 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Tinggi botol 2 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        t2=key.nextInt(); //mendefinisikan variabel t2 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Jumlah botol 2 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        jmlh2=key.nextInt(); //mendefinisikan variabel jmlh2 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Diameter botol 3 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        d3=key.nextInt(); //mendefinisikan variabel d3 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Tinggi botol 3 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        t3=key.nextInt(); //mendefinisikan variabel t3 sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Jumlah botol 3 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        jmlh3=key.nextInt(); //mendefinisikan variabel jmlh3 sebagai angka yang akan dimasukkan dari keyboard
        
        V1=((d1*d1)*1/4*3.14)*t1; //mendefinisikan variabel V1 sebagai operasi hitung volume tabung
        V2=((d2*d2)*1/4*3.14)*t2; //mendefinisikan variabel V2 sebagai operasi hitung volume tabung
        V3=((d3*d3)*1/4*3.14)*t3; //mendefinisikan variabel V3 sebagai operasi hitung volume tabung
        bot1=V1*jmlh1; //mendefinisikan variabel bot1 sebagai operasi hitung V1+jmlh1
        bot2=V2*jmlh2; //mendefinisikan variabel bot1 sebagai operasi hitung V2+jmlh2
        bot3=V3*jmlh3; //mendefinisikan variabel bot1 sebagai operasi hitung V3+jmlh3
        total=bot1+bot2+bot3; //mendefinisikan variabel total sebagai operasi hitung bot1+bot2+bot3
        
        System.out.println("Volume total untuk botol 1 :"+bot1);
        System.out.println("Volume total untuk botol 2 :"+bot2);
        System.out.println("Volume total untuk botol 3 :"+bot3);
        System.out.println("Volume total :"+total);
        //memunculkan teks yang ada di dalam petik dua dan variabel bot1, bot2, bot3, dan total ke dalam output
    }
}
