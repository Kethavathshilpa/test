import java.util.Scanner;
class RhombusStar
{
	public static void main(String[] args)
	{
		int n,j,i,k;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the system:");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			  {
				 System.out.print(" ");
			  }
		    for(j=1;j<=n;j++)
			 {
				 System.out.print("*");
			 }
		    System.out.println( );
		}
		
	}
}