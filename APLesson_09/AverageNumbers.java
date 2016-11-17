import java.util.Scanner;

public class AverageNumbers
{	
	static int average = 0;
	static int sum = 0;
	
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)((Math.random()*101));
		}
		System.out.println("Numbers:");
		
		for (int number: numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println("");
		
		for (int num : numbers)
		{
			sum += num;
		}
		System.out.println("The average of the above numbers is: " + (sum/numbers.length));
	}	
}