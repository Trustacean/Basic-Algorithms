/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanTiga;


 // @author Crusts
import java.util.Scanner; //mengimpor scanner ke dalam program
public class NilaiFin_1 { //public class bernama "NilaiFin_1"
    public static void main(String[] args) { //main untuk memulai JVM
        int us1,us2,uas; //memasukkan variabel us1, us1, dan uas ke dalam tipe data int
        double nilaiFin; //memasukkan variabel nilaiFin ke dalam tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru bernama "key"
        
        System.out.println("Ujian Sisipan 1 :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        us1=key.nextInt(); //mendefinisikan variabel us1 sebagai angka yang akan dimasukkan dari key
        System.out.println("Ujian Sisipan 2 :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        us2=key.nextInt(); //mendefinisikan variabel us2  sebagai angka yang akan dimasukkan dari key 
        System.out.println("Ujian Akhir :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        uas=key.nextInt(); //mendefinisikan variabel uas sebagai angka yang aka dimasukkan dari key
        
        nilaiFin=(us1*3/10)+(us2*3/10)+(uas*2/5);
        //mendefinisikkan variabel nilaiFin sebagai operasi (us1*3/10)+(us2*3/10)+(uas*2/5)
        System.out.println("    Universitas Esema\n");
        System.out.println("Ujian Sisipan 1      :"+us1);
        System.out.println("Ujian Sisipan 2      :"+us2);
        System.out.println("Ujian Akhir Semester :"+uas);
        System.out.println("__________________________");
        System.out.println("Nilai Final          :"+nilaiFin);
        //memunculkan teks yang ada di dalam petik dua ke dalam output dan variabel us1, us2, uas, dan nilaiFin
    }
}
