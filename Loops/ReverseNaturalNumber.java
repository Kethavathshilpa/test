import java.util.Scanner;
class ReverseNaturalNumber
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}