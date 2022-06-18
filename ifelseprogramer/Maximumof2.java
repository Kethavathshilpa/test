import java.util.Scanner;
class Maximumof2 
{
	public static void main(String[] args) 
	{   
		int n1,n2;
		Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
		n1=input.nextInt();
		n2=input.nextInt();
		if(n1>n2)
		{
			   System.out.println("n1 is maximum:");
		}
		else
		{
			   System.out.println("n2 is maximum:");
		}
		
	}
}
