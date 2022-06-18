import java.util.Scanner;
class TransposeMatrices
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and column:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	   for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		 System.out.println();

        for(i=0; i<row; i++)
		{
			for(j=0;j<col;j++)
			{
			  a[i][j]=a[j][i];
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();
   }
}