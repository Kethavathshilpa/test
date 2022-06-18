import java.util.Scanner;
class EvenandOdd
{
	public static void main(String[] args)
	{
		int num;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		num=scr.nextInt();
		if(num%2==0)
		{
			 System.out.println("prime number:");
		}
		else 
		{
			 System.out.println("odd number:");
		}
	}
}