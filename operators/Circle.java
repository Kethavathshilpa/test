import java.util.Scanner;
class Circle
{
	public static void main(String[] args)
	{
		int radius,diameter,circumference,area;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the radius:");
		radius=scr.nextInt();
		diameter=2*radius;
		circumference=2*22/7*radius;
		area=22/7*radius*radius;
		System.out.println("diameter of a circle:" +diameter);
		System.out.println("circumference of a circle:" +circumference);
		System.out.println("area of a circle:" +area);
	}
}