import java.util.Scanner;

public class StudyGuide_01
{
public static void main(String[]args)
{
	int num = 45;
	System.out.println("IronMan has " + num + " kinds of weapons in his vault.");
	
	String pres = "Abraham Lincoln";
	String quote = "Whatever you are, be a good one.";
	System.out.println(pres + " once said, \"" + quote + "\"");
	
	int h = 45;
	int w = 64;
	int hw = h*w;
	System.out.println("The area of your rectangle is..." + hw);
	
	System.out.println("It would cause an error, since the program is expecting a character with a numerical value.");
	
	Scanner kb = new Scanner(System.in);
	System.out.println("What is your name? ");
	
	String answer = kb.next();
	System.out.println("Is there a Mr. or Mrs. " + answer + "?");
	
	System.out.println("It would only print Buster, since string would only take the first word; you would need 'next' if you wanted the whole statement.");
	
	Scanner k = new Scanner(System.in);
	
	System.out.println("How many siblings do you have? ");
	int answer1 = k.nextInt();
	
	System.out.println("What are their names? ");
	String answer2 = k.nextLine();
		
	System.out.println("OK, which one is your favorite?");
	String answer3 = k.nextLine();
	System.out.println("Awe! " + answer3 + " is your favorite.");

	System.out.println("Scanner.nextLine after a numerical input")
	
}
}