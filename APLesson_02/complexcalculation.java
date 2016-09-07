public class complexcalculation
{
	public static void main(String[]args)
	{
		int length = 5;
		int height = 8;
		int width = 6;
		int halfSides = width * length + height * length + height * width;
		int sArea = 2 * halfSides;
		
		System.out.println("The surface area of your rectangle is " + sArea);
	}
}