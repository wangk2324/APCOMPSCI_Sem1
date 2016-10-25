import java.util.Scanner;

public class Factorial
{	
	public static void main(String[]args)
	{
		Scanner kbinput = new Scanner(System.in);
		System.out.println("Please input an integer:");
		int factorialNum = kbinput.nextInt();
		System.out.println(calcFactorial(factorialNum));
	}
	public static int calcFactorial(int factorialNum)
	{
		int f = 1;
		for (int i = 1; i <= factorialNum; i++)
		{
			f = f * i;
		}
		return f;
	}
}