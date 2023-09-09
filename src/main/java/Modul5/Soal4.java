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
public class Soal4 { //public class bernama Soal4
    public static void main(String[] args) { //main untuk memulai eksekusi
        int tgl,bulan; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Tanggal Lahir :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        tgl=key.nextInt(); //mendefinisikan variabel tgl sebagai angka yang akan dimasukkan dari keyboard
        System.out.println("Masukkan Bulan Lahir :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        bulan=key.nextInt(); //mendefinisikan variabel tgl sebagai angka yang akan dimasukkan dari keyboard
        
        if (bulan==1) { //percabangan dengan syarat bulan=1
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=19) { //percabangan dengan syarat tanggal diantara 1 sampai 19
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Capricorn"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=20&&tgl<=31) { //percabangan dengan syarat tanggal diantara 20 sampai 31
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Aquarius"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==2) { //percabangan dengan syarat bulan=2
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=18) { //percabangan dengan syarat tanggal diantara 1 sampai 18
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Aquarius"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=18&&tgl<=29) { //percabangan dengan syarat tanggal diantara 18 sampai 29
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Pisces"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==3) { //percabangan dengan syarat bulan=3
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=20) { //percabangan dengan syarat tanggal diantara 1 sampai 20
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Pisces"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=21&&tgl<=31) { //percabangan dengan syarat tanggal diantara 21 sampai 31
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Aries"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==4) { //percabangan dengan syarat bulan=4
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=19) { //percabangan dengan syarat tanggal diantara 1 sampai 19
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Aries"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=20&&tgl<=30) { //percabangan dengan syarat tanggal diantara 20 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Taurus"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==5) { //percabangan dengan syarat bulan=5
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=20) { //percabangan dengan syarat tanggal diantara 1 sampai 20
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Taurus"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=21&&tgl<=31) { //percabangan dengan syarat tanggal diantara 21 sampai 31
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Gemini"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==6) { //percabangan dengan syarat bulan=6
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=20) { //percabangan dengan syarat tanggal diantara 1 sampai 20
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Gemini"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=21&&tgl<=30) { //percabangan dengan syarat tanggal diantara 21 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Cancer"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==7) { //percabangan dengan syarat bulan=7
            //operasi dibawah akan dilakukan jika syarat-syarat sebelumnya tidak dipenuhi
            if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tanggal diantara 1 samapi 22
                //operasi dibawah akan dilakukan jika syarat-syarat sebelumnya tidak dipenuhi
                System.out.println("Cancer"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=23&&tgl<=31) { //percabangan dengan syarat tanggal diantara 23 sampai 31
                //operasi dibawah akan dilakukan jika syarat-syarat sebelumnya tidak dipenuhi
                System.out.println("Leo"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==8) { //percabangan dengan syarat bulan=8
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tanggal diantara 1 sampai 22
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Leo"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=23&&tgl<=31) { //percabangan dengan syarat tanggal diantara 23 sampai 31
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Virgo"); //memunculkan teks yang ada di dalam petik dua ke dalam output 
            }
        }
        if (bulan==9) { //percabangan dengan syarat bulan=9
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tanggal diantara 1 sampai 22
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Virgo"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=23&&tgl<=30) { //percabangan dengan syarat tanggal diantara 22 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Libra"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==10) { //percabangan dengan syarat bulan=10
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=22) { //percabangan dengan syarat tanggal diantara 1 sampai 22
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Libra"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=23&&tgl<=31) { //percabangan dengan syarat tanggal diantara 23 sampai 31
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Scorpio"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==11) { //percabangan dengan syarat bulan=11
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=21) { //percabangan dengan syarat tanggal diantara 1 sampai 21
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Scorpio"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=22&&tgl<=30) { //percabangan dengan syarat tanggal diantara 22 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Sagitarius"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
        if (bulan==12) { //percabangan dengan syarat bulan=12
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (tgl>=1&&tgl<=21) { //percabangan dengan syarat tanggal diantara 1 sampai 21
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Sagitarius"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
            if (tgl>=23&&tgl<=31) { //percabangan dengan syarat tanggal diantara 23 sampai 31
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                System.out.println("Capricorn"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            }
        }
    }
}
