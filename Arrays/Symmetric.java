import java.util.Scanner;
class Symmetric
{
	public static void main(String[] args)
	{
		int i,j,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and column:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		/* display
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}*/
		//transpose
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.println();
	   for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		 System.out.println();

        //check symmetric or not
        for(i=0; i<row; i++)
		for(j=0;j<col;j++)
			{
			  if(a[i][j]!=b[i][j]);
			   flag=1;
			}
			if(flag==0)
		     {
				  System.out.println("it is Symmetric matrices:");
			 }
			 else
		     {
				 System.out.println("it is not a symmetric matrices:");
			 }
	}
}


		
		