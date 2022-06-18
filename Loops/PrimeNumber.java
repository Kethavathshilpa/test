import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		int i,n,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the Number:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
			if(count<=2)
			{
				System.out.println("Prime Number:");
			}
			else
			{
				System.out.println("not a Prime Number:");
			}
		
	}

}