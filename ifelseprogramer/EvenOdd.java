import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the numbers:");
		n=input.nextInt();
		if(n%2==0)
		{
			System.out.println("even:");
		}
		else
		{
			System.out.println("odd:");
		}
	}
}