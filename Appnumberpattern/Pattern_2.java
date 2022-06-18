import java.util.Scanner;
class Pattern_2
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}