import java.util.Scanner;
class CelsiustoFahrenheit
{
	public static void main(String[] args)
	{
		int fahrenheit,celsius;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the values:");
		celsius=scr.nextInt();
		fahrenheit = scr.nextInt();

		fahrenheit=(celsius*9/5)+32;
		System.out.println("celsius to fahrenheit:" +fahrenheit);
		celsius=((fahrenheit-32)*5)/9;
		System.out.println("fahrenheit to celsius:" +celsius);
	}

}