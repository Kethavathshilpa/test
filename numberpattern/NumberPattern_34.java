import java.util.Scanner;
class NumberPattern_34
{
	public static void main(String[] args) 
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1; i<=2*n-1; i=i+2)
		{
			for(j=i; j<2*n; j=j+2)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
