import java.util.Scanner;

public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kbinput = new Scanner(System.in);
		System.out.println("Please input a number:");
		int inNum = kbinput.nextInt();
		System.out.println("Please input the size of the table:");
		int sizeTable = kbinput.nextInt();
		
		for (int i = 1; i <= sizeTable; i++)
		{	
			System.out.printf("%5d  |  %5d\n", i, i*inNum);
		}
	}
}