import java.util.Scanner;
class Sum_FirstLast
{
	public static void main(String[] args)
	{
		int n,last,sum=0,r;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the digits:");
		n=input.nextInt();
		last=n%10;
		System.out.println("last digits:" +last);
		for( ;n>10;n=n/10){
		}
		System.out.println("first digits:" +n);
		sum = last+n;
        System.out.println("sum of digits:" +sum);
	}
}