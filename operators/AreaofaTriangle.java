import java.util.Scanner;
class AreaofaTriangle
{
	public static void main(String[] args)
	{
		int base,height,area;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the values:");
		base=scr.nextInt();
		height=scr.nextInt();
		area=(base*height)/2;
		System.out.println("arae:" +area);
	}

}