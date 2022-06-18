import java.util.Scanner;
class PrintElements 
{
	public static void main(String[] args) 
	{
		int size,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size");
		size=input.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
		   a[i]=input.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
