import java.util.Scanner;
class CopyArrays
{
	public static void main(String[] args)
	{ 
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		size=sc.nextInt();
		int a1[]=new int[size];
		int a2[]=new int[a1.length];
		for(i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		//for(i=0;i<a2.length;i++)
		//{
			//a2[i]=sc.nextInt();
		//}
	   System.out.println();

	   for(i=0; i<a1.length; i++)
		{
			a2[i]=a1[i];
		}
		for(i=0;i<a1.length;i++)
		{
		    System.out.print(a1[i] );
		}
		System.out.println();
		for(i=0;i<a2.length;i++)
		{
			System.out.print(a2[i] );
		}
		System.out.println();
		
		
	}

}