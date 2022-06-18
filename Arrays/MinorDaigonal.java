import java.util.Scanner;
class MinorDaigonal
{
	public static void main(String[] args)
	{
		int i,j,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the rows and column:");
		int row=input.nextInt();
		int col=input.nextInt();
		int a[][]=new int[row][col];
           //input******************************
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=input.nextInt();
			}
			System.out.println();
		}
		System.out.println();
      //output*******************************
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();
      // result***************************
		for(i=0;i<row;i++)
		for(j=0;j<col;j++)
			{
				if(i+j==row-1)
				sum=sum+a[i][j];
			}
			System.out.println("sum of the main diagonal:" +sum);
		}
}



