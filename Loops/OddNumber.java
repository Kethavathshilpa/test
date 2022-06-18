import java.util.Scanner;
class OddNumber
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}