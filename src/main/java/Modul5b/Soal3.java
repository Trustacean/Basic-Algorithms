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
public class Soal3 { //public class bernama Soal2
    public static void main(String[] args) { //main untuk memulai eksekusi
        String ukuran; //memasukkan variabel ke dalam tipe data String
        int jumlah,hargatotal; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Ukuran Baju"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        ukuran=key.nextLine(); //mendefinisikan variabel ukuran sebagai klausa yang akan dimasukkan dari keyboard
        System.out.println("Masukkan Jumlah Yang Akan Dibeli"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        jumlah=key.nextInt(); //mendefinisikan variabel jumlah sebagai angka yang akan dimasukkan dari keyboard
        
        switch (ukuran) { //percabangan untuk membandingkan variabel ukuran
            case "S":
            case "s":
                hargatotal=jumlah*30000; //mendefinisikan hargatotal sebagai operasi jumlah*30000 jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat terpenuhi
            case "M":
            case "m":
                hargatotal=jumlah*38000; //mendefinisikan hargatotal sebagai operasi jumlah*38000 jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat terpenuhi
            case "L":
            case "l":
                hargatotal=jumlah*45000; //mendefinisikan hargatotal sebagai operasi jumlah*45000 jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat terpenuhi
            case "XL":
            case "xl":
                hargatotal=jumlah*50000; //mendefinisikan hargatotal sebagai operasi jumlah*50000 jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat terpenuhi
            case "XXL":
            case "xxl":
                hargatotal=jumlah*60000; //mendefinisikan hargatotal sebagai operasi jumlah*60000 jika syarat di atas terpenuhi
                break; //memberhentikan operasi jika syarat terpenuhi
            default:
                hargatotal=0; //jika syarat syarat di atas tidak terpenuhi
        }
        System.out.println("Total yang harus dibayar :"+hargatotal); 
//memunculkan teks yang ada di dalam petik dua dan variabel hargatotal ke dalam output
    }
}
