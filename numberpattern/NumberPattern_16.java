import java.util.Scanner;
class NumberPattern_16
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}