import java.util.Scanner;
class NumberPattern_14 
{
	public static void main(String[] args) 
	{
		int n,i,j,count=0,k;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
		  count=n;
		  for(k=1;k<=i-1;k++)
			{
			  System.out.print(count);
			  //count=count-1;
			}
			/*for(j=i; j<=n; j++)
			{
				System.out.print(count);
			}*/
			System.out.println();
		}
	}
}
