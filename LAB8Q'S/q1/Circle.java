
//Simple 2D circle shape Computes area using Math.PI and radius squared.

public class Circle extends TwoDShape
{
	// Radius of the circle
	private double radius;

  // Construct a Circle with a name, colour and radius.

	public Circle(String name, String colour, double radius)
	{
		super(name, colour);
		this.radius = radius;
	}
    

	public double area()
	{
		return Math.PI * radius * radius;
	}
	
	public String toString()
	{
		return (super.toString() + "\nRadius = " + radius);
	}
}
