import java.util.Scanner;
class StarSquare 
{
	public static void main(String[] args) 
	{  
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("*");
			}
		    System.out.println();
		}
	}
}
