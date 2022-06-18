import java.util.Scanner;
class EvenNumber
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=scr.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}