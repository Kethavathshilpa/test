import java.util.Scanner;
class NumberPattern_23 
{
	public static void main(String[] args) 
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=n; i>=n; i--)
		{
			for(j=n; j<=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
