import java.util.Scanner;
class Aladigspe
{    
	
	public static void main(String[] args)
	{
		int ch;
	   Scanner input=new Scanner(System.in);
	   System.out.println("enter the character:");
	   ch=input.next().charAt(0);
	   if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
	      {
		      System.out.println("alphabet");
	      }
	   else
		 if(ch>='0' && ch<='9')
	     {
		      System.out.println("digits");
	     }
	   else
	    {
		     System.out.println("special character:");
	    }
   }
}