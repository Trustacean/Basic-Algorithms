/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

/**
 *
 * @author Crusts
 */
public class tugas2 { //public class bernama tugas2
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        for (int jam = 1; jam <= 12; jam++) { //perulangan
            //deklarasi jam=1, syarat perulangan jam kurang dari sama dengan 12, jam ditambah 1 tiap perulangan
            for (int menit = 1; menit <= 60; menit++) { //perulangan
                //deklarasi menit=1, syarat perulangan menit kurang dari sama dengan 60, menit ditambah 1 tiap perulangan
                for (int detik = 1; detik <= 60; detik++) {
                    //deklarasi detik=1, syarat perulangan detik kurang dari sama dengan 60, detik ditambah 1 tiap perulangan
                    if (detik==1) {//percabangan dengan syarat detik = 1
                        System.out.println(""); 
                        System.out.print("Detik :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                    }
                    System.out.print(detik+" "); //memunculkan variabel detik dalam output
                }
                System.out.println("");
                System.out.print("Menit :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                System.out.println(menit+" "); //memunculkan variabel menit dalam output
            }
            
            System.out.print("Jam :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            System.out.println(jam); //memunculkan variabel jam dalam output
        }
    }
}
