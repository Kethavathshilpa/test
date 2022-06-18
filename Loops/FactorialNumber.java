import java.util.Scanner;
class FactorialNumber
{
	public static void main(String[] args)
	{
		int n,i,res=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		for(i=n; i>=1; i--)
		{
			res=res*i;
		}
		System.out.println("result:" +res);
	}

}