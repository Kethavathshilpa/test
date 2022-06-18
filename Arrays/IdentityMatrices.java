import java.util.Scanner;
class IdentityMatrices
{
	public static void main(String[] args) 
	{
		int i,j,row,col,flag=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the row and column:");
		row=input.nextInt();
		col=input.nextInt();
		int a[][] =new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
			  a[i][j]=input.nextInt();
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

		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
		{
			if(i==j&&a[i][j]!=1)
			   flag=1;
			
		}
		if(flag==0)
		{
			System.out.println("identity matrices:");
		}
		else
		{
			System.out.println("not a identity matrices:");
		}
	 

	}
}
