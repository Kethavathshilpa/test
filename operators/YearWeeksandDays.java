import java.util.Scanner;
class YearWeeksandDays
{
	public static void main(String[] args)
	{
		int year,weeks,days,n;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the no.of days:");
		n=scr.nextInt();
		year=n/365;
		weeks=(n%365)/7;
		days=(n%365)%7;
		System.out.println("years:" +year);
		System.out.println("weeks:" +weeks);
		System.out.println("days:" +days);
	}

}