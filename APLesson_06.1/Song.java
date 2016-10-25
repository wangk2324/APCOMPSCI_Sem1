import java.util.Scanner;

public class Song
{
	static String repStr;
	
	public static void main(String[]args)
	{
		System.out.println(Sing("Na ", 4));
		System.out.println(Sing("Na ", 4));
		System.out.println("Hey Hey Hey");
		System.out.println("Goodbye!");
	}
	public static String Sing(String word, int repeat)
	{
		for (int i = 1; i <= repeat; i++)
		{
			System.out.print(word);
		}
		return " ";
	}
}