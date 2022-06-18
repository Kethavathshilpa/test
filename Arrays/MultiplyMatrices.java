import java.util.Scanner;
class MultiplyMatrices  
{
	public static void main(String[] args) 
	{
		int i,j,k;
		Scanner input=new Scanner(System.in);
		System.out.println("enter rows and columns:");
		int row=input.nextInt();
		int col=input.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=input.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				b[i][j]=input.nextInt();
			}
		}
		//output
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();

		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();

		for(i=0;i<row;i++)
		for(j=0;j<col;j++)
		{
			c[i][j]=0;
			for(k=0;k<row;k++)
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		}

		System.out.println("multiply matrices:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}
	  }
}
