import java.util.Scanner;
class Weeks
{
	public static void main(String[] args)
	{
		int weeks;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the numbers:");
		weeks=input.nextInt();
		if(weeks==1)
		{
			System.out.println("monday:");
		}
		else if(weeks==2)
		{
			System.out.println("tuesday:");
		}
		else if(weeks==3)
		{
			System.out.println("wednesday:");
		}
		else if(weeks==4)
		{
			System.out.println("thursday:");
		}
		else if(weeks==5)
		{
			System.out.println("friday:");
		}
		else if(weeks==6)
		{
			System.out.println("saturday:");
		}
		else if(weeks==7)
		{
			System.out.println("sunday:");
		}
		else 
		{
			 System.out.println("invalid:");
		}
	}
}
