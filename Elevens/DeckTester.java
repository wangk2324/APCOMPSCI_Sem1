/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"Jack", "Six", "Ace"};
		String[] suits1 = {"Hearts", "Clubs"};
		int[] values1 = {11, 6, 1};
		
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		//System.out.println(deck1);
	}
}
