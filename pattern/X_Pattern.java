import java.util.Scanner;
class X_Pattern
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==j||i+j==n+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			 }
		     System.out.println();
		}
	}
}