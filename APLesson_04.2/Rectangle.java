import java.util.Scanner;

public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner inpts = new Scanner(System.in);
		
		System.out.println("Please enter a rectangle length:");
		length = inpts.nextInt();
		inpts.nextLine();
		
		System.out.println("Please enter a rectangle width:");
		width = inpts.nextInt();
		inpts.nextLine();
		
		calcPerim();
		print();
	}
	
	public static double calcPerim()
	{
		return perimeter = 2 * length + 2 * width;
	}
	
	public static void print()
	{
		System.out.printf("The perimeter is %10.5f", perimeter);
	}
} 