import java.util.Scanner;
class Npz
{
	public static void main(String[] args)
	{
		int n;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number:");
		n = scr.nextInt();
		switch(n>0)
		{
			case 1:
			System.out.println("positive");
			break;
       switch(n<0)
			{
		     case 1:
				 System.out.println("negative:");
			     break;
			 case 0: 
				 System.out.println("zero");
			     break;
			}
		}
	}

}