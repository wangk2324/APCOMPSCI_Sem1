import java.util.Scanner;

public class Ex_02
	{
		static String discount;
		
		public static void main(String[]args)
		{
			Scanner keyboard = new Scanner(System.in);
			Ex_02 receiptObject = new Ex_02();
			
			System.out.println("What is the first item?");
			String item1 = keyboard.nextLine();
			System.out.println("What is the price of the first item?");
			double price1 = keyboard.nextDouble();
			keyboard.nextLine();
			
			System.out.println("What is the second item?");
			String item2 = keyboard.nextLine();
			System.out.println("What is the price of the second item?");
			double price2 = keyboard.nextDouble();
			keyboard.nextLine();
			
			System.out.println("What is the third item?");
			String item3 = keyboard.nextLine();
			System.out.println("What is the price of the third item?");
			double price3 = keyboard.nextDouble();
			keyboard.nextLine();
			
			System.out.println("What is the fourth item?");
			String item4 = keyboard.nextLine();
			System.out.println("What is the price of the fourth item?");
			double price4 = keyboard.nextDouble();
			keyboard.nextLine();
			
			double total = price1 + price2 + price3 + price4;
			String totalDis = discount(total);
			
			System.out.println("<<<<<<< Receipt >>>>>>>");
			receiptObject.format(item1, price1);
			receiptObject.format(item2, price2);
			receiptObject.format(item3, price3);
			receiptObject.format(item4, price4);
			receiptObject.format("Total:", total);
			System.out.println("\nDiscount:       " + totalDis);
			System.out.println("_______________________");
		}
		
		public static String discount(double priceTotal)
		{
			if (priceTotal >= 2000)
			{
				discount = "15%";
			}
			
			if (priceTotal < 2000)
			{
				discount = "0%";
			}
			
			return discount;
		}
		
		public void format(String item, double price)
		{
			System.out.printf("\n%12s %7.2f\n", item + ".....", price);
		}
	}