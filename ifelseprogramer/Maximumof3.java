import java.util.Scanner;
class Maximumof3
{
	public static void main(String[] args)
	{
		int n1,n2,n3;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the numbers:");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("n1 is maximum:");
		}
		else
			if(n2>n3)
		      {
			        System.out.println("n2 is maximum:");
			  }
			  else
		      {
				  System.out.println("n3 is maximum:");
			  }
	}
}