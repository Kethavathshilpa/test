import java.util.Scanner;
class Triangle
{
	public static void main(String[] args)
	{
		int a,b,c,sum;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values:");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		sum=a+b+c;
		if(sum==180)
		{
			System.out.println("valid triangle:");
		}
		else
		{
			System.out.println("invalid triangle:");
		}
	}
}