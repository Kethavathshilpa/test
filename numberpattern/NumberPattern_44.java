import java.util.Scanner;
class NumberPattern_44
{
	public static void main(String[] args)
	{
		int n,i,j,k=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
} 