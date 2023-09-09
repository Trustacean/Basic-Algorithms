/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Crusts
 */
public class tugas6 {
    public static void main(String[] args) {
        //deklarasi variabel bertipe data int
        int hitungGanjil=0, hitungGenap=0;
        //deklarasi array bertipe data int
        int[] array={23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        int[] ganjil=new int[array.length],genap=new int[array.length];
        
        System.out.println("Genap :");
        //memisahkan indeks array yang bernilai genap
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                //memasukkan indeks array bernilai genap ke dalam array genap
                genap[hitungGenap]=array[i];
                //mencetak indeks array genap
                System.out.print(genap[hitungGenap]+" ");
                hitungGenap++;
            }
        }
        System.out.println("");
        System.out.println("Ganjil :");
        //memisahkan indeks array yang bernilai ganjil
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0) {
                //memasukkan indeks array bernilai ganjil ke dalam array ganjil
                ganjil[hitungGanjil]=array[i];
                //mencetak indeks array ganjil
                System.out.print(ganjil[hitungGanjil]+" ");
                hitungGanjil++;
            }
        }
    }
}
