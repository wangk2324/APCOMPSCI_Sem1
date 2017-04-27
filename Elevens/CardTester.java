/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card Card1 = new Card("Nine", "Hearts", 9);
		Card Card2 = new Card("King", "Diamonds", 13);
		Card Card3 = new Card("Queen", "Spades", 12);
		
		System.out.println(Card1);
		System.out.println(Card2);
		System.out.println(Card3);
	}
}
