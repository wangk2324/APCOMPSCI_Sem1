public class AFigure extends Toy
{
	private String name;
	private int count;
	private String type;
	
	public AFigure()
	{
		super();
	}
	public AFigure(String n)
	{
		super(n);
	}
	
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type = "Action Figure";
	}
}