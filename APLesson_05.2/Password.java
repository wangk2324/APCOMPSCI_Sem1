import java.util.Scanner;

public class Password
{
	static String staticUN = "hiya";
	static String staticPW = "howdy";
	
	public static void main(String[]args)
	{
		passCheck();
	}
	
	public static void passCheck()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the username?");
		String inputUN = input.nextLine();
		
		System.out.println("What is the password?");
		String inputPW = input.nextLine();
		
		if ((inputUN.equals(staticUN)) && (inputPW.equals(staticPW)))
		{
			System.out.println("You are granted access!");
		}
		
		if (!(inputUN.equals(staticUN)) && (inputPW.equals(staticPW)))
		{
			System.out.println("Your username is incorrect.");
			passCheck();
		}
		
		if ((inputUN.equals(staticUN)) && !(inputPW.equals(staticPW)))
		{
			System.out.println("Your password is incorrect.");
			passCheck();
		}
		
		if (!(inputUN.equals(staticUN)) && !(inputPW.equals(staticPW)))
		{
			System.out.println("Your username and password are incorrect");
			passCheck();
		}
	}
}