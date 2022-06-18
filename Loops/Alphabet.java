import java.util.Scanner;
class Alphabet
{
	public static void main(String[] args)
	{
		char n,ch;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the alphabets:");
		n=input.next().charAt(0);
		for(ch='a'; ch<=n; ch++)
		{
			System.out.println(ch);
		}
	}
}