import java.util.Scanner;
class CountDigits
{
	public static void main(String[] args)
	{
		int n,r,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the digits:");
		n=input.nextInt();
		for( ; n>0; n=n/10)
		{
			r=n%10;
			count++;
		}
		System.out.println(count);
	}

}