import java.util.Scanner;
public class Average
	{
		static double num1;
		static double num2;
		static double num3;
		static double average;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("What is the first number?");
			num1 = inputs.nextDouble();
			System.out.println("What is the second number?");
			num2 = inputs.nextDouble();
			System.out.println("What is the third number?");
			num3 = inputs.nextDouble();
			
			print(calcAverage(num1, num2, num3));
		}
		
		public static double calcAverage(double n1, double n2, double n3)
		{
			return (n1 + n2 + n3)/3;
		}
		
		public static void print(double avg)
		{
			System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %5.5f", avg);
		}
	}