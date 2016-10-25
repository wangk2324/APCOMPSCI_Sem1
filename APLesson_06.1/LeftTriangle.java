import java.util.Scanner;

public class LeftTriangle
{
	public static void main(String[]args)
	{
		Scanner strInput = new Scanner(System.in);
		System.out.println("Please input a string:");
		String triWord = strInput.nextLine();
		int lenString = triWord.length();
		
		for (int i = 0; i <= lenString; i++)
		{
			System.out.println(triWord.substring(i, lenString));
		}
	}
}