 import java.util.Scanner;
 class Leapyear
{
	public static void main(String[] args) 
	{  
		int year;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the years:");
		year=scr.nextInt();
		if(year%400==0)
		{
			System.out.println("leapyear:");
		}
		else 
			if(year%4==0&&year%100!=0)
			{
                 System.out.println("leapyear:");
			}
			else 
		   {
				System.out.println("not a leapyear:");
		   }
	}
}
