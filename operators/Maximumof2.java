import java.util.Scanner;
class Maximumof2 
{
	public static void main(String[] args) 
	{ 
		int a,b,max;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		a=scr.nextInt();
		b=scr.nextInt();
		if(a>b)
		{
	          System.out.println("a is maximum:");
		}
		else
		{
			  System.out.println("b is maximum:");
		}
	}
}
