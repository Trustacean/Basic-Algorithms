/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

/**
 *
 * @author Crusts
 */
import java.util.Scanner; //mengimpor scanner ke dalam program

public class tugas6 { //public class bernama tugas6

    public static void main(String[] args) { //main untuk memulai jvm
        int umur, jmlhPenduduk; //deklarasi variabel dengan tipe data int
        int range1 = 0, range2 = 0, range3 = 0, range4 = 0, range5 = 0; //deklarasi variabel dengan tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru

        do { //melakukan perintah di dalam
            System.out.println("Jum Penduduk :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            jmlhPenduduk = key.nextInt(); //mendefinisikan nilai variabel jmlhPenduduk sebagai angka yang akan diinput
            if (jmlhPenduduk <= 0) { //percabangan dengan syarat nilai jmlhPenduduk kurang dari sampai nol
                System.out.println("Jumlah Penduduk Tidak Boleh Kurang "); 
                System.out.println("Dari  Atau Sama Dengan Nol!");//memunculkan teks yang ada di dalam petik dua ke dalam output

            }
            for (int i = 1; i <= jmlhPenduduk; i++) { //perulangan
                //deklarasi i=1, syarat perulangan i kurang dari sampai nilai jmlhPenduduk, increment i tiap perulangan
                do { //melakukan perintah di dalam
                    System.out.println("Umur warga " + i); //memunculkan teks yang ada di dalam petik dua ke dalam output
                    umur = key.nextInt(); //mendefinisikan nilai variabel umur sebagai angka yang akan diinput

                    if (umur < 0) { //percabangan dengan syarat umur kurang dari nol
                        System.out.println("Umur Tidak Boleh Kurang");
                        System.out.println("Dari Atau Sama Dengan Nol!"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                    } else if (umur > 100) { //percabangan dengan syarat umur lebih dari 100
                        System.out.println("Umur Tidak Boleh Lebih"); 
                        System.out.println("Dari Seratus!"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                    }

                    if (umur >= 0 && umur <= 20) { //percabangan dengan syarat umur dari 0 sampai 20
                        range1++; //increment range1
                    } else if (umur >= 21 && umur <= 40) { //percabangan dengan syarat umur dari 21 sampai 40
                        range2++; //increment range2
                    } else if (umur >= 41 && umur <= 60) { //percabangan dengan syarat umur dari 41 sampai 60
                        range3++; //increment range3
                    } else if (umur >= 61 && umur <= 80) { //percabangan dengan syarat umur dari 61 sampai 80
                        range4++; //increment range4
                    } else if (umur >= 81 && umur <= 100) { //percabangan dengan syarat umur dari 81 sampai 100
                        range5++; //increment range5
                    }
                } while (umur < 0 || umur > 100); //jika syarat umur kurang dari nol atau umur lebih dari 100 terpenuhi, diulang dari perintah do
            }
        } while (jmlhPenduduk <= 0); //jika syarat jmlhPenduduk kurang dari sama dengan nol terpenuhi, diulang dari do
        System.out.println("Distribusi Usia " + jmlhPenduduk + " Penduduk Di Atas Adalah:"); 
        //memunculkan teks yang ada di dalam petik dua ke dalam output

        System.out.print("umur 0 - 20 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        for (int i = 1; i <= range1; i++) { //perulangan
            //deklarasi i=1. syarat perulangan i kurang dari sampai range1, increment i tiap perulangan
            System.out.print("* "); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }

        System.out.println("");
        System.out.print("umur 21-40  :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        for (int i = 1; i <= range2; i++) { //perulangan
            //deklarasi i=1. syarat perulangan i kurang dari sampai range2, increment i tiap perulangan
            System.out.print("* "); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }

        System.out.println("");
        System.out.print("umur 41-60  :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        for (int i = 1; i <= range3; i++) { //perulangan
            //deklarasi i=1. syarat perulangan i kurang dari sampai range3, increment i tiap perulangan
            System.out.print("* "); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
        
        System.out.println("");
        System.out.print("umur 61-80  :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        for (int i = 1; i <= range4; i++) { //perulangan
            //deklarasi i=1. syarat perulangan i kurang dari sampai range4, increment i tiap perulangan
            System.out.print("* "); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }

        System.out.println("");
        System.out.print("umur 81-100 :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        for (int i = 1; i <= range5; i++) { //perulangan
            //deklarasi i=1. syarat perulangan i kurang dari sampai range5, increment i tiap perulangan
            System.out.print("* "); //memunculkan teks yang ada di dalam petik dua ke dalam output
        }
    }
}
