import java.util.Scanner;
class Divisible
{
	public static void main(String[] args)
	{
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values:");
		n=input.nextInt();
		if((n%5==0) && (n%11==0))
		 { 
			  System.out.println("it is divisible by 11 and 5:");
		 }

		else
		 {
			  System.out.println("it is not divisible by 11 and 5:");
		 }
	}
}