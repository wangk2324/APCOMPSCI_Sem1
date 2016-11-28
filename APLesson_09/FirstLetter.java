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
		
		System.out.println("\nFirst Letters:");
		
		first(words);
	}
	public static String first(String[] wordz)
	{
		for (String word : wordz)
			{
				System.out.println(word.charAt(0));
			}
			return "";
	}
}