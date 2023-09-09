/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Crusts
 */
public class tugas5 {

    public static void main(String[] args) {
        //deklarasi array bertipe data int
        int[] usia1 = {18, 39, 45, 50, 65, 70, 90};
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96};
        int[] gabungan = new int[usia1.length + usia2.length];

        //perulangan untuk menggabung dua array
        for (int i = 0, j = 0; i < gabungan.length; i++) {
            if (i < usia1.length) {
                gabungan[i] = usia1[i];
            } else {
                gabungan[i] = usia2[j];
                j++;
            }
        }
        //perulangan untuk mengurutkan gabungan dua array
        for (int i = 0, j = 0, k = 0; k < (gabungan.length); k++) {
            //jika i kurang dari panjang array usia1
            if (i < usia1.length) {
                
                if (usia1[i] <= usia2[j]) {
                    gabungan[k] = usia1[i];
                    i++;
                    
                } else if (usia1[i] >= usia2[j]) {
                    gabungan[k] = usia2[j];
                    j++;
                    
                }
            } else {
                gabungan[k] = usia2[j];
                j++;
            }
        }
        //mencetak semua indeks array gabungan yang telah diurutkan
        for (int i = 0; i < gabungan.length; i++) {
            System.out.print(gabungan[i] + " ");
        }

    }
}
