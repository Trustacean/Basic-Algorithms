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
public class Tugas1 { //public class bernama Tugas1
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int menu,banyakR; //mendeklarasi variabel dengan tipe data int
        double resistan=0,untukParalel,nilaiR; //mendeklarasi variabel dengan tipe data double
        
        Scanner key = new Scanner(System.in); //membuat scannner baru
        System.out.println("    PROGRAM MENGHITUNG TOTAL RESISTAN"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        do { //melakukan operasi dalam kurung kurawal
            System.out.println("Disusun Paralel atau Seri?"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            System.out.println("1. Seri");
            System.out.println("2. Pararel");
            menu=key.nextInt(); //mendefinisikan variabel menu sebagai angka yang akan di input
        } while (menu<1||menu>2); //mengulang operasi do jika syarat dipenuhi
        
        if (menu==1) { //percabangan dengan syarat menu=1
            System.out.println("Banyak resistan yang ada :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            banyakR=key.nextInt(); //mendefinisikan variabel banyakR sebagai angka yang akan di input
            for (int count = 1; banyakR>=count; count++) { //perulangan
                //deklarasi int; statement ; increment count
                System.out.println("Masukan nilai resistan ke-"+count); //memunculkan teks yang ada di dalam petik dua ke dalam output
                nilaiR=key.nextDouble(); //mendefinisikan variabel nilaiR sebagai angka yang akan di input
                resistan=resistan+nilaiR; //mendefinisikan nilai resistan sebagai nilai resistan sebelumnya ditambah nilaiR
            }
            System.out.println("Total resistan seri adalah :"+resistan); 
            //memunculkan teks yang ada di dalam petik dua dan variabel resistan ke dalam output
        }
        if (menu==2) { //percabangan dengan syarat menu=2
            System.out.println("Banyak resistan yang ada :"); //memunculkan teks yang ada di dalam petik dua ke dalam output
            banyakR=key.nextInt(); //mendefinisikan banyakR sebagai angka yang akan di input
            for (int count = 1; banyakR>=count; count++) { //perulangan
                //deklarasi int ; statement ; increment count
                System.out.println("Masukan nilai resistan ke-"+count); //memunculkan teks yang ada di dalam petik dua ke dalam output
                nilaiR=key.nextDouble(); //mendefinisikan variabel nilaiR sebagai angka yang akan di input
                resistan=resistan+1/nilaiR; //mendefinisikan nilai resistan sebagai nilai resistan sebelumnya ditambah dengan satu per nilaiR
            }
            untukParalel=1/resistan; //membalikan total resistan dengan mengoperasikan 1 per resistan
            System.out.println("Total resistan paralel adalah :"+untukParalel); 
            //memunculkan teks yang ada di dalam petik dua dan variabel untukParalel ke dalam output
        }
    }
    
}
