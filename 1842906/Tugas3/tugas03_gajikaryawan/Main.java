/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas03_gajikaryawan;

/**
 *
 * @author Fajar Sanggi Peratama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("**************************************");
        System.out.println("*********DAFTAR GAJI KARYAWAN*********");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("***************MANAJER****************");
        Manajer boss = new Manajer("Fajar Sanggi Peratama", "Jalan Saluyu", 8000000) {};
        boss.setBonus(3000000);
        Staff a = new Staff("Budi", "Jalan Kopo", 6000000) {};
        Staff b = new Staff("Tono", "Jalan Pelajar Pejuang", 5000000) {};
        System.out.println("Nama Karyawan : " + boss.getName());
        System.out.println("Alamat : " + boss.getAddress());
        System.out.println("Gaji : " + boss.getSalary());
        System.out.println("");
        System.out.println("*****************STAFF****************");
        System.out.println("Nama Karyawan : " + a.getName());
        System.out.println("Alamat : " + a.getAddress());
        System.out.println("Gaji : " + a.getSalary());
        System.out.println("");
        System.out.println("Nama Karyawan : " + b.getName());
        System.out.println("Alamat : " + b.getAddress());
        System.out.println("Gaji : " + b.getSalary());
    }
    
}
