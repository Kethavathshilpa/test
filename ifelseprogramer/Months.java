import java.util.Scanner;
class Months
{
	public static void main(String[] args)
	{
		int month;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values:");
		month=input.nextInt();
		if(month==1)
		{
			System.out.println("31days:");
		}
		else if(month==2)
		{
			System.out.println("28days:");
		}
		else if(month==3)
		{
			System.out.println("31days:");
		}
		else if(month==4)
		{
			System.out.println("30days:");
		}
		else if(month==5)
		{
			System.out.println("31days:");
		}
		else if(month==6)
		{
			System.out.println("30days:");
		}
		else if(month==7)
		{
			System.out.println("31days:");
		}
		else if(month==8)
		{
			System.out.println("31days:");
		}
		else if(month==9)
		{
			System.out.println("30days:");
		}
		else if(month==10)
		{
			System.out.println("31days");
		}
		else if(month==11)
		{
			System.out.println("30days");
		}
		else if(month==12)
		{
			System.out.println("31days");
		}
		else 
		{
			System.out.println("invalid");
		}
	}
}