import java.util.Scanner;
class NumberPattern_9
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
					System.out.print("0");
				}
				else
				{
					if(i==1||j==n||i==n||j==1)
				      {
					      System.out.print("1");
					  }
					  else
				       {
						  System.out.print("0");
				       }
				 }
			}
			System.out.println();
		}
	}
}

		

