import java.util.Scanner;
class Sum_Digits
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the digits:");
		n=input.nextInt();
		for( ;n>0;n=n/10)
		{
			sum=sum+n%10;
		}
		System.out.println("sum of digits:" +sum);
	}
}