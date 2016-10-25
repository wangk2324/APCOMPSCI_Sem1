import java.util.Scanner;

public class Box
{
	public static void main(String[]args)
	{
		Scanner kbinput = new Scanner(System.in);
		System.out.println("Please input a string:");
		String inString = kbinput.nextLine();
		int lenString = inString.length();
		
		for (int i = 1; i <= lenString; i++)
		{
			System.out.println(inString);
		}
	}
}