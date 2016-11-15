import java.util.Scanner;

public class Underscores
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a string:");
		String sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	
	public static String replace(String sen)
	{
		if (sen.indexOf(" ") > 0)
		{
			sen = sen.substring(0, sen.indexOf(" ")) + "_" + sen.substring(sen.indexOf(" ") + 1);
			return replace(sen);
		}
		else
		{
			return sen;
		}
	}
}