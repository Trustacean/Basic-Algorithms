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

public class tugas5 { //public class bernama tugas5

    public static void main(String[] args) { //main untuk memulai jvm
        int matrik; //mendeklarasikan variabel ke dalam tipe data int
        Scanner key = new Scanner(System.in); //membuat kelas scanner baru
        System.out.println("Matriks berapa kali berapa? (5 artinya 5x5)"); //memunculkan teks yang ada di dalam petik dua ke dalam output
        matrik = key.nextInt(); //mendefinisikan variabel matrik sebagai angka yang akan di input
        for (int i = 1; i <= matrik; i++) { //perulangan
            //deklarasi i=1, syarat perulangan i kurang dari sampai matrik, increment i untuk setiap perulangan
            for (int j = 1; j <= matrik; j++) { //perulangan
                //deklarasi j=1, syarat perulangan j kurang dari sampai matrik, increment j untuk setiap perulangan
                if (i == j) { //percabangan dengan syarat nilai i = nilai j
                    System.out.print("1\t"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                } else { //percabangan jika tidak memenuhi syarat sebelumnya
                    System.out.print("0\t"); //memunculkan teks yang ada di dalam petik dua ke dalam output
                }
            }
            System.out.println(""); //membuat baris baru
        }
    }
}
