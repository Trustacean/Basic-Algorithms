/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

/**
 *
 * @author Crusts
 */
public class tugas1 { //public class bernama Tugas1
    public static void main(String[] args) { //main untuk memulai eksekusi JVM
        for (int i = 1; i <= 5; i++) { //perulangan dengan syarat 1<=5, 1++, i dimulai dari 1
            for (int j = 1; j <=5 ; j++) { //perulangan dengan syarat j<=5, j++, j dimulai dari 1
                System.out.print(i); //mencetak variabel i
                if (i==j) { //percabangan jika nilai i sama dengan nilai j
                    System.out.println(""); //memberi jeda untuk ke baris berikutnya (enter)
                    break; //memberhentikan loop
                    
                }
            }
        }
    }
}
