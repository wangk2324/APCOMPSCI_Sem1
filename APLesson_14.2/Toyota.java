import java.util.ArrayList;
import java.util.Arrays;

public class Toyota extends Car
{	
	private String scoor;
	private double coorx;
	private double coory;
	
	public Toyota()
	{
		coorx = 0;
		coory = 0;	
	}
	
	public Toyota(String inp)
	{
		super();
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		coorx = Double.parseDouble(coorz.get(0));
		coory = Double.parseDouble(coorz.get(1));
		move(coorx,coory);
	}
}