public class Rectangle {
   
    private double length;
    private double width;
    private String printRectangle;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public void setRectangle(double length, double width) {
        if (length > 0.0 && length <= 40.0 && width > 0.0 && width <= 40.0) { // checking the values to meet the criteria
            this.length = length;
            this.width = width;
        } 
    }
        
    public void printRectangle() {

        int rows = (int) length; // converting to int and renaming 
        int cols = (int) width;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == 0 || r == rows - 1 || c == 0 || c == cols - 1) { // print * on borders space inside
                    System.out.print("*"); // this is the border
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next row
        }
    }

    public String setRectangle() {
        return "length = " + length + " , width = " + width;
    }
}

