import java.util.Scanner;
class Arthematics
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the numbers:");
		a=scr.nextInt();
		b=scr.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}