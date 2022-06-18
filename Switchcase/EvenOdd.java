import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{   
		int n;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number:");
		n=scr.nextInt();
		switch(n%2)
		{
			case 0:
				System.out.println("even");
			     break;
            case 1:
				System.out.println("odd");
			    break;
		}
	}
}
