import java.util.Scanner;
class NumberPattern_40
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
			for(j=2;j<=(i*2);j+=2)
			{
			    System.out.print(j);
			}
			else
			for(j=1;j<=(2*i-1);j+=2)
			{
			       System.out.print(j);
			}
			
			System.out.println();
		}
	}
}