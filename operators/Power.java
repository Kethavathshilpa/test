import java.util.Scanner;
import java.lang.Math;
class Power
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		double x=scr.nextDouble();
		double y=scr.nextDouble();
		double power=Math.pow(x,y);
		System.out.println(power);
	}
}