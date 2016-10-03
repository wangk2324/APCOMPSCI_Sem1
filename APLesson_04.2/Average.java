import java.util.Scanner;

public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner nums = new Scanner(System.in);

		System.out.println("What is the first number?");
		num1 = nums.nextInt();
		
		System.out.println("What is the second number?");
		num2 = nums.nextInt();
		
		System.out.println("What is the third number?");
		num3 = nums.nextInt();
		
		average();
		print();
	}
	
	public static void average()
	{
		avg = (num1 + num2 + num3)/3;
	}
	
	public static void print()
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %10.5f", avg);
	}
}