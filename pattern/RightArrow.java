import java.util.Scanner;
class RightArrow
{
	public static void main(String[] args) 
	{
		int n,j,i,k,count=5;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1; i<=2*n-1; i++)
		{
			for(k=1; k<=(n-count)*2; k++)
			{
				System.out.print("  ");
			}
			for(j=1; j<=count; j++)
			{
				System.out.print("*");
			}
		 count=(i<n)?count-1:count+1;
		 System.out.println();
		}

	}
}
