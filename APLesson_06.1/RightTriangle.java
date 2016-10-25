import java.util.Scanner;

public class RightTriangle
{
	public static void main(String[]args)
	{
		Scanner strInput = new Scanner(System.in);
		System.out.println("Please input a string:");
		String word = strInput.nextLine();
		int wordlength = word.length();
		
		for (int i = wordlength; i >= 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}