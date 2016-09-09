import java.util.Scanner; //import statement

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner BMI = new Scanner(System.in);
		
		System.out.println("What is your weight in lbs?");
		double weight = BMI.nextInt();
		
		System.out.println("What is your height in inches?");
		double height = BMI.nextInt();
		
		double calc = (703 * weight)/(height * height);
		
		System.out.println("Your BMI is " + calc + ".");
	}
}