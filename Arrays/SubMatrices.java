import java.util.Scanner;
class SubMatrices 
{
	public static void main(String[] args) 
	{ 
		int i,j,sum=0,r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows1 and column1:");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("enter rows2 and column2:");
		r2=sc.nextInt();
		c2=sc.nextInt();
		int n1[][]=new int[r1][c1];
		int n2[][]=new int[r2][c2];
		//input
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				n1[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				n2[i][j]=sc.nextInt();
			}
		}
		//output
		System.out.println();
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(n1[i][j] +" ");
			}
		
           System.out.println();
		}
		System.out.println();

		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
			    System.out.print(n2[i][j] +" ");
			}
		System.out.println();
		}
		System.out.println();

		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				sum=n1[i][j]-n2[i][j];
				System.out.print(sum +" ");
			}
			System.out.println();
		}
		
	}
}
