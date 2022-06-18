import java.util.Scanner;
class Product_Digits
{
	public static void main(String[] args)
	{
		int n,product=1,r;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		for( ;n>0;n=n/10)
		{   
			r=n%10;
		    product=product*r;
		}
		System.out.println("product of the Digits:" +product);
		
	}

}