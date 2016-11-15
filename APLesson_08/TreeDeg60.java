import java.util.Scanner;

public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a word:");
		String WordInput = kb.nextLine();
		tree(WordInput, 0, WordInput.length());
	}
	
	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%7s%n", word.substring(0, start));
			return tree(word, start + 1, stop);
		}
		return "";
	}
}