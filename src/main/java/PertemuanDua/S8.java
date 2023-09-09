/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanDua;

/**
 *
 * @author Crusts
 */
public class S8 { //public class bernama "S8"
    public static void main(String[] args) { //main untuk memulai eksekusi jvm
        int a,t; //memasukkan variabel a (alas) dan t (tinggi) ke salam tipe ddata int 
        double sm; //memasukkan variabel sm (sisi miring) ke dalam tipe data double
        
        a=8; //mendefinisikan variabel a sebagai 8
        t=10; //mendefinisikan variabel t sebagai 10
        sm=Math.sqrt((a*a)+(t*t)); //mendefinisikan variabel sm sebagai operasi akar a^2+t^2
        
        System.out.println("Sisi miring segitiga dengan alas "+a+" dan tinggi "+t+" adalah :"+sm);
        //memunculkan teks yang ada di dalam tanda petik dua dan variabel a, t, dan sm ke dalam output
    }
}
