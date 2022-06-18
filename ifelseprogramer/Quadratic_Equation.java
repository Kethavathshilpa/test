import java.util.Scanner;
class Quadratic_Equation 
{
	public static void main(String[] args) 
	{
		float a,b,c,discriminant;
		float x1,x2,imaginary;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the values:");
		a=input.nextFloat();
		b=input.nextFloat();
		c=input.nextFloat();
		discriminant=(b*b)-(4*a*c);
		if(discriminant>0)
		 {
			 x1=(-b+sqrt(discriminant));
			 x2=(-b-sqrt(discriminant));
			 System.out.println("two distinct and real roots:");
		 }
		else if(discriminant==0)
		 {
			  x1=x2=-b/(2*a);
			  System.out.println("two equal and reals exists:");
         }
		 else if(discriminant<0)
		{
			 x1=x2=-b/(2*a);
			 imaginary=sqrt(-discriminant);
			 System.out.println("two distinct complext roots:");
		}

	}
}
