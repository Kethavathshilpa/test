import java.util.Scanner;
class LeftArrow
{
	public static void main(String[] args)
	{
		int n,i,k,j,count=5;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1; i<=2*n-1; i++)
		{
			for(k=1; k<=count; k++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=count;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			count=i<n? count-1:count+1;
		}
	}

}