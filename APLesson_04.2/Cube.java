import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner sidein = new Scanner(System.in);
		
		System.out.println("What is the side length of the cube?");
		side = sidein.nextInt();
		
		surfacearea();
		print();
	}
	
	public static double surfacearea()
	{
		return sa = 6*Math.pow(side,2);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with side lengths " + side + " is %10.5f", sa);
	}
}