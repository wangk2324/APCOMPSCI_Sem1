import java.util.Scanner;

public class BMIPart2
{
	static String condition;
	static String BMI;
	
	public static void main(String[]args)
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Please input your height (in):");
		double height = inp.nextDouble();
		System.out.println("Please input your weight (lbs):");
		double weight = inp.nextDouble();
		
		double BMI = (703*weight)/(height*height);
		
		System.out.printf("Your BMI is %3.2f", BMI);
		System.out.println("\nYou are: " + conditionBMI(BMI));
		
	}
	public static String conditionBMI(double bmi)
	{
		if (bmi > 39.9)
		{
			condition = "Morbidly Obese";
		}
		
		else if(bmi >= 35)
		{
			condition = "Very Obese";
		}
		
		else if(bmi >= 29.9)
		{
			condition = "Obese";
		}
		
		else if(bmi >= 25)
		{
			condition = "Overweight";
		}
		
		else if(bmi >= 18.5)
		{
			condition = "Normal";
		}
		
		else
		{
			condition = "Underweight";
		}
		
		return condition;
	}
}