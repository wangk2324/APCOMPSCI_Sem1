import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner inchinputs = new Scanner(System.in);
		Ex_04 subwooferVol = new Ex_04();
		
		System.out.println("Please input the height (in inches):");
		double height = inchinputs.nextInt();
		inchinputs.nextLine();
		
		System.out.println("Please input the length (in inches):");
		double length = inchinputs.nextInt();
		inchinputs.nextLine();
		
		System.out.println("Please input the width (in inches):");
		double width = inchinputs.nextInt();
		inchinputs.nextLine();
		
		double inVolume = width*height*length;
		
		double conversion = subwooferVol.CalcVol(inVolume);
		
		System.out.printf("The volume in cubic feet is:%10.2f", conversion);
	}
	
	public double CalcVol(double vol)
	{
		return (vol)/1728;
	}
}