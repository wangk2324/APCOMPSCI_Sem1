public class GMC extends Car
{
	private int coorx, coory;
	
	public GMC()
	{
		super();
		coorx = 0;
		coory = 0;		
	}
	
	public GMC(int x, int y)
	{
		super();
		coorx = x;
		coory = y;
	}
	
	public void move(double x, double y)
	{
		coorx += x;
		coory += y;
	}
	
	
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = coorx;
		location[1] = coory;
		return location;
	}
	
	public int getID()
	{
		return ID;
	}
}