/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;
/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Tugas4 {
    public static void main(String[] args) { //main untuk memulai eksekusi
        int dataKe=1, banyakData; //memasukkan variabel ke dalam tipe data int
        double nilaiData, totalVariasi=0; 
        double total=0,rataRata, dataTerbesar=0, dataTerkecil=0, variasi, rentangData, deviasi; 
        //memasukkan variabel ke dalam tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru
        
        System.out.println("Banyak Data :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        banyakData=key.nextInt(); //mendefinisikan banyakData sebagai angka yang akan dimasukkan dari keyboard
        
        dataKe=1; //mendefinisikan dataKe sebagai angka 1
        if (dataKe<=banyakData) {
            do {                
                System.out.println("Data ke "+dataKe+" :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                nilaiData=key.nextDouble(); //mendefinisikan nilaiDataKe sebagai angka yang akan dimasukkan dari keyboard
                if (dataKe==1) { //percabangan dengan syarat dataKe sama dengan 1
                    dataTerbesar=nilaiData; //mendefinisikan variabel data terbesar dan data terkecil
                    dataTerkecil=nilaiData; //sebagai nilai data pertama
                }
                
                total=total+nilaiData; //mendefinisikan total sebagai operasi total+nilaiDataKe
                dataKe++; //menambah variabel dataKe dengan 1
                totalVariasi=totalVariasi+(nilaiData*nilaiData); //mendefinisikan total untuk menghitung variasi sebagai
                //jumlah nilai data kuadrat
                
                
                if (nilaiData<dataTerkecil) { //percabangan dengan syarat nilai data lebih kecil dari data terkecil sebelumnya
                    dataTerkecil=nilaiData; //mendefinisikan variabel data terkecil sebagai nilai data
                }
                if (nilaiData>dataTerbesar) { //percabangan dengan syarat nilai data lebih besar dari data terbesar sebelumnya
                    dataTerbesar=nilaiData; //mendefinisikan variabel data terbesar sebagai nilai data
                }
            } while (dataKe<=banyakData); //jika banyak data lebih besar atau sama dengan nilai dataKe, program diulang dari do
        }
        rentangData=dataTerbesar-dataTerkecil; //mengoperasikan rumus rentang data.
        rataRata=total/banyakData; //mendefinisikan rataRata sebagai operasi total dibagi banyakData
        variasi=(totalVariasi-((banyakData*rataRata)*(banyakData*rataRata)))/banyakData; //mengoperasikan rumus variasi
        deviasi=Math.sqrt(variasi) ; //mengoperasikan rumus deviasi
        
        
        System.out.println("Rentang data        :"+rentangData);
        System.out.println("Nilai data terkecil :"+dataTerkecil);
        System.out.println("Nilai data terbesar :"+dataTerbesar);
        System.out.println("Rata-rata data di atas adalah :"+rataRata); 
        System.out.println("Deviasi dari data   :"+deviasi);
        System.out.println("Variansi dari data  :"+variasi);
        //memunculkan teks yang ada di dalam petik dua dan variabel ke dalam output
    }
}

