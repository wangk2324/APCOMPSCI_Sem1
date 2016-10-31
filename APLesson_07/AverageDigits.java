import java.util.Scanner;

public class AverageDigits
{
	static double digits = 0.0;
	static double sum = 0.0;
	//static double average = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a number:");
		int inNum = kb.nextInt();
		
		System.out.println("The average of the digits in " + inNum + " is " + avDigits(inNum) + ".");
	}
	
	public static double avDigits(int number)
	{
		while (number > 0.0)
		{
			digits += 1;
			sum += number % 10;
			number /= 10;
		}
		
		return (sum/digits);
	}
}