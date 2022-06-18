import java.util.Scanner;
class MirroredRhombusStar
{
	public static void main(String[] args)
	{
		int n,i,j,k;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=scr.nextInt();
		for(i=1; i<=n; i++)
		{
			for(k=1; k<i; k++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}