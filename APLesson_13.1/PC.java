public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	public PC(String n)
	{
		super(n);
	}
	public String SystemInput()
	{
		return "Keyboard and Mouse";
	}
	public String getPlatform()
	{
		return "PC";
	}
	
	/* public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nSystemInput: ";
	} */
}