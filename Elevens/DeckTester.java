/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"Jack", "Six", "Ace"};
		String[] suits1 = {"Hearts", "Clubs"};
		int[] values1 = {11, 6, 1};
		Deck deck1 = new Deck(ranks1, suits1, values1);
		
		System.out.println(deck1.toString());
		System.out.println(deck1.deal());
		System.out.println("Size:" + deck1.size());
		System.out.println("---------------------------------");
		System.out.println("Deal:" + deck1.deal());
	
		//shuffle
		System.out.println("---------------------------------");
		System.out.println("Shuffle");
		System.out.println("---------------------------------");
		System.out.println("Deal:" + deck1.deal());
	
		//shuffle
        String[] ranks2 = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits2 = {"Diamonds", "Hearts", "Clubs", "Spades"};
		int[] values2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Deck deck2 = new Deck(ranks2, suits2, values2);
        System.out.println(deck2);
		
		System.out.println(deck2.toString());
		System.out.println(deck2.deal());
		System.out.println("Size:" + deck2.size());
		System.out.println("---------------------------------");
		System.out.println("Deal:" + deck2.deal());
		System.out.println("---------------------------------");
		System.out.println("Shuffle");
		System.out.println("---------------------------------");
		System.out.println("Deal:" + deck2.deal());
	}
}