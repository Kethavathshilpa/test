import java.util.Scanner;
class HalfDiamond 
{
	public static void main(String[] args) 
	{
		int n,i,j,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=2*n-1;i++)
		{
			count=(i<=n)?count+1:count-1;
			for(j=1;j<=count;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
