import java.util.Scanner;
class Unique
{
	public static void main(String[] args)
	{
		int size,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size:");
		size=input.nextInt();
		int arr[]=new int[size];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			int count=0;
			for(j=0; i<arr.length; i++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
			   System.out.println(count);
			
		}
	}
}