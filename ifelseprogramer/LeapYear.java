import java.util.Scanner;
class Leapyear
{
	public static void main(String[] args)
	{
		int year;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		year=input.nextInt();
		if(year%4==0|| year%400==0 && year%100!=0)
		{
			System.out.println("leapyear:");
		}
		else
		{
			System.out.println("not leapyear:");
		}
	}
}