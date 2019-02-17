/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas03_lingkaran;

/**
 *
 * @author Fajar Sanggi Peratama
 */

import java.util.Scanner;
public class Main {

    Scanner input;
    
    Lingkaran lingkaran1 = new Lingkaran();
    Lingkaran lingkaran2 = new Lingkaran();
    String[] hasil;
    String[] hasil2;
    int jarijari1,jarijari2,x1,x2,y1,y2,jarak;

    public Main() {
        this.input = new Scanner(System.in);
    }

    public void lingkaran1() {
        System.out.println("Masukan Data Lingkaran ke-1 : ");
        System.out.print("Masukan Jari-Jari: ");
        jarijari1 = input.nextInt();
        System.out.print("Masukan SUMBU X: ");
        x1 = input.nextInt();
        System.out.print("Masukan SUMBU Y: ");
        y1 = input.nextInt();
        
        lingkaran1.setX(x1);
        lingkaran1.setY(y1);
        lingkaran1.setR(jarijari1);
        
        System.out.println("");
    }

    public void lingkaran2() {
       System.out.println("Masukan Data Lingkaran ke-2 : ");
        System.out.print("Masukan Jari-Jari: ");
        jarijari2 = input.nextInt();
        System.out.print("Masukan SUMBU X: ");
        x2 = input.nextInt();
        System.out.print("Masukan SUMBU Y: ");
        y2 = input.nextInt();
        
        lingkaran1.setX(x2);
        lingkaran1.setY(y2);
        lingkaran1.setR(jarijari2);
        
        System.out.println("");
    }

    public void hitung() {
        jarak = (int) Math.sqrt(Math.pow((lingkaran1.getX() - lingkaran2.getX()), 2) + Math.pow((lingkaran1.getY() - lingkaran2.getY()), 2));

        if (jarak >= (lingkaran1.getR() + lingkaran2.getR())) {
            System.out.println("");
            System.out.println("Hasilnya : ");
            System.out.println("C1 dan C2 Saling Lepas");
        } else if (jarak < (lingkaran1.getR() + lingkaran2.getR())) {
            if ((lingkaran1.getR() < lingkaran2.getR()) && (((lingkaran1.getX() + lingkaran1.getR() < lingkaran2.getX() + lingkaran2.getR()) && (lingkaran1.getX() - lingkaran1.getR() > lingkaran2.getX() - lingkaran2.getR()) && (lingkaran1.getY() + lingkaran1.getR() < lingkaran2.getY() + lingkaran2.getR()) && (lingkaran1.getY() - lingkaran1.getR() > lingkaran2.getY() - lingkaran2.getR())))) {
                System.out.println("");
                System.out.println("Hasilnya : ");
                System.out.println("C1 ada di dalam C2");
            } else if ((lingkaran1.getR() > lingkaran2.getR()) && (((lingkaran1.getX() + lingkaran1.getR() > lingkaran2.getX() + lingkaran2.getR()) && (lingkaran1.getX() - lingkaran1.getR() < lingkaran2.getX() - lingkaran2.getR()) && (lingkaran1.getY() + lingkaran1.getR() > lingkaran2.getY() + lingkaran2.getR()) && (lingkaran1.getY() - lingkaran1.getR() < lingkaran2.getY() - lingkaran2.getR())))) {
                System.out.println("");
                System.out.println("Hasilnya : ");
                System.out.println("C2 ada di dalam C1");
            } else {
                System.out.println("");
                System.out.println("Hasilnya : ");
                System.out.println("C1 dan C2 saling beririsan");
            }
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****************************************");
        System.out.println("*APLIKASI MEMBANDINGKAN 2 BUAH LINGKARAN*");
        System.out.println("*****************************************");
        System.out.println("");
        Main Bola = new Main();
            Bola.lingkaran1();
            Bola.lingkaran2();
            Bola.hitung();
    }

}