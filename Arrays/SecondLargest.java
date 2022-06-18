import java.util.Scanner;
class SecondLargest
{
	public static void main(String[] args)
	{
		int max1,max2;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=input.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=scr.nextInt();
		}
		for(i=0;i<size;i++)
		{
		    if(arr[0]>arr[1]);
		      {
			     max1=arr[0];
			     max2=arr[1];
		      }
		    else
		     {
			     max1=arr[1];
			     max2=arr[0];
		     }
		
		  for(i=2; i<arr.length;  i++)
		   {
			  if(arr[i]>max1)
			   {
			      max2=max1;
			      max1=arr[i];
		       }
	          else if(arr[i]>max2 && arr[i]<max1)
		      {
			      max2=arr[i];
		      }
		   }
		}
		  System.out.println(max1);
		  System.out.println(max2);
	}

}