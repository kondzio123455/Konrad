
public class Sphere extends ThreeDShape
{
	// Radius of the sphere (in whatever units the caller uses)
	private double radius;
    
	public Sphere(String name, String colour, double radius)
	{
		super(name, colour);
		this.radius = radius;
	}

	public double area()
	{
		return 4 * Math.PI * radius * radius;
	}
    
	public double volume()
	{
		return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	}
    

	public String toString()
	{
		return (super.toString() + "Radius = " + radius);
	}
}