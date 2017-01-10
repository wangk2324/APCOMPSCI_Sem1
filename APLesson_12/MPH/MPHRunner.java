import java.util.Scanner;

public class MPHRunner
{
	public static void main(String[]args)
	{
		//user input
		Scanner kb = new Scanner(System.in);
		System.out.println("Distance in miles:");
		int dist = kb.nextInt();
		System.out.println("Hours:");
		int hour = kb.nextInt();
		System.out.println("Minutes:");
		int minu = kb.nextInt();
		
		//instantiate MilesPerHour object
		MilesPerHour obj = new MilesPerHour(10, 2, 0);
		
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
		
		obj.setValues(dist, hour, minu);
		
		System.out.println("\nUser Input:");
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
	}
}