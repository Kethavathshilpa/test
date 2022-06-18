import java.util.Scanner;
class Frequency
{
	public static void main(String[] args)
	{
		int n,r,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count0=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the numbers:");
		n=input.nextInt();
		for( ;n>0;n=n/10)
		{
			r=n%10;
			if(r==1)
			{
				count1++;
			}
			else if(r==2)
			{
				count2++;
			}
            else if(r==3)
			{
				count3++;
			}
			else if(r==4)
			{
				count4++;
			}
			else if(r==5)
			{
				count5++;
			}
			else if(r==6)
			{
				count6++;
			}
			else if(r==7)
			{
				count7++;
			}
			else if(r==8)
			{
				count8++;
			}
		    else if(r==9)
			{
				count9++;
			}
			else if(r==0)
			{
				count0++;
			}
		}
		System.out.println("count1:" +count1);
		System.out.println("count2:" +count2);
		System.out.println("count3:" +count3);
		System.out.println("count4:" +count4);
		System.out.println("count5:" +count5);
		System.out.println("count6:" +count6);
		System.out.println("count7:" +count7);
		System.out.println("count8:" +count8);
		System.out.println("count9:" +count9);
		System.out.println("count0:" +count0);
			
	 }
}