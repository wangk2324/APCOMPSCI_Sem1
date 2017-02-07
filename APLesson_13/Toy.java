public abstract class Toy
{
	private String name;
	private double count;
	
	
	//constructors
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	//modifiers
	public void setName(String n)
	{
		this.name = n;
	}
	public void setCount(double c)
	{
		this.count = c;
	}
	
	//accessors
	public String getName()
	{
		return name;
	}
	public double getCount()
	{
		return count;
	}
	
	//abstract method
	public abstract String getType();
	
	//toString
	public String toString()
	{
		return name + "\t...\t" + count;
	}
}