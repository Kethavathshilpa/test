import java.util.Scanner;
class GrossSalary
{
	public static void main(String[] args)
	{
		double hra=0,da=0,basic,gross;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the basic salary:");
		basic=input.nextDouble();
		if(basic<=10000)
		{
			hra = basic*0.2;
			da= basic*0.8;
		}
		else if(basic<=20000)
		{
			hra=basic*0.25;
			da=basic*0.90;
		}
		else if(basic>20000)
		{
			hra=basic*0.30;
			da=basic*0.95;
		}
		gross=basic+hra+da;
		System.out.println("gross salary:" +gross );
	}
}