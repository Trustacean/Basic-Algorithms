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
public class Tugas2 { //public class bernama Tugas2
    public static void main(String[] args) { //main untuk memulai eksekusi
        int banyakData,dataKe=1,nilaiDataKe; //memasukkan variabel ke dalam tipe data int
        int total=0,rataRata; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat scanner baru
        
        System.out.println("Banyak Data :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        banyakData=key.nextInt(); //mendefinisikan banyakData sebagai angka yang akan dimasukkan dari keyboard
        
        
        dataKe=1; //mendefinisikan dataKe sebagai angka 1
        while (dataKe<=banyakData) {  //pengulangan dengan syarat banyakData lebih besar atau sama dengan dataKe
            System.out.println("Data ke "+dataKe+" :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            nilaiDataKe=key.nextInt(); //mendefinisikan nilaiDataKe sebagai angka yang akan dimasukkan dari keyboard
            
            total=total+nilaiDataKe; //mendefinisikan total sebagai operasi total+nilaiDataKe
            dataKe++; //menambah variabel dataKe dengan 1
        }
        rataRata=total/banyakData; //mendefinisikan rataRata sebagai operasi total dibagi banyakData
        System.out.println("Rata-Rata data di atas adalah :"+rataRata); //memunculkan teks yang ada di dalam petik dua ke dalam output
        
    }
}
