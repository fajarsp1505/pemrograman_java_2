import java.util.*;
class Nilai 
{
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);

	System.out.println("Program Nilai\n");
	System.out.print("Masukkan Nilai (A/B/C/D/E) : ");
	char A,B,C;
	char y = input.next().charAt(0);
	char x = Character.toUpperCase(y);
		if(x=='A'){
            System.out.println("Excellent");
        }
        else if(x=='B'){
            System.out.println("Good job!");
        }else if(x=='C'){
            System.out.println("Study harder!");
        }else{
            System.out.println("Sorry, you failed.");
        }

	}
}