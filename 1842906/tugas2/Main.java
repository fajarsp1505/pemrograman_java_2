/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Fajar Sanggi Peratama (1842906)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**************************************");
        System.out.println("*********APLIKASI HITUNG LUAS*********");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("********Hitung Luas Lingkaran*********");

        Circle c = new Circle(5, "Bola Billiard");
        System.out.println("Nama          : " + c.getName());
        System.out.println("Jari Jari (cm): " + c.getRadius());
        System.out.println("Luas      (cm): " + c.getArea());

        System.out.println("");
        System.out.println("*********Hitung Luas Persegi**********");

        Rectangle r = new Rectangle("PINTU", 200, 80);
        System.out.println("Nama        : " + r.getName());
        System.out.println("Panjang (cm): " + r.getLength());
        System.out.println("Lebar   (cm): " + r.getWidth());
        System.out.println("Luas    (cm): " + r.getArea());
    }
    
}
