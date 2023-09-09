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
public class Soal5 {
    public static void main(String[] args) {
        int tgl,bulan; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Tanggal Lahir :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        tgl=key.nextInt(); //mendefinisikan variabel tgl sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Masukkan Bulan Lahir :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        bulan=key.nextInt(); //mendefinisikan variabel tgl sebagai angka yang akan dimasukkan dari keyboard
                
        switch (bulan) { //percabangan untuk membandingkan variabel bulan
            case 1: //jika bulan = 1 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=19) { //percabangan dengan syarat tgl diantara 1 sampai 19
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Capricorn");
                }
                if (tgl>=20&&tgl<=30) { //percabangan dengan syarat tgl diantara 20 sampai 30
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Aquarius");
                }
                break;
            case 2: //jika bulan = 2 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=18) { //percabangan dengan syarat tgl diantara 1 sampai 18
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Aquarius");
                }
                if (tgl>=18&&tgl<=29) { //percabangan dengan syarat tgl diantara 18 sampai 29
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Pisces");
                }
                break;
            case 3: //jika bulan = 3 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=20) { //percabangan dengan syarat tgl diantara 1 sampai 20
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Pisces");
                }
                if (tgl>=21&&tgl<=30) { //percabangan dengan syarat tgl diantara 21 sampai 30
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Aries");
                }
                break;
            case 4: //jika bulan = 4 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=19) { //percabangan dengan syarat tgl diantara 1 sampai 19
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Aries");
                }
                if (tgl>=20&&tgl<=31) { //percabangan dengan syarat tgl diantara 20 sampai 31
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Taurus");
                }
                break;
            case 5: //jika bulan = 5 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=20) { //percabangan dengan syarat tgl diantara 1 sampai 20
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Taurus");
                }
                if (tgl>=21&&tgl<=30) { //percabangan dengan syarat tgl diantara 21 sampai 30
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Gemini");
                }
                break;
            case 6: //jika bulan = 6 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=20) { //percabangan dengan syarat tgl diantara 1 sampai 20
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Gemini");
                }
                if (tgl>=21&&tgl<=31) { //percabangan dengan syarat tgl diantara 21 sampai 31
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Cancer");
                }
                break;
            case 7: //jika bulan = 7 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tgl diantara 1 sampai 22
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Cancer");
                }
                if (tgl>=23&&tgl<=30) { //percabangan dengan syarat tgl diantara 23 sampai 30
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Leo");
                }
                break;
            case 8: //jika bulan = 8 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tgl diantara 1 sampai 22
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Leo");
                }
                if (tgl>=23&&tgl<=31) { //percabangan dengan syarat tgl diantara 23 sampai 30
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Virgo");
                }
                break;
            case 9: //jika bulan = 9 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tgl diantara 1 sampai 22
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Virgo");
                }
                if (tgl>=23&&tgl<=30) { //percabangan dengan syarat tgl diantara 23 sampai 30
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Libra");
                }
                break;
            case 10: //jika bulan = 10 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tgl diantara 1 sampai 22
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Libra");
                }
                if (tgl>=23&&tgl<=31) { //percabangan dengan syarat tgl diantara 23 sampai 31
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Scorpio");
                }
                break;
            case 11: //jika bulan = 11 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=21) { //percabangan dengan syarat tgl diantara 1 sampai 21
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Scorpio");
                }
                if (tgl>=22&&tgl<=30) { //percabangan dengan syarat tgl diantara 22 sampai 30
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Sagitarius");
                }
                break;
            case 12: //jika bulan = 12 operasi dibawah dijalankan jika syarat teroenuhi
                if (tgl>=1&&tgl<=21) { //percabangan dengan syarat tgl diantara 1 sampai 21
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Sagitarius");
                }
                if (tgl>=23&&tgl<=31) { //percabangan dengan syarat tgl diantara 23 sampai 31
                    //operasi dibawah dijalankan jika syarat teroenuhi
                System.out.println("Capricorn");
                }
                break;
        }
    }
}
