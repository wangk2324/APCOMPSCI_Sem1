import java.util.Scanner;
public class Circle
	{
		static double radius;
		static double area;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("What is the radius of the circle?");
			radius = inputs.nextDouble();
			
			print(calcArea(radius));
		}
		
		public static double calcArea(double r)
		{
			return 3.14159 * r * r;
		}
		
		public static void print(double area)
		{
			System.out.printf("The area of a circle with a radius of " + radius + " is %5.5f", area);
		}
	}