/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program
public class Tugas4 { //public class bernama Tugas4
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int koefA,koefB,konst; //mendeklarasi variabel dengan tipe data int
        double D=0; //mendeklarasi variabel dengan tipe data double
        Scanner key = new Scanner(System.in); //membuat scanner baru
        
        
        do { //melakukan operasi dalam kurung kurawal
            System.out.println("Masukkan Koefisien A, Koefieisn B, dan Konstanta");
            //memunculkan teks yang ada di dalam petik dua ke dalam output
            koefA=key.nextInt();
            koefB=key.nextInt();
            konst=key.nextInt();
            //mendefinisikan variabel koefA, koefB dan konst sebagai angka yang di input
            
            D=koefB*koefB-(4*koefA*konst); //mengoperasikan rumus D
            if (D<=0) { //percabangan dengan syarat D kurang dari atau sama dengan 0
                System.out.println("Tidak bisa dilakukan ");
                System.out.println("karena menghasilkan D kurang dari atau sama dengan nol");
                //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        } while (D<=0); //mengulang dari perintah do jika memenuhi persyaratan
        System.out.println(((-koefB+Math.sqrt(D))/(2*koefA)));
        System.out.println(((-koefB-Math.sqrt(D))/(2*koefA)));
        //mencetak variabel ke dalam output
        System.out.println("x1\ty = ax2+bx+c");
        //memunculkan teks yang ada di dalam petik dua ke dalam output
        for (double x1=((-koefB+Math.sqrt(D))/(2*koefA)),x2=((-koefB-Math.sqrt(D))/(2*koefA)); x2 <= x1; x2=x2+0.25) {
           //perulangan dengan syarat x2<=x1, x2 ditambah 0.25 tiap perulangan
            double hasil; //mendeklarasikan variabel dengan tipe data double
            hasil=koefA*(x2*x2)+(koefB*x2)+(konst); //mengoperasikan hasil perhitungan persamaan kuadrat
            
            
                System.out.println(x2+"\ty ="+hasil);
                //memunculkan teks yang ada di dalam petik dua dan variabel x2 dan hasil dalam output
            }
            
                
        }
        
        
    
}
