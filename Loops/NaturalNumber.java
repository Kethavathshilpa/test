import java.util.Scanner;
class NaturalNumber 
{
	public static void main(String[] args) 
	{   
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1; i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
