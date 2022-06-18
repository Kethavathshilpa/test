import java.util.Scanner;
class PowerNumber
{
	public static void main(String[] args)
	{
		int pow,base,res=1,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		base=input.nextInt();
		pow=input.nextInt();
		for(i=1;i<=pow;i++)
		{
			res=res*base;
		}
		System.out.println("result:" +res);
	}
}