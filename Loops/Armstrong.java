import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		int n,i,r,res,sum=0,p;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		 p=n;
		for( ;n>0;n=n/10)
		{
			r=n%10;
			res=r*r*r;
			sum=sum+res;
		}
		if(p==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not a Armstrong:");
		}
	}

}