public abstract class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	public Console(String n)
	{
		super(n);
	}
	
	public abstract String getController();
	
	/* public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + controller;
	} */
}