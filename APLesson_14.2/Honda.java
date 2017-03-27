public class Honda extends Car
{
	private double coorx, coory;
	
	public Honda()
	{
		coorx = 0;
		coory = 0;		
	}
	
	public Honda(double[] inpcoor)
	{
		super();
		coorx = inpcoor[0];
		coory = inpcoor[1];
		move(coorx, coory);
	}
}