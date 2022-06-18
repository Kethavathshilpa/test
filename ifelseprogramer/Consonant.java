import java.util.Scanner;
class Consonant
{
	public static void main(String[] args)
	{
		int ch;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the character:");
		ch=input.next().charAt(0);
		if((ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
			 System.out.println("vowels:");
		}
		else
		{
			 System.out.println("consonant:");
		}
	}

}