/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversikleas;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class KonversiKleas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nim, nama, prodi, matkul;
       int nilai;
       Scanner masukan= new Scanner(System.in);
       System.out.print("Masukan NIM =");
       nim = masukan.nextLine();
       System.out.print("Masukan Nama =");
       nama = masukan.nextLine();
       System.out.print("Matakuliah =");
       matkul = masukan.nextLine();
       System.out.println("Masukan Nilai Angka");
       nilai = masukan.NextLine();
       //       ====mengambil jurusan nim====
       
      prodi = nim.substring (3, 5);
      System.out.println("Program Studi : ");
      switch (prodi) {
          case "52":
             System.out.println("Program Studi = S1 Teknologi Informasi");
             break;
          case "51":
              System.out.println("Program Studi = S1 Sistem Informasi");
              break;
          case "31":
              System.out.println("Program Studi = D3 Sistem Informasi");
              break;
      }
    }
}
