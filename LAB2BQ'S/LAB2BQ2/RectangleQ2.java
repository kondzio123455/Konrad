public class RectangleQ2 {
   
    private double length;     
    private double width;      
    private double area;        // stores area calculated in getArea
    private double perimeter;   // stores perimeter calculated in getPerimenter

    // Default constructor
    public RectangleQ2() {
        this.length = 4.0;     // default length
        this.width = 5.0;      // default width
    }

                                                                                // checks the values to meet the criteria
    public void setRectangle(double length, double width) {
        if (length > 0.0 && length <= 40.0 && width > 0.0 && width <= 40.0) {
            this.length = length;
            this.width = width;
        } 
    }

                                        // calculates and returns area
    public double getArea() {
        return area = length * width;
    }

                                                    // calculates and returns perimeter
    public double getPerimenter() {
        return perimeter = 2 * (length + width);
    }

                                                            // returns a string describing the rectangle with its dimensions
    public String getRectangle() {
        return "length = " + length + " , width = " + width + " , area = " + getArea() + " , perimeter = " + getPerimenter();
    }
}

