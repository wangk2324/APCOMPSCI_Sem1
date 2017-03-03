public class Honda implements Location
{
	private double coorx, coory;
	
	public Honda()
	{
		coorx = 0;
		coory = 0;		
	}
	
	public Honda(double[] inpcoor)
	{
		coorx = inpcoor[0];
		coory = inpcoor[1];
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
		return (int)(Math.random() * 999999) + 1;
	}
}