// Point in 2D
class Point {
    private int x; // x coord
    private int y; // y coord

    // constructor and arguments and then initialize the x and y values
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
     public int getX (){ 
        return x;
     }                          // get methods for x and y
        public int getY (){
        return y;
     }

    @Override
    public String toString() {
     return "point (" + x + ", " + y + ")";
    }
}

// Circle centered at (x,y)
class Circle extends Point {
    private int radius; // radius

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
        }
    }


