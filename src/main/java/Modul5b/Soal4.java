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
public class Soal4 { 
    public static void main(String[] args) {
        int golongan,masakerja; //memasukkan variabel ke dalam tipe data int
        int gaji,gajitotal; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Golongan"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        golongan=key.nextInt(); //mendefinisikan variabel golongan sebagai angka yang akan dimasukkan
        System.out.println("Masukkan Masa Kerja (Tahun)"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        masakerja=key.nextInt(); //mendefinisikan variabel masakerja sebagai angka yang akan dimasukkan
        System.out.println("Gaji"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        gaji=key.nextInt(); //mendefinisikan variabel gaji sebagai angka yang akan dimasukkan
        
        switch (golongan) { //Percabangan untuk membandingkan nilai variabel golongan
            case 1: //jika golongan=1
                //operasi dibawah dijalankan jika syarat teroenuhi
                if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masa kerja diantara 0 sampai 10
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji/2);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
            else if (masakerja>=11&&masakerja<=20) { //percabangan dengan syarat masa kerja diantara 11 sampai 20
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*3/5);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
            else if (masakerja>=21&&masakerja<=30) { //percabangan dengan syarat masa kerja diantara 21 sampai 30
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*7/10);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                break;
            case 2: //jika golongan=2
                //operasi dibawah dijalankan jika syarat teroenuhi
                if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masa kerja diantara 0 sampai 10
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*3/5);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                else if (masakerja>=11&&masakerja<=20) { //percabangan dengan syarat masa kerja diantara 11 sampai 20
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*7/10);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                else if (masakerja>=21&&masakerja<=30) { //percabangan dengan syarat masa kerja diantara 21 sampai 30
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*4/5);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                break;
            case 3: //jika golongan=3
                //operasi dibawah dijalankan jika syarat teroenuhi
                if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masa kerja diantara 0 sampai 1
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*7/10);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                else if (masakerja>=11&&masakerja<=20) { //percabangan dengan syarat masa kerja diantara 11 sampai 20
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*4/5);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                else if (masakerja>=21&&masakerja<=30) { //percabangan dengan syarat masa kerja diantara 21 sampai 30
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*9/10);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                break;
            case 4: //jika golongan=4
                //operasi dibawah dijalankan jika syarat teroenuhi
                if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masa kerja diantara 0 sampai 1
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*4/5);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                else if (masakerja>=11&&masakerja<=20) { //percabangan dengan syarat masa kerja diantara 11 sampai 20
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji+(gaji*9/10);
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                else if (masakerja>=21&&masakerja<=30) { //percabangan dengan syarat masa kerja diantara 21 sampai 30
                //operasi dibawah dijalankan jika syarat teroenuhi
                gajitotal=gaji*2;
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                }
                break;
        }
    }
}
