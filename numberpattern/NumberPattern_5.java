import java.util.Scanner;
class NumberPattern_5
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
				if(i==n-2&&j==n-2)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
		    System.out.println();
		}
	}

}