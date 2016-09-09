import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner circle = new Scanner(System.in);
		
		System.out.println("What is the radius of your circle?");
		double radius = circle.nextInt();
		double cArea = (3.14159265359 * (radius * radius));
		
		System.out.println("The area of the circle is " + cArea + ".");
		
		
	}
}