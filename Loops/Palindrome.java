import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		int p,rev,res=0,n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		p=n;
		while(n>0)
		{
			rev=n%10;
			res=res*10+rev;
			n=n/10;
		}
		if(p==res)
		{
			 System.out.println("palindrome:");
		}
		else
		{
			System.out.println("not Palindrome:");
		}
	}
}