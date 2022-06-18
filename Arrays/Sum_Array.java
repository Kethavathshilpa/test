import java.util.Scanner;
class Sum_Array
{
	public static void main(String[] args)
	{
		int i,size,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		size =sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array:" +sum);
	}
}