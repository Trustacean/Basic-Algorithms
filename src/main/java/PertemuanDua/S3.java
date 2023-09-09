/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanDua;

/**
 *
 * @author Crusts
 */
public class S3 { //Public class bernama S3
    public static void main(String[] args) { //Main untuk memulai eksekusi JVM
        int alas,tinggi; //memasukkan variabel alas dan tinggi ke dalam tipe data int
        float lseg3; //memasukkan variabel lseg3 (Luas segitiga) ke dalam tipe data float
        
        alas=35; //mendefinisikan alas sebagai 35
        tinggi=3; //mendefinisikan tinggi sebagai 3
        lseg3=(float) (0.5*alas*tinggi); //mendefinisikan lseg3 (luas segitiga) sebagai Operasi
                                         //(0.5*alas*tinggi)
        
        System.out.println("Hasil dari luas segitiga adalah :"+lseg3); 
        //memunculkan "Hasil dari luas segitiga adalah :" dan hasil lseg3
    }
}
