import java.util.Scanner;
class Pattern_6
{
	public static void main(String[] args)
	{
		int n,i,j,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}

}