import java.util.Scanner;
class NumberPattern_46
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				for(j=i;j>=1;j--)
				{
					System.out.print(j);
				}
			else
				for(j=1;j<i+1;j++)
			   {
				System.out.print(j);
			   }
			 System.out.println();
		}
	}
			
}