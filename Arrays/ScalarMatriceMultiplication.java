import java.util.Scanner;
class ScalarMatriceMultiplication
{
	public static void main(String[] args)
	{
		int n,i,j,scalar,rows,col,A;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and column:");
		rows=sc.nextInt();
		col=sc.nextInt();
		System.out.println("enter the scalar number:");
		n=sc.nextInt();
		int [][] a=new int[rows][col];
		for(i=0;i<rows;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println();

		for(i=0;i<rows;i++)
		{
			for(j=0;j<col;j++)
			{
				scalar = n*a[i][j];
				System.out.print(scalar +" ");
			}
			System.out.println();
		}
	}

}