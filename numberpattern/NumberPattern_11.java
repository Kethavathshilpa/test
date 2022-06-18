import java.util.Scanner;
class NumberPattern_11 
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
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
