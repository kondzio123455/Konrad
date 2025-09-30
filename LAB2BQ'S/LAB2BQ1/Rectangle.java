public class Rectangle {
   
    private double length;   
    private double width;    

                            //  constructor sets length and width to 1
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

                                                                                // sets length and width to the criteria must be > 0 and <= 40
    public void setRectangle(double length, double width) {
        if (length > 0.0 && length <= 40.0 && width > 0.0 && width <= 40.0) {
            this.length = length;
            this.width = width;
        } 
    }

                                                                // returns a string describing the rectangle
    public String getRectangle() {
        return "length = " + length + " , width = " + width;
    }
}

