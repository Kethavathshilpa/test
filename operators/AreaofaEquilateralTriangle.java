import java.util.Scanner;
import java.lang.Math;
class AreaofaEquilateralTriangle
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		double side=scr.nextDouble();
		double area=(Math.sqrt(3)/4)*(side*side);
		System.out.println("area of a equilateral triangle:" +area);
	}

}