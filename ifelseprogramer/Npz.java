import java.util.Scanner;
class Npz
{
	public static void main(String[] args)
	{
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values:");
		n=input.nextInt();
		if(n>0)
		{
			System.out.println("positive:");
		}
		else
			if(n<0)
		       {
			        System.out.println("negative:");
			   }
			   else
		       {
				    System.out.println("zero:");
		       }
	}
}

