import java.util.Scanner;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("hair:");
		String inhair = kb.nextLine();
		System.out.println("eyes:");
		String ineyes = kb.nextLine();
		System.out.println("skin:");
		String inskin = kb.nextLine();
		
		Human obj = new Human("black", "brown", "tan");
		System.out.println("My info:");
		System.out.println("Hair:\t" + obj.getHair());
		System.out.println("Eyes:\t" + obj.getEyes());
		System.out.println("Skin:\t" + obj.getSkin());
		
		obj.setAttributes(inhair, ineyes, inskin);
		System.out.println("\nFriend's info:");
		System.out.println("Hair:\t" + obj.getHair());
		System.out.println("Eyes:\t" + obj.getEyes());
		System.out.println("Skin:\t" + obj.getSkin());
	}
}