import java.util.Scanner;
class FiveSubjectMarks
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the 5 subjects marks:");
		int telugu=scr.nextInt();
		int hindi=scr.nextInt();
		int english=scr.nextInt();
		int maths=scr.nextInt();
		int social=scr.nextInt();
		int total=telugu+hindi+english+maths+social;
		System.out.println("total:" +total);
		int average=total/5;
		System.out.println("average:" +average);
					
		float percentage = (total/500) * 100;
		System.out.println("percentage:" +percentage);
	}

}