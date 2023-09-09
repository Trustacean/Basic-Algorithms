/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Crusts
 */
import java.util.Scanner;
public class tugas8 {
    public static void main(String[] args) {
        //deklarasi variabel
        int jumMahasiswa;
        double tempDouble;
        int tempInt;
        char tempChar;
        String tempString;
        //kelas scanner baru
        Scanner key = new Scanner(System.in);
        //input nilai jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa :");
        jumMahasiswa=key.nextInt();
        //dekalrasi array
        double total[]=new double[jumMahasiswa];
        int us1[] = new int[jumMahasiswa],us2[] = new int[jumMahasiswa],uas[] = new int[jumMahasiswa];
        char NilaiHuruf [] = new char[jumMahasiswa];
        String nama[] = new String[jumMahasiswa],Nim[] = new String[jumMahasiswa];
        //looping untuk memasukkan nama, nim, nilai us1, nilai us2, dan nilai uas
        for (int i = 0; i < jumMahasiswa; i++) {
            System.out.println("Nama Mahasiswa ke - "+(i+1));
            nama[i]=key.next();
            System.out.println("Nim Mahasiswa ke - "+(i+1));
            Nim[i]=key.next();
            System.out.println("Nilai US 1 Mahasiswa ke - "+(i+1));
            us1[i]=key.nextInt();
            System.out.println("Nilai US 2 Mahasiswa ke - "+(i+1));
            us2[i]=key.nextInt();
            System.out.println("Nilai UAS Mahasiswa ke - "+(i+1));
            uas[i]=key.nextInt();
            //memanggil method hitungTotal
            total[i]=hitungTotal(us1[i], us2[i], uas[i]);
            //memanggil method NilaiHuruf
            NilaiHuruf[i]=NilaiHuruf(total[i]);
        }
        //looping bubble sort untuk mengurutkan daftar sesuai dengan total nilai
        for (int i = 0; i < jumMahasiswa - 1; i++) {
            for (int j = 0; j < jumMahasiswa - (i + 1); j++) {
                //menukar indeks I dengan J untuk tiap array jika indeks I
                //lebih besar dari indeks I dari array total nilai
                if (total[j] < total[j + 1]) {
                    tempDouble = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = tempDouble;
                    
                    tempString = Nim[j];
                    Nim[j] = Nim[j + 1];
                    Nim[j + 1] = tempString;
                    
                    tempString = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = tempString;
                    
                    tempInt = us1[j];
                    us1[j] = us1[j + 1];
                    us1[j + 1] = tempInt;
                    
                    tempInt = us2[j];
                    us2[j] = us2[j + 1];
                    us2[j + 1] = tempInt;
                    
                    tempInt = uas[j];
                    uas[j] = uas[j + 1];
                    uas[j + 1] = tempInt;
                    
                    tempChar = NilaiHuruf[j];
                    NilaiHuruf[j] = NilaiHuruf[j + 1];
                    NilaiHuruf[j + 1] = tempChar;
                }
            }
        }
        System.out.println("No.\tNIM\t\tNama\t\tUS1\tUS2\tUAS\tTotal\tfinal");
        //menampilkan daftar mahasiswa, nim, nilai us1, nilai us2, nilai uas, total nilai, dan nilai huruf.
        for (int i = 0; i < jumMahasiswa; i++) {
            System.out.print((i+1)+".\t"+Nim[i]+"\t\t"+nama[i]+"\t\t"+us1[i]);
            System.out.println("\t"+us2[i]+"\t"+uas[i]+"\t"+total[i]+"\t"+NilaiHuruf[i]);
        }
        
    }
    //method untuk menghitung total nilai
    static double hitungTotal(int us1, int us2, int uas ) {
        //mengoperasikan rumus total nilai dan mengembalikannya
        return ((3*us1)/10)+((3*us2)/10)+((2*uas)/5);
    }
    //method untuk mencari nilai huruf dari total nilai
    static char NilaiHuruf(double totalNilai) {
        //deklarasi variabel
        char nilaiHuruf;
        nilaiHuruf='F';
        //percabangan mencari nilai huruf
        if (totalNilai>=80&&totalNilai<=100) {
                nilaiHuruf='A';
            } else if (totalNilai>=65&&totalNilai<80) {
                nilaiHuruf='B';
            } else if (totalNilai>=55&&totalNilai<65) {
                nilaiHuruf='C';
            } else if (totalNilai>=45&&totalNilai<55) {
                nilaiHuruf='D';
            } else if (totalNilai<45) {
                nilaiHuruf='E';
            }
        return nilaiHuruf; //mengembalikan nilaiHuruf
    }
}

