import java.io.*;
class tugas1 
{
	public static void main(String[] args) 
	{
	double p=0,l=0;
	String str;

	BufferedReader Get=new BufferedReader(new InputStreamReader(System.in));
	persegipanjang segi=new persegipanjang();

	System.out.println(“Menghitung Luas & Keliling Persegi Panjang”);
	System.out.print(“Input Panjang : “); str=Get.readLine();
	p=Integer.parseInt(str);
	System.out.print(“Input Lebar : “); str=Get.readLine();
	l=Integer.parseInt(str);

	System.out.println(“Luas : “+segi.hitungluas(p,l));

	System.out.println(“Keliling : “+segi.hitungkeliling(p,l));

	}

	double hitungluas(double p, double l){
	double luas;
	luas=p*l;
	return (luas);

	}
	double hitungkeliling(double p, double l){
	double keliling;
	keliling=2*p+2*l;
	return (keliling);

}
}