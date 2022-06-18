import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number:");
		int principal=scr.nextInt();
		int time=scr.nextInt();
		int rate=scr.nextInt();
		int SI=(principal*time*rate)/100;
		System.out.println("simple interest:" +SI);
		int total= SI+principal;
		System.out.println("total:" +total);
	}
}