import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[]args)
	{
		int n,p,i,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		p=n;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==p)
			{
				System.out.println("perfect number:");
			}
			else
			{
				System.out.println("not a perfect number:");
			}
		
	}
}