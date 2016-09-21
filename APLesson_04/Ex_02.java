import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{	
		Scanner info = new Scanner(System.in);
		
		Ex_02 ID = new Ex_02();
		
		System.out.println("Enter your first name:");
		String fname = info.nextLine();
		System.out.println("Enter your last name:");
		String lname = info.nextLine();
		
		System.out.println("Enter your title:");
		String title = info.nextLine();
		System.out.println("What is your subject?");
		String subject = info.nextLine();
		
		System.out.println("Enter the school site:");
		String school = info.nextLine();
		System.out.println("Enter the school year:");
		String year = info.nextLine();
		
		System.out.println("************************************");
		ID.formatIDCard(school, year);
		ID.formatIDCard(fname, lname);
		ID.formatIDCard(title, subject);
		System.out.println("\n\n************************************");
	}
	
	public void formatIDCard(String item1, String item2)
	{
		System.out.printf("\n*%15s %20s", item1, item2 + "*");
	}
}