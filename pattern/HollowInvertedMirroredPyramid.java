import java.util.Scanner;
class HollowInvertedMirroredPyramid
{
	public static void main(String[] args)
	{
	int n,i,j,k;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the n values:");
	n=input.nextInt();
	for(i=n; i>=1; i--)
		{
		for(k=1; k<=n-i; k++)
			{
			   System.out.print("  ");
			}
		for(j=1; j<=(2*i-1); j++)
		  {
			if(i==n||j==1||j==(2*i-1))
				{
				    System.out.print(" * ");
				}
			else
				{
					System.out.println("  ");
				}
			}
         System.out.println();
      }
	}
}