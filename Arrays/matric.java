import java.util.Scanner;
class matric 
{
	public static void main(String[] args) 
	{
		int row,col,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the n values:");
		row=input.nextInt();
		col=input.nextInt();
		int[][] num=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				num[i][j]=input.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
				
	}
}
