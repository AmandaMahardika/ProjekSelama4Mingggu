/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasArrayKelompok;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TugasArrayKelompok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] [] array1 = {
            {10,10},
            {10,10}
            
        };
        int[] [] array2 = {
            {9,9},
            {8,8},
            
        };
        
        System.out.println("======== Pengurangan =========");
        
        PrintArrays(array1);
        System.out.println("");
        PrintArrays(array2);
        System.out.println("");
                
        
        int[][] resultpengurangan = Pengurangan(array1, array2);
        PrintArrays(resultpengurangan);
        
        System.out.println("======== Penjumlahan =========");
        
        PrintArrays(array1);
        System.out.println("");
        PrintArrays(array2);
        System.out.println("");
                
        
        int[][] resultpenjumlahan = Penjumlahan(array1, array2);
        PrintArrays(resultpenjumlahan);
    }
    
//    proses pengurangan matrix dalam method
    private static int[] [] Pengurangan (int [][] array_a1, int [][] array_b1){
        int row_a = array_a1.length;
        int column_a = array_a1[0].length;
        
        int[][]  result = new int[row_a] [column_a];
        for (int i = 0; i < row_a; i++) {
            for(int j = 0; j < column_a; j++) {
                result[i] [j] = array_a1[i] [j] - array_b1[i] [j];  
            }
        }
        return result; 
    }
    
    
    //    proses penjumlahan matrix dalam method
    private static int[] [] Penjumlahan (int [][] array_a2, int [][] array_b2){
        int row_a = array_a2.length;
        int column_a = array_a2[0].length;
        
        int[][]  result = new int[row_a] [column_a];
        for (int i = 0; i < row_a; i++) {
            for(int j = 0; j < column_a; j++) {
                result[i] [j] = array_a2[i] [j] + array_b2[i] [j];  
            }
        }
        return result; 
        
    }
    
    
    
//    method untuk print array
    private static void PrintArrays (int[][] valuearrays) {
        int row  = valuearrays.length;
        int column = valuearrays[0].length;
  
        for (int i = 0; i < row; i++) {
            System.out.print("[");
            for (int j = 0; j < column; j++) {
                System.out.print(valuearrays[i][j]);
                if (j < (column -1)) {
                    System.out.print(",");
                
                } else {
                    System.out.print("]");     
                }
            }
            System.out.println("");
        }
    
    }
}
    
    

