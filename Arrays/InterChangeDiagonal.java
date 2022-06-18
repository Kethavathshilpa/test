
import java.util.Scanner;
class InterChangeDiagonal
{
	public static void main(String[] args)
	{
		int i,j,temp;
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
		
			{
				temp=a[i][i];
				a[i][i]=a[i][row-1-i];
				a[i][row-1-i]=temp;
			}
	      for(i=0;i<row;i++)
		 {
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		 }

		}
}



