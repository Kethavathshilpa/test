import java.util.Scanner;
class ReverseDigits
{
	public static void main(String[] args)
	{
		int n,rev,res=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		while(n>0)
		{
			rev=n%10;
			res=res*10+rev;
			n=n/10;
		}
		System.out.println("reseverse:" +res);
	}
}