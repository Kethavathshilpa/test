import java.util.Scanner;
class Sum 
{
	public static void main(String[] args) 
	{   
		int a,b,sum;
		Scanner scr=new Scanner(System.in);
        System.out.println("enter the values:");
		a=scr.nextInt();
		b=scr.nextInt();
		sum=a+b;
		System.out.println(sum);
	}
}
