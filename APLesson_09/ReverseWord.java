import java.util.Scanner;

public class ReverseWord
{
	static String newWord = "";
	
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input five words:");
		
		//fills the array
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("In Order:");
		//print the array
		//System.out.println("In Order:");
		for (String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("");
		
		System.out.println("Reversed:");		
		for (int i = words.length - 1; i >= 0; i --)
		{
			newWord = words[i];
			System.out.println(newWord);
		}
		
		
	}
}
