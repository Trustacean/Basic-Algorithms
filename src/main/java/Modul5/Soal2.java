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
public class Soal2 { //public class bernama Soal2
    public static void main(String[] args) { //main untuk memulai eksekusi
        String ukuran; //memasukkan variabel ke dalam tipe data String
        int jumlah,hargatotal; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Ukuran Baju"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        ukuran=key.nextLine(); //mendefinisikan variabel ukuran sebagai klausa yang akan dimasukkan dari keyboard
        System.out.println("Masukkan Jumlah Yang Akan Dibeli"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        jumlah=key.nextInt(); //mendefinisikan variabel jumlah sebagai angka yang akan dimasukkan dari keyboard
        
        if (ukuran.equals("S")) { //percabangan dengan syarat ukuran=S
            //operasi dibawah akan dilakukan jika memenuhi syarat
            hargatotal=jumlah*30000; //mendefinisikan hargatotal sebagai operasi jumlah*30000
        } else if (ukuran.equals("M")) { //percabangan lain dengan syarat ukuran=M
            //operasi dibawah akan dilakukan jika memenuhi syarat
            hargatotal=jumlah*38000; //mendefinisikan hargatotal sebagai operasi jumlah*38000
        } else if (ukuran.equals("L")) { //percabangan lain dengan syarat ukuran=L
            //operasi dibawah akan dilakukan jika memenuhi syarat
            hargatotal=jumlah*45000; //mendefinisikan hargatotal sebagai operasi jumlah*45000
        } else if (ukuran.equals("XL")) { //percabangan lain dengan syarat ukuran=XL
            //operasi dibawah akan dilakukan jika memenuhi syarat
            hargatotal=jumlah*50000; //mendefinisikan hargatotal sebagai operasi jumlah*50000
        } else if (ukuran.equals("XXL")) { //percabangan lain dengan syarat ukuran=XXL
            //operasi dibawah akan dilakukan jika memenuhi syarat
            hargatotal=jumlah*60000; //mendefinisikan hargatotal sebagai operasi jumlah*60000
        } else {
            //operasi dibawah akan dilakukan jika syarat-syarat sebelumnya tidak dipenuhi
            hargatotal=0; //mendefinisikan hargatotal sebagai angka nol
        }
        
        System.out.println("Harga Total Pembelian Adalah :"+hargatotal); 
//memunculkan teks yang ada di dalam petik dua dan variabel hargatotal ke dalam output
        
    }
}
