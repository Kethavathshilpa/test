import java.util.Scanner;
class Eight_Pattern
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=2*n-1;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((i==1 && j==1)||(i==1 && j==n)||(i==n && j==1)||(i==n && j==n)||(i==2*n-1 && j==1)||(i==2*n-1 && j==n))
				{
					System.out.print("  ");
				}
				else
					if(i==1||j==1||i==n||j==n||i==2*n-1)
					{
						System.out.print("*");
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