import java.util.Scanner;
class Triangleofa_3rdAngle
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		a=scr.nextInt();
		b=scr.nextInt();
		c=180-(a+b);
		System.out.println(c);
		
	}
}