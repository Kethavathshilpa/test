import java.util.Scanner;
class  RectangleArea
{
	public static void main(String[] args) 
	{  
		int length,breadth,area;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		length=scr.nextInt();
		breadth=scr.nextInt();
		area=length*breadth;
		System.out.println("area of a rectangle:" +area);
	}
}
