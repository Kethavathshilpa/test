import java.util.Scanner;
class NumberPattern_42
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=2;i<=2*n;i+=2)
		{
			for(j=2;j<i;j+=2)
			{
				System.out.print(j);
			}
			for(j=i;j>=2;j-=2)
			{
			   System.out.print(j);
			}
			System.out.println();
		}
	}
}