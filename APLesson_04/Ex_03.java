import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner inputs = new Scanner(System.in);
		Ex_03 loanAmt = new Ex_03();
		
		System.out.println("What is the principle?");
		double principle = inputs.nextDouble();
		inputs.nextLine();
		
		System.out.println("What is the interest rate?");
		double rate = inputs.nextDouble();
		inputs.nextLine();
		
		System.out.println("How many times is the loan compounded per year?");
		double compounded = inputs.nextDouble();
		inputs.nextLine();
		
		System.out.println("What is the life of the loan (in years)?");
		double time = inputs.nextDouble();
		inputs.nextLine();
		
		double monthly = loanAmt.CalcInterest(principle, rate, compounded, time)/(12 * time);
		
		System.out.printf("Your monthly payment will be $%10.2f", monthly);
	}
	
	public double CalcInterest(double p, double r, double n, double t)
	{
		return Math.pow(1 + ((r/(12*100))/n), n * t) * p;
	}
	

}