import java.util.Scanner;
class CountEven_Odd
{
	public static void main(String[] args)
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the system");
		size=sc.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int count1=0,count2=0;
		for(i=0;i<size;i++)
		{   
			if(a[i]%2==0)
			{
				count1++;
			}
			
			else
			{
				count2++;
			}
		}
	   System.out.println("even:" +count1);
	   System.out.println("odd:" +count2);
			
		
	}
			
}