import java.util.Scanner;
class FiveSubjectMarks
{
	public static void main(String[] args)
	{
		int physics,chemistry,biology,maths,computer,total,per;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the 5subjects marks:");
		physics=scr.nextInt();
		chemistry=scr.nextInt();
		maths=scr.nextInt();
		biology=scr.nextInt();
		computer=scr.nextInt();
		total=physics+chemistry+maths+computer+biology;
		System.out.println("total:" +total);
		per=(total/5);
		System.out.println("per:" +per);
		if(per>=90)
		 {
			 System.out.println("grade A:");
		 }
		else if(per>=80)
		 {
			 System.out.println("grade B:");
		 }
		else if(per>=70)
		{
			System.out.println("grade C:");
		}
		else if(per>=60)
		{
			System.out.println("grade D:");
		}
		else if(per>=50)
		{
			System.out.println("grade E:");
		}
		else if(per<40)
		{
			System.out.println("grade F:");
		}
	}
}