public class Toyota implements Location
{	
	private String scoor;
	private double coorx;
	private double coory;
	
	public Toyota()
	{
		scoor = "";		
	}
	
	public Toyota(String inp)
	{
		scoor = inp;
	}
	
	public double[] getLoc()
	{
		String str = scoor;
		String[] sep = scoor.split(", ");
		coorx = Double.valueOf(sep[0]).doubleValue();
		coory = Double.valueOf(sep[1]).doubleValue();
		double location[] = new double[2];
		location[0] = coorx;
		location[1] = coory;
		return location;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
}