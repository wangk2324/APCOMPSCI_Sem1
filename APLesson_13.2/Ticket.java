public abstract class Ticket
{
	private int serialNo;
	
	//constructor
	public Ticket()
	{
		serialNo = 0;
	}
	
	//accessor
	public int getSerialNo()
	{
		return (int)(Math.random() * 10000000) + 1; 
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}