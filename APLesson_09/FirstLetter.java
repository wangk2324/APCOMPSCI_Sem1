import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input five words:");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("First Letters:");
		for (String word : words)
		{
			System.out.println(word.charAt(0));
		}
	}
}