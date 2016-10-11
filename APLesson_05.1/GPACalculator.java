import java.util.Scanner;

public class GPACalculator
{
	static double gpa;
	
	public static void main(String[]args)
	{
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("What is the first grade?");
		String grade1 = inputs.nextLine();
		
		System.out.println("What is the second grade?");
		String grade2 = inputs.nextLine();
		
		System.out.println("What is the third grade?");
		String grade3 = inputs.nextLine();
		
		System.out.println("What is the fourth grade?");
		String grade4 = inputs.nextLine();
		
		System.out.println("What is the fifth grade?");
		String grade5 = inputs.nextLine();
		
		System.out.println("What is the sixth grade?");
		String grade6 = inputs.nextLine();
		
		System.out.println("What is the seventh grade?");
		String grade7 = inputs.nextLine();
		
		double gpa1 = calcPoints(grade1);
		double gpa2 = calcPoints(grade2);
		double gpa3 = calcPoints(grade3);
		double gpa4 = calcPoints(grade4);
		double gpa5 = calcPoints(grade5);
		double gpa6 = calcPoints(grade6);
		double gpa7 = calcPoints(grade7);
		
		double totalGPA = (gpa1 + gpa2 + gpa3 + gpa4 + gpa5 + gpa6 + gpa7)/7;
		System.out.printf("Your GPA is %4.2f", totalGPA);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return gpa = 4.0;
		}
		if (grade.equals("B"))
		{
			return gpa = 3.0;
		}
		if (grade.equals("C"))
		{
			return gpa = 2.0;
		}
		if (grade.equals("D"))
		{
			return gpa = 1.0;
		}
		if (grade.equals("F"))
		{
			return gpa = 0.0;
		}
		return gpa;
	}
}