import java.util.Scanner;
class Factors
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			  System.out.println("factor " +i);
			}
		}
	}
}