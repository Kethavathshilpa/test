import java.util.Scanner;
class DiamondStar
{
	public static void main(String[] args)
	{
		int n,i,j,k,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=2*n-1;i++)
		{
			count=(i<=n)?count+1:count-1;
			for(k=1; k<=n-count; k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*count-1;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}