import java.util.Scanner;
public class Cube
	{
		static double side;
		static double SA;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("What is the length of a side?");
			side = inputs.nextDouble();
			
			print(calcSA(side));
		}
		
		public static double calcSA(double s)
		{
			return 6 * s * s;
		}
		
		public static void print(double sa)
		{
			System.out.printf("The SA or a cube with side lengths " + side + " is %5.5f", sa);
		}
	}