import java.util.Scanner;
class NumberPattern_48
{
	public static void main(String[] args)
	{
	   int i,n,j,k;
	   Scanner input=new Scanner(System.in);
	   System.out.println("enter the n values:");
	   n=input.nextInt();
	   for(i=1;i<=n;i++)
		{
		   for(j=1;j<=i;j++)
			{
			   System.out.print(j);
			}

		    for(k=1; k<=n-i; k++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}