/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengim[or scanner ke dalam program
public class Tugas2 { //public class bernama Tugas2
    public static void main(String[] args) { //main untuk memulai operasi jvm
        int banyakN,dataYangTidakSamaNol=0; //mendeklarasikan variabel dengan tipe data int
        double dataPer,nilaiData,totalAkar=0,totalKuadrat=0; //mendeklarasikan variabel dengan tipe data double
        Scanner key = new Scanner(System.in); //membuat variabel scanner baru
         
        System.out.println("Banyak Data Yang Akan Dihitung :");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        banyakN=key.nextInt(); //mendefinisikan variabel banyakR sebagai angka yang akan di input
        for (int count = 1; banyakN>=count; count++) { //perulangan
            //deklarasi int ; statement ; increment count
            System.out.println("Nilai Data Ke-"+count);
            //memunculkan teks yang ada di dalam petik dua ke dalam output
            nilaiData=key.nextDouble();
            //mendefinisikan variabel nilaiData sebagai angka yang akan di input
            
            totalKuadrat=totalKuadrat+(nilaiData*nilaiData);
            //mengoperasikan totalKuadrat sebagai nilai totalKuadrat ditambah nilai data kuadrat
            totalAkar=totalAkar+Math.sqrt(nilaiData); 
            //mengoperasikan totalAkar sebagai nilai total akar sebelumnya ditambah dengan akar dari nilai data
            dataPer=1/nilaiData; //mendefinisikan dataPer sebagai satu per nilai data
            System.out.println(dataPer);
            if (dataPer!=0) { //percabangan dengan syarat dataPer tidak sama dengan nol
                dataYangTidakSamaNol=dataYangTidakSamaNol+1;
                //mendefinisikan dataYangTidakSamaNol sebagai operasi dataYangTidakSamaNol+1;
            }    
        }
        System.out.println("Jumlah Data Kuadrat Data Adalah :"+totalKuadrat);
        System.out.println("Jumlah Akar Kuadrat Data Adalah :"+totalAkar);
        System.out.println("Jumlah 1/Data yang Tidak Sama Dengan Nol :"+dataYangTidakSamaNol);
        //memunculkan teks yang ada di dalam petik dua dan variabel totalKuadrat,totalAkar,dan dataYangTidakSamaNolke 
        //dalam output
    }
    
}
