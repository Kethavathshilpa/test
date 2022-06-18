import java.util.Scanner;
class profi_Loss
{
	public static void main(String[] args)
	{
		int profit,loss,costprice,sellingprice;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the amount:");
		costprice=scr.nextInt();
		sellingprice=scr.nextInt();
		profit=sellingprice-costprice;
		System.out.println("profit:" +profit);
		//loss=costprice-sellingprice;
		//System.out.println("loss:" +loss);
	}

}