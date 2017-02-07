public class Car extends Toy
{
	private String name;
	private int count;
	private String type;
	
	public Car()
	{
		super();
	}
	public Car(String n)
	{
		super(n);
	}
	
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type = "Car";
	}
}