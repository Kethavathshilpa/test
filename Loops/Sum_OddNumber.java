import java.util.Scanner;
class Sum_OddNumber
{
	public static void main(String[] args)
	{
		int n,i,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the numbers:");
		n=input.nextInt();
		for(i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		 System.out.println(sum);
		
	}
}