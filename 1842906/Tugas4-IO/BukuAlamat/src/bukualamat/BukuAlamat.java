/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

/**
 *
 * @author IT & SIRS
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class BukuAlamat {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
    String PIL="";
    String n="";
    String yatidak="";
    int no;
    int jumlah=0;
    do {
        try {
            System.out.println("*************************************************************");
            System.out.println("**          SELAMAT DATANG DI APLIKASI BUKU ALAMAT         **");
            System.out.println("*************************************************************");
            System.out.println("** 1. INPUT DATA                                           **");
            System.out.println("** 2. TAMPILKAN DATA                                       **");
            System.out.println("** 0. KELUAR                                               **");
            System.out.println("*************************************************************");
            System.out.print("\nMASUKAN PILIHAN ANDA [1/2/0]:");
                       try{
                        PIL=dataIn.readLine();
                       }catch(NumberFormatException e){
                       System.out.println("Erorr!");
                       }
            //Menampilkan nama siswa1
            switch(Integer.parseInt(PIL)){
            //awal prosedur memasukan
            case 1:
                System.out.println("*************************************************************");
                System.out.println("PROSES INPUT DATA:");
                System.out.println("*************************************************************");
                tulisFile();
                
                
                break;
        
            case 2:

                System.out.println("NAMA\t ALAMAT\t NO TELEPON \t EMAIL \t");
                BacaFile();
                 break;
                        
            default:
                System.out.println("Terima Kasih");
            }
                        } catch (NumberFormatException e) {
                            System.out.println("inputTidakValid");
                        }
                    } while (Integer.parseInt(PIL) != 0);
                }
    public static void tulisFile(){
        Scanner input = null;
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("BukuAlamat.txt"))) {
                System.out.print("Input Nama: ");
                String nama=dataIn.readLine();
                writer.write(nama + "\t");
                
                System.out.print("Input Alamat: ");
                String alamat=dataIn.readLine();
                writer.write(alamat + "\t");
                
                System.out.print("Input No Telepon: ");
                String telp=dataIn.readLine();
                writer.write(telp + "\t");
                
                System.out.print("Input Email: ");
                String email=dataIn.readLine();
                writer.write(email + "\t");
                
                writer.close();
            }
              
        } catch (IOException e) {
        }
    }
    public static void BacaFile() throws IOException{
        try {
            FileReader fr = new FileReader("BukuAlamat.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String text;
            
            while ((text = br.readLine()) != null) {
                System.err.println(text);
                
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
    
