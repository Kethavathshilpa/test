import java.util.Scanner;
class HollowMirroredRhombusStar
{
	public static void main(String[] args)
	{
		int n,i,j,k;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=scr.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
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