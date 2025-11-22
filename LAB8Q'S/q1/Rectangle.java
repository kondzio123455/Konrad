
public class Rectangle extends TwoDShape
{
	// Rectangle dimensions
	private double length;
	private double width;
    
	
	  //Construct a Rectangle with a name, colour, length and width.
	 
	public Rectangle(String name, String colour, double length, double width)
	{
		super(name, colour);
		this.length = length;
		this.width = width;
	}
    
	
	 //Area = length * width
	 
	public double area()
	{
		return length * width;
	}
    
	public String toString()
	{
		return (super.toString() + "\nLength = " + length + "\nWidth = " + width);
	}
}
