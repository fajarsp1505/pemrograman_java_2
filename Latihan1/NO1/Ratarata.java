import java.util.*;

public class Ratarata
{
public static void main(String[] args)

{
Scanner input = new Scanner(System.in);


double a,b,c, tambah,rata,max;
String simbol;

System.out.println("Program Rata-Rata\n");
System.out.print("Masukkan Nilai Ujian 1: ");
a = input.nextDouble();
System.out.print("Masukkan Nilai Ujian 2: ");
b = input.nextDouble();
System.out.print("Masukkan Nilai Ujian 3: ");
c = input.nextDouble();
tambah = a + b + c;
rata = tambah / 3;

max=(a>=b)? a: b;
max=(c>=max)? c: max;

if (rata >= 60)
{
	simbol = ":D";
}else 
	{
		simbol = ":-(";
	}
System.out.println("Rata Rata = " + (int)rata + "  " + simbol);
System.out.println("Nilai Tertinggi = " + (int)max);
}
}