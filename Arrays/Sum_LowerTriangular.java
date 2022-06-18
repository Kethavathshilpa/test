import java.util.Scanner;
class Sum_LowerTriangular
{
	public static void main(String[] args)
	{
	   int row,col,i,j,sum=0;
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
					if(i>j)
			    {
						sum=sum+a[i][j];
			    }
		}
				System.out.println("sum of Lower triangular:" +sum);
		
		
	}

}