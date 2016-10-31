import java.util.Scanner;

public class DigitAdder
{
	//static int num = inNum;
	static int sum = 0;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a number:");
		int inNum = kb.nextInt();
		
		System.out.println("The sum of the digits in " + inNum + " is " + sumDigits(inNum) + ".");
		
	}
	
	public static int sumDigits(int numero)
	{
		while (numero > 0)
		{
			sum += numero % 10;
			numero /= 10;
		}
		return sum;
	}
}