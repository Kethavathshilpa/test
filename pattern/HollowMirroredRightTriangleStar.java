import java.util.Scanner;
class HollowMirroredRightTriangleStar
{
	public static void main(String[] args)
	{
		int n,i,j,k;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
		      System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i==j||i==n||j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}