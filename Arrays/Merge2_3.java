import java.util.Scanner;
class Merge2_3
{
	public static void main(String[] args)
	{
		int i,index,size1,size2;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size:");
		size1=input.nextInt();
		size2=input.nextInt();
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		int arr3[]=new int[arr1.length+arr2.length];

		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=input.nextInt();
		}
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=input.nextInt();
		}
		
		//output
		System.out.println("merging the arr1 and arr2");
		for(i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		index=arr2.length;
		for(i=0;i<arr2.length;i++)
		{
			arr3[index]=arr2[i];
			index=index+1;
		}
		for(i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}
		
}