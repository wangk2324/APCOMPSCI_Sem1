import java.util.Scanner;

public class ReverseTriangle
{
	public static void main(String[]args)
	{
		Scanner kbinput = new Scanner(System.in);
		System.out.println("Please input a string:");
		String triString = kbinput.nextLine();
		int lenString = triString.length();
		
		for(int i = lenString; i >= 1; i--)
		{
			System.out.println(triString.substring(0,i));
		}
	}
}