import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner radinp = new Scanner(System.in);
		System.out.println("Please input the radius of the circle:");
		r = radinp.nextInt();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (3.14159265359) * Math.pow(r, 2);
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %10.5f", area);
	}
}