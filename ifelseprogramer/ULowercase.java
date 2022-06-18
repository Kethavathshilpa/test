import java.util.Scanner;
class ULowercase 
{
	public static void main(String[] args) 
	{
		int ch;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the alphabets:");
		ch=input.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			    System.out.println("lowercase:");
		}
		else
			{
			     System.out.println("uppercase:");
			}
	}
}
