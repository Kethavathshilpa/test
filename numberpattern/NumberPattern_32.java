import java.util.Scanner;
class NumberPattern_32
{
	public static void main(String[] args)
	{
		int n,i,j,count=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=(i*2-1);j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}


}