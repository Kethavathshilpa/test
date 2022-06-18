import java.util.Scanner;
class InvertedMirroredRightTriangle
{
	public static void main(String[] args)
	{
		int n,i,j,k;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=n;i>=1;i--)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print("*");
			}
	   	System.out.println();
		}
	}

}