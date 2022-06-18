import java.util.Scanner;
class Maximumof3
{    
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println("a is maximum:");
		}
		else 

			  if(b>c)
		       {
			       System.out.println("b is maximum:");
		       }
		      else
		       {
			        System.out.println("c is maximum:");
		       }
	 }
}