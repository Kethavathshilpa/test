import java.util.Scanner;
class Multiplication
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1; i<=10; i++)
		{
			System.out.println(n + "*" + i + "=" +(n*i));
		}
	}
}