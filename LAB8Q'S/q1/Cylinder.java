

public class Cylinder extends ThreeDShape
{
	private double radius;
	private double height;
	
	public Cylinder(String name, String colour, double radius, double height)
	{
		super(name, colour);
		this.radius = radius;
		this.height = height;
	}
	
	public double area()
	{
		return 2 * radius * height + 2 * radius * radius;
	}
	
	public double volume()
	{
		return  radius * radius * height;
	}
	
	public String toString()
	{
		return (super.toString() + "\nRadius = " + radius + "\nHeight = " + height);
	}
}