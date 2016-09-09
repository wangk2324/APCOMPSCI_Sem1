import java.util.Scanner; 

public class Ex_01
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "name"
		Scanner Rude_AI = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name?");
		
		//search for the input the user enters
		String name = Rude_AI.nextLine();
		
		//print the results
		System.out.println(name + "?!!! Your parents must have hated you.");
		
		System.out.println("How old are you?");
		String age = Rude_AI.nextLine();
		System.out.println(age + "!!! You are an example that wisdom does not come with age.");
		
		System.out.println("What do you do for fun, " + name + "?");
		String hobby = Rude_AI.nextLine();
		System.out.println("I never understood why people " + hobby + ".");
		
		System.out.println("What music do you like?");
		String music = Rude_AI.nextLine();
		System.out.println(music + " makes my ears bleed.");
		
		System.out.println("How many siblings do you have?");
		int siblings = Rude_AI.nextInt();
		System.out.println("Wow, I hope your " + siblings + " siblings got better genes.");
		
		Rude_AI.nextLine();
	
		
		System.out.println("What do you want to be when you grow up?");
		String job = Rude_AI.nextLine();
		System.out.println("Maybe being a " + job + " isn't the job for you.");
		
		System.out.println("\nSo, " + name + ", you're " + age + ", and you like to " + hobby + " and listen to " + music + ".");
		System.out.println("You definitely shouldn't be a " + job + ".");
		System.out.println("Just kidding around, " + name + ".");
		
	}
}