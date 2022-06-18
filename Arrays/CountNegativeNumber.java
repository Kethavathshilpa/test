import java.util.Scanner;
class CountNegativeNumber
{
	public static void main(String[] args)
	{
		int i,size,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}
		System.out.println("total negative number:" +count);
	}
}