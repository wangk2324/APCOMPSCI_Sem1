import java.util.Random;

public class Ex_01
	{
		static String winner;
		
		public static void main(String[]args)
		{
			Random rInt = new Random();
		
			int humanRoll = rInt.nextInt(6) + 1;
			int compRoll = rInt.nextInt (6) + 1;
			
			winner = rollDice(humanRoll, compRoll);
			
			System.out.println("You rolled a " + humanRoll);
			System.out.println("Computer rolled a " + compRoll);
			System.out.println("The winner is " + winner);
		}
	
		public static String rollDice(int hRoll, int cRoll)
		{
			if (hRoll > cRoll)
			{
				winner = "you!";
			}
		
			if (hRoll < cRoll)
			{
				winner = "computer!";
			}
		
			if (hRoll == cRoll)
			{
				winner = "no one. It's a tie!";
			}
			
			return winner;
		}
	}