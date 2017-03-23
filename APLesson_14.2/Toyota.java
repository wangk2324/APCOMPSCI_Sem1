import java.util.ArrayList;
import java.util.Arrays;

public class Toyota extends Car
{	
	private String scoor;
	private double coorx;
	private double coory;
	
	public Toyota()
	{	
	}
	
	public Toyota(String inp)
	{
		super();
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		double x = Double.parseDouble(coorz.get(0));
		double y = Double.parseDouble(coorz.get(1));
		move(x,y);
	}
	
	public double[] getLoc()
	{
		double[] location = {coorx, coory};
		return location;
	}
	
	public int getID()
	{
		return ID;
	}
}