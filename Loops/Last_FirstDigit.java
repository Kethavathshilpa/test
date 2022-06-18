import java.util.Scanner;
class Last_FirstDigit

{
	public static void main(String[] args) 
	{
        int n,last;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the digits:");
		n=input.nextInt();
		last=n%10;
		System.out.println("last digits:" +last);
		for( ;n>10;  )
		{
			n=n/10;
		}
		System.out.println("first digits:" +n);
	}
}
