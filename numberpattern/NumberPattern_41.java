import java.util.Scanner;
class NumberPattern_41 
{
	public static void main(String[] args) 
	{
		int n,i,j;
		Scanner input=new Scanner(System.in); 
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i*2-1; j=j+2)
			{
				System.out.print(j);
			}
			for(j=(i-1)*2-1; j>=1;j=j-2)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
