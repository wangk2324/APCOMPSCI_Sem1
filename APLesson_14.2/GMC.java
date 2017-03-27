public class GMC extends Car
{
	private double coorx, coory;
	
	public GMC()
	{
		super();
		coorx = 0;
		coory = 0;		
	}
	
	public GMC(double x, double y)
	{
		super();
		coorx = x;
		coory = y;
		move(coorx, coory);
	}
}