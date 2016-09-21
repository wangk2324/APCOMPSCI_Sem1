import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{	
		Scanner inputs = new Scanner(System.in);
		
		Ex_01 receipt = new Ex_01();
		
		System.out.println("Please enter Item 1");
		String item1 = inputs.nextLine();
		System.out.println("Please enter the price of Item 1");
		double price1 = inputs.nextDouble();
		inputs.nextLine();
		
		
		System.out.println("Please enter Item 2");
		String item2 = inputs.nextLine();
		System.out.println("Please enter the price of Item 2");
		double price2 = inputs.nextDouble();
		inputs.nextLine();
		
		
		System.out.println("Please enter Item 3");
		String item3 = inputs.nextLine();
		System.out.println("Please enter the price of Item 3");
		double price3 = inputs.nextDouble();
		inputs.nextLine();
		
		double subtotal = price1 + price2 + price3;
		String sub = "Subtotal";
		double calcTax = 0.075*subtotal;
		String t = "Tax";
		double calcTotal = calcTax + subtotal;
		String total = "Total";
		
		System.out.println("<<<<<_____Receipt_____>>>>>");
		receipt.formatReceipt(item1, price1);
		receipt.formatReceipt(item2, price2);
		receipt.formatReceipt(item3, price3);
		receipt.formatReceipt(sub, subtotal);
		receipt.formatReceipt(t, calcTax);
		receipt.formatReceipt(total, calcTotal);
	
	}
	
	public void formatReceipt(String item, double price)
	{
		System.out.printf("\n%17s %7.2f\n", item + ".....", price);
	}
}