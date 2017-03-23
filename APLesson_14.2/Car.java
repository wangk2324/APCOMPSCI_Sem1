public abstract class Car implements Location
{
	int ID;
	double coorx, coory;
	
	public Car()
	{
		ID = (int)(Math.random() * 999999) + 1;
	}
	
	public void move(double x, double y)
	{
		coorx += x;
		coory += y;
	}

}