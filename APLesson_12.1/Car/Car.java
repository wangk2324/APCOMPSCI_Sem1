public class Car
{
	private String paint, interior, engine, tires;
	
	
	//constructors
	public Car()
	{
		paint = "";
		interior = "";
		engine ="";
		tires = "";
	}
	
	public Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	//modifier
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;		
	}
	
	//accessors
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tires;
	}
}