import java.util.Scanner;
class Sum_NaturalNumber
{
	public static void main(String[] args)
	{
		int n,i,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum:" +sum);
		
	}
}