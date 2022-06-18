import java.util.Scanner;
class PerimeterofaRectangle
{
	public static void main(String[] args)
	{
		int length,breadth,perimeter;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number:");
		length=scr.nextInt();
		breadth=scr.nextInt();
		perimeter=2*(length+breadth);
		System.out.println("perimeter of a rectangle:" +perimeter);
	}
}