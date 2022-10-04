/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oikawa;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Oikawa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner masukan = new Scanner (System.in);
        System.out.print("Masukan Angka =");
        int angka = masukan.nextInt();
        if (angka%2==0) {
            System.out.println("Angka"+ angka + "adalah");
            System.out,println("Bilangan Genap");
        } else {
            System.out.println("Angka"+ angka + "adalah");
            System.out.println("Bilangan Ganjil")
        }
        String hasil;
        hasil = angka%2==0 ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(hasil);
    int angka = 3
    }
  
}
