import java.util.Scanner;
class NegativeElements
{
	public static void main(String[] args)
	{
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("negative NUmbers");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
		        System.out.println(arr[i]);
			}
		}
	}

}