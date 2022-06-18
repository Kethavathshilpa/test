import java.util.Scanner;
import java.lang.Math;
class SquareRoot
{
	public static void main(String[] args)
	{
		double num,square;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		num=scr.nextDouble();
		square=Math.sqrt(num);
		System.out.println("square of a number:" +square);
	}
}