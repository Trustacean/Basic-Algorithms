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
public class Soal3 { //public class bernama Soal3
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int golongan,masakerja; //memasukkan variabel ke dalam tipe data int
        int gaji,gajitotal; //memasukkan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        
        System.out.println("Masukkan Golongan"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        golongan=key.nextInt(); //mendefinisikan variabel golongan sebagai angka yang akan dimasukkan
        System.out.println("Masukkan Masa Kerja (Tahun)"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        masakerja=key.nextInt(); //mendefinisikan variabel masakerja sebagai angka yang akan dimasukkan
        System.out.println("Gaji"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        gaji=key.nextInt(); //mendefinisikan variabel gaji sebagai angka yang akan dimasukkan
        
        if (golongan==1) { //percabangan dengan syarat golongan=1
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masakerja di antara 0 sampai 10
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji/2); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=11&&masakerja<=20) { //percabangan lain dengan syarat masakerja di antara 11 sampai 20
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*3/5); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=21&&masakerja<=30) { //percabangan lain dengan syarat masakerja di antara 21 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*7/10); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
        }
        if (golongan==2) { //percabangan lain dengan syarat golongan=2
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masakerja di antara 0 sampai 10
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*3/5); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=11&&masakerja<=20) { //percabangan lain dengan syarat masakerja di antara 11 sampai 20
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*7/10); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=21&&masakerja<=30) { //percabangan lain dengan syarat masakerja di antara 21 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*4/5); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
        }
        if (golongan==3) { //percabangan lain dengan syarat golongan=3
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masakerja di antara 0 sampai 10
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*7/10); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=11&&masakerja<=20) { //percabangan lain dengan syarat masakerja di antara 11 sampai 20
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*4/5); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=21&&masakerja<=30) { //percabangan lain dengan syarat masakerja di antara 21 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*9/10); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
        }
        if (golongan==4) { //percabangan lain dengan syarat golongan=4
            //operasi dibawah akan dilakukan jika syarat dipenuhi
            if (masakerja>=0&&masakerja<=10) { //percabangan dengan syarat masakerja di antara 0 sampai 10
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*4/5); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=11&&masakerja<=20) { //percabangan lain dengan syarat masakerja di antara 11 sampai 20
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji+(gaji*9/10); //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
            else if (masakerja>=21&&masakerja<=30) { //percabangan lain dengan syarat masakerja di antara 21 sampai 30
                //operasi dibawah akan dilakukan jika syarat dipenuhi
                gajitotal=gaji*2; //mengoperasikan variabel gajitotal
                System.out.println("Gaji Akhir Anda Adalah :"+gajitotal);
                //memunculkan teks yang ada di dalam petik dua dan variabel gajitotal ke dalam output
            }
        }
    }
}
