import java.util.Scanner;
class NumberPattern_36
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
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