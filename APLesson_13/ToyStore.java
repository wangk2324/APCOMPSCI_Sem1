import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	//constructor
	public ToyStore()
	{
		loadToys("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
	}
	public ToyStore(String t)
	{
		loadToys(t);
	}
	
	public static void loadToys(String ts)
	{
		ArrayList<Toy> toys = ts.split(", ");
		for (int i = 0; i < toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = getThatToy(name);
			if (t == null)
			{
				if (t.getType().equals("Car")) 
				{
					toyList.add(new Car(name));
				}
				if (t.getType().equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
				else
				{
					count = count + 1;
				}
			}
		}
	}
	
	public static Toy getThatToy(String nm)
	{
		for (Toy x : toyList)
		{
			if (x.getName() == nm)
			{
				return x;
			}
			return null;
		}
	}
	
	public static String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy x: toyList)
		{
			if (max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
			return x;
		}
	}
	
	public static String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy x: toyList)
		{
			if (x.getType().equals("Car"))
			{
				cars = cars + 1;
			}	
			if (x.getType().equals("AF"))
			{
				figures = figures +1;
			}
		}
		if (cars > figures)
		{
			return "Cars";
		}
		if (figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal Amounts of Action Figures and Cars!";
		}
	}
	
	public String toString()
	{
		return toyList;
	}
}