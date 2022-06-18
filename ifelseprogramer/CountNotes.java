import java.util.Scanner;
class CountNotes
{
	public static void main(String[] args)
	{
		int n,amount;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the amount:");
		n=input.nextInt();
		amount=n/100;
		n=n%100;
		{
		    System.out.println("n:" +n);
		}
		amount=n/50;
		n=n%50;
		{
			System.out.println("n:"+n);
		}
		amount=n/20;
		n=n%20;
		{
			System.out.println("n:"+n);
		}
		amount=n/5;
		n=n%5;
		{
			System.out.println("n:"+n);
		}
	}
}