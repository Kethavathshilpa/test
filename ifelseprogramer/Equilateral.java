import java.util.Scanner;
class Equilateral
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values:");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if((a==b)&& (b==c))
		{
			System.out.println("equillateral triangle:");
		}
		else 
			if((a==b)&&(b!=c))
		{
			System.out.println("isosceles triangle:");
		}
		else 
		{
			System.out.println("scalene triangle:");
		}
	}
}