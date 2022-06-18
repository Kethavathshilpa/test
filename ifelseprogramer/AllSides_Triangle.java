import java.util.Scanner;
class AllSides_Triangle
{
	public static void main(String[] args)
	{
		int s1,s2,s3;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the side:");
		s1=input.nextInt();
		s2=input.nextInt();
		s3=input.nextInt();
		if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
		{
			System.out.println("valid triangle:");
		}
		else
		{
			System.out.println("invalid triangle:");
		}
	}
}