import java.util.Scanner;
class LowerTriangularMatrices
{
	public static void main(String[] args)
	{
	   int row,col,i,j,flag=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter rows and column:");
	   row =sc.nextInt();
	   col=sc.nextInt();
       int a[][]=new int[row][col];
	   for(i=0;i<row;i++)
		{
		   for(j=0;j<col;j++)
			{
			   a[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for(i=0;i<row;i++)

			for(j=0;j<col;j++)
		{
				if(i<j&&a[i][j]!=0)
					flag=1;
		}
		if(flag==0)
		{
			System.out.println("lower triangular matrices:");
		}
		else
		{
			System.out.println("not a lower triangular matrices:");
		}
	}

}