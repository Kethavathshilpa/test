import java.util.Scanner;
class Pyramid
{
	public static void main(String[] args)
	{
		int n,i,k,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n value:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}