import java.util.Scanner;
class NumberPattern_39
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n vlaues:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(i*2-1);j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}