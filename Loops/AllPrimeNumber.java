import java.util.Scanner;
class AllPrimeNumber
{
	public static void main(String[] args)
	{
		int n,i,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		//n=input.nextInt();
		n=100;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
			if(count<=2)
			{
				System.out.println(i);
			}
	
	}
}