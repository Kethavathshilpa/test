import java.util.Scanner;
class PlusPattern
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1; j<=n; j++)
			{
				if(i==n-j||j==n-i)
				{
					System.out.println("*");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}