public class Human
{
	private String hair, eyes, skin;
	
	//Constructors
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//modifier
	public void setAttributes(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//accessors
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
}