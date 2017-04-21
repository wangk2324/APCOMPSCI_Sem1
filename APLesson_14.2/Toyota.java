import java.util.ArrayList;
import java.util.Arrays;

public class Toyota extends Car
{	
	public Toyota(String inp)
	{
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		location[0] = Double.parseDouble(coorz.get(0));
		location[1] = Double.parseDouble(coorz.get(1));
	}
}