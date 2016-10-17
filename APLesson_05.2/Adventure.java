import java.util.Scanner;

public class Adventure
{
	static public void main(String[]args)
	{
		Scanner story = new Scanner(System.in);
		System.out.println("You go camping with your friends, and you suddenly get lost. Do you: 1) look for your friends 2) stay where you are?");
		double choice1 = story.nextDouble();
		if (choice1 == 1)
		{
			System.out.println("You find the trail where you last saw your friends.");
			System.out.println("Do you: 1) follow the voices that lead deeper in the forest 2) go back towards the camp 3) stay in hopes that they will return soon?");
			double choice12 = story.nextDouble();
			
			if (choice12 == 1)
			{
				System.out.println("You travel deeper into the forest. You see vaguely human-shaped shadows in the near distance.");
				System.out.println("Do you: 1) investigate further 2) hide?");
				double choice121 = story.nextDouble();
				
				if (choice121 == 1)
				{
					System.out.println("You reunite with your friends and survive!");
				}
				
				if (choice121 == 2)
				{
					System.out.println("You hide as the shadows pass, and are stuck in the forest.");
				}
			}	
			
			if (choice12 == 2)
			{
				System.out.println("You make your way back to camp, but find that no one is there.");
				System.out.println("Do you: 1) look around the camp 2) raid the food stores?");
				double choice122 = story.nextDouble();
				
				if (choice122 == 1)
				{
					System.out.println("You find a radio that was left behind, and are able to communicate with your friends.");
				}
				
				if (choice122 == 2)
				{
					System.out.println("You come across a bear, and slowly retreat.");
				}
			}
			
		}
		if (choice1 == 2)
		{
			System.out.println("Nothing happens.");
			System.out.println("Do you: 1) wait longer 2) hastily try to find a way out?");
			double choice22 = story.nextDouble();
			
			if (choice22 == 1)
			{
				System.out.println("Still nothing happens.");
				System.out.println("Do you: 1) wait EVEN longer 2) wander around the forest?");
				double choice221 = story.nextDouble();
				if (choice221 == 1)
				{
					System.out.println("Nothing happens...");
				}
				
				else
				{
					System.out.println("You walk deeper into the forest, and become even more lost.");
				}
			}
			
			if (choice22 == 2)
			{
				System.out.println("In your haste, you become even more lost.");
				System.out.println("Do you 1) continue the same way 2) change direction?");
				double choice222 = story.nextDouble();
				
				if (choice222 == 1)
				{
					System.out.println("You reunite with your friends.");
				}
				
				else
				{
					System.out.println("You are lost.");
				}
			}
		}
	}
}