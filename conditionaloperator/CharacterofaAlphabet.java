import java.util.Scanner;
class CharacterofaAlphabet 
{
	public static void main(String[] args) 
	{
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the character:");
		int ch = scr.next().charAt(0);

		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
              System.out.println("character");
		}
		 else
		{
			  System.out.println("not character:");
		}
	}
}
