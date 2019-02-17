/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas03_3terbesar;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @Fajar Sanggi Peratama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in); 
        System.out.print("Masukkan Deret Angka : "); 
        String angka = sc.nextLine(); 
        
        String[] kata = angka.split(" ");
        Arrays.sort(kata, Collections.reverseOrder());
        //int a = length(kata);
        
        String text1 = kata[0];
        String text2 = kata[1];
        String text3 = kata[2];
        
        System.out.println("Nilai Terbesar 1 = "+text1);
        System.out.println("Nilai Terbesar 2 = "+text2);
        System.out.println("Nilai Terbesar 3 = "+text3);


    }
    
}
