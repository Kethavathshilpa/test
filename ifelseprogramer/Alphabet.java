import java.util.Scanner;
class Alphabet
{
	public static void main(String[] args)
	{
		int ch;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		ch=input.next().charAt(0);
		if((ch<='a'&& ch>='z')||(ch<='A'&& ch>='Z'))
		 {
			 System.out.println("character is a alphabet:");
		 }
		else
		 {
			 System.out.println("not a alphabet:");
		 }
	}
}