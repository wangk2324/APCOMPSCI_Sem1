import java.util.Scanner;

public class ReplaceAts
{	
	//static String sentence;
	static String inStr = " ";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a string:");
		String inStr = kb.nextLine();
	
		while (inStr.indexOf("a") >= 0)
		{
			inStr = inStr.substring(0, inStr.indexOf("a")) + "@" + inStr.substring(inStr.indexOf("a") + 1);
		}
		
		System.out.println(inStr);
	}	
}