import java.util.Scanner;

public class ReverseNumber
{	
	static int rev = 0;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a number:");
		int inNum = kb.nextInt();
		
		System.out.println("The reverse of " + inNum + " is " + getReverse(inNum) + ".");
	}
	
	public static int getReverse(int number)
	{
		while (number > 0)
		{
			rev *= 10;
			rev += number % 10;
			number /= 10;
		}
		return (rev);
	}
}