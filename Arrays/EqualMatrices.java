import java.util.Scanner;
class EqualMatrices
{
	public static void main(String[] args)
	{
		int row,col,flag=0,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the row1 and column1:");
	    row=input.nextInt();
		col=input.nextInt();
		int n1[][]=new int[row][col];
		int n2[][]=new int[row][col];
		//input
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				n1[i][j]=input.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				n2[i][j]=input.nextInt();
            }
		}
		//output
		for(i=0;i<row;i++)
		  {
		   for(j=0;j<col;j++)
			  {
			  
			  System.out.print(n1[i][j] +" ");
			  }
			  System.out.println();
		  }
		  System.out.println();
		  for(i=0;i<row;i++)
		  {
		   for(j=0;j<col;j++)
			  {
			  
			  System.out.print(n2[i][j] +" ");
			  }
			  System.out.println();
		  }
		  System.out.println();

		  for(i=0;i<row;i++)
			  for(j=0;j<col;j++)
			{
				  if(n1[i][j]!=n2[i][j])
					  flag=1;
			}
			if(flag==0)
			{
				System.out.println("two matrix are equal:");
			}
			else
			{
				System.out.println("two matrix are not equal:");
			}
		
	}
}

