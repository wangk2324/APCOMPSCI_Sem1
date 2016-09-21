public class Lesson_04
{
	public static void main(String[]args)
	{
		//System.out.printf("%10s %10.2f", "test", 2324.3656);
		//System.out.printf("\n%10s %10.2f", "thisexam", 867530.00);
		
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blaaah";
		double number1 = 2324.3656;
		
		form.format(word1, number1);
		
		String word2 = "yayayay";
		double number2 = 532.02;
		form.format(word2, number2);
	}
	
	public void format(String word, double number) //these parameters only visible in this method
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
}