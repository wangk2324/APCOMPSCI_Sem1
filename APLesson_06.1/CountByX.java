import java.util.Scanner;

public class CountByX
{
	public static void main(String[]args)
	{
		Scanner numInputs = new Scanner(System.in);
		System.out.println("Please enter the number to count up to:");
		int cUp = numInputs.nextInt();
		System.out.println("Please enter the number to count up by:");
		int cBy = numInputs.nextInt();
		
		for (int i = cBy; i<= cUp; i += cBy)
		{
			System.out.println(i);
		}
	}
}