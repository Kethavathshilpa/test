import java.util.Scanner;
class Array_MaxMin
{
	public static void main(String[] args)
	{
		int size,i,max,min,index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size :");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("maximum of array:");
		  max=arr[0];
		 for(i=0;i<size;i++)
		{
			 if(arr[i]>max)
			{
				 max=arr[i];
				  index=i;
			}
		}
		System.out.println("max:" +max);
		System.out.println("index:" +index);
		System.out.println("minimum of array:");
		 
		 min=arr[0];
		 for(i=0;i<size;i++)
		{
			 if(arr[i]<min)
			{
				 min=arr[i];
				 index=i;
			}
		}
		System.out.println("min:" +min);
		System.out.println("index:" +index);
	}
}