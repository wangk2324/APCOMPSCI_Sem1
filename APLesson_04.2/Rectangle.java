import java.util.Scanner;
public class Rectangle
	{
		static double length;
		static double width;
		static double perimeter;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("Please enter the length of the rectangle:");
			length = inputs.nextDouble();
			System.out.println("Please enter the width of the rectangle:");
			width = inputs.nextDouble();
			
			print(calcPerim(length, width));
		}
		
		public static double calcPerim(double l, double w)
		{
			return 2 * (l + w);
		}
		
		public static void print(double p)
		{
			System.out.printf("The perimeter of the rectangle is %5.5f", p);
		}
	}