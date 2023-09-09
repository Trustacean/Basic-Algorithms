/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Crusts
 */
import java.util.Scanner;

public class tugas3 {
    //method tanpa balikkan
    static void bacaTitik() {
        //deklarasi variabel bertipe data double
        double x1, x2, x3, y1, y2, y3;
        double sisiA, sisiB, sisiC;
        //kelas scanner baru
        Scanner key = new Scanner(System.in);
        
        //input angka ke dalam variabel
        System.out.println("Absis Titik 1 (x1) :");
        x1 = key.nextDouble();
        System.out.println("Ordinat Titik 1 (y1) :");
        y1 = key.nextDouble();
        System.out.println("Absis Titik 2 (x2) :");
        x2 = key.nextDouble();
        System.out.println("Ordinat Titik 2 (y2) :");
        y2 = key.nextDouble();
        System.out.println("Absis Titik (x3) 3 :");
        x3 = key.nextDouble();
        System.out.println("Ordinat Titik 3 (y3) :");
        y3 = key.nextDouble();
        
        //memanggil method hitungJarak untuk mendefinisikan nilai variabel sisi
        sisiA = hitungJarak(x1, y1, x2, y2);
        sisiB = hitungJarak(x2, y2, x3, y3);
        sisiC = hitungJarak(x3, y3, x1, y1);
        
        //mencetak variabel sisi A, B, dan C
        System.out.println("Sisi A :"+sisiA);
        System.out.println("Sisi B :"+sisiB);
        System.out.println("Sisi C :"+sisiC);
        
        //memanggil method hitungKeliling sekaligus mencetak hasilnya
        System.out.println("Keliling Segitiga : " + hitungKeliling(sisiA, sisiB, sisiC));
        //percabangan untuk menentukkan luas dapat dicari dengan rumus atau tidak
        if (hitungLuas(sisiA, sisiB, sisiC)!=0) {
            //memanggil method hitungLuas sekaligus mencetak hasilnya
            System.out.println("Luas Segitiga : " + hitungLuas(sisiA, sisiB, sisiC));
        } else {
            //menginformasikkan bahwa luas tidak bisa dicari dengan rumus
            System.out.println("Luas Segitiga Tidak Bisa Dicari Karena Segitiga Sembarang");
        }
        

    }
    //method untuk menghitung jarak
    static double hitungJarak(double x1, double y1, double x2, double y2) {
        //mengoperasikan rumus jarak dengan pitagoras dan mengembalikkan
        return Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
    }
    //method untuk menghitung keliling
    static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        //mengoperasikkan rumus keliling dan mengembalikkan
        return sisiA + sisiB + sisiC;
    }
    //method untuk menghitung luas
    static double hitungLuas(double sisiA, double sisiB, double sisiC) {
        //percabangan untuk mencari jenis jenis segitiga
        //Sama Sisi
        if (sisiA == sisiB && sisiA == sisiC) {
            return Math.sqrt((sisiA * sisiA)-((sisiA/2)*(sisiA/2))) * (sisiA / 2);
        } //Sama Kaki
        else if (sisiA == sisiB) {
            return Math.sqrt((sisiB * sisiB)-((sisiC/2)*(sisiC/2))) * (sisiC / 2);
        } else if (sisiB == sisiC) {
            return Math.sqrt((sisiC * sisiC)-((sisiA/2)*(sisiA/2))) * (sisiA / 2);
        } else if (sisiA == sisiC) {
            return Math.sqrt((sisiC * sisiC)-((sisiB/2)*(sisiB/2))) * (sisiB / 2);
        } //Segitiga Siku
        else if ((sisiA * sisiA) == ((sisiB * sisiB) + (sisiC * sisiC))) {
            return sisiB * sisiC / 2;
        } else if ((sisiB * sisiB) == ((sisiA * sisiA) + (sisiC * sisiC))) {
            return sisiA * sisiC / 2;
        } else if ((sisiC * sisiC) == ((sisiB * sisiB) + (sisiA * sisiA))) {
            return sisiB * sisiA / 2;
        } else {
            return 0;
        }
        
        //rumus luas segitiga dioperasikkan dan dikembalikkan sesuai dengan jenis jenis segitiganya.
    }

    public static void main(String[] args) {
        //memanggil method bacaTitik.
        bacaTitik();
    }
}
