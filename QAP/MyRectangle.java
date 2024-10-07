
//Creates the MyRectangle class and the four private variables: 
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    private MyPoint topRight;
    private MyPoint bottomLeft;

    /* Creates a constructor that takes in four ints as parameters; tx, ty, bx, by.
     Creates four new MyPoint objects, which are passed in two of the parameters
     each, and are assigned to the four MyRectangle variables.*/
    public MyRectangle(int tx, int ty, int bx, int by) {
        this.topLeft = new MyPoint(tx, ty);
        this.bottomRight = new MyPoint(bx, by);
        this.topRight = new MyPoint(bx, ty);
        this.bottomLeft = new MyPoint(tx, by);

    }

    /* Creates a get method which returns the topLeft variable (which is a MyPoint
     object) of the object the method is invoked on.*/
    public MyPoint getTopLeft() {
        return topLeft;
    }

    /* Creates a set method, which takes in two ints, x and y. The SetXY() method in
     the MyPoint class is invoked on the topLeft variable of the MyLine object,
     and is passed the x and y to set as the value.*/
    public void setTopLeft(int x, int y) {
        topLeft.setXY(x, y);
    }

    /*Creates a get method which returns the bottomRight variable (which is a
     MyPoint object) of the object the method is invoked on.*/
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    /* Creates a set method, which takes in two ints, x and y. The SetXY() method in
     the MyPoint class is invoked on the bottomRight variable of the MyLine
     object, and is passed the x and y to set as the value.*/
    public void setBottomRight(int x, int y) {
        bottomRight.setXY(x, y);
    }

    /* Creates a method getWidth(), which invokes the distance() method of the
     MyPoint class on the topLeft variable of the MyRectangle object and passes it
     the bottomRight variable as a parameter. distance() returns a double, which
     is then returned by getWidth().*/
    public double getWidth() {
        return topLeft.distance(bottomLeft);
    }

    /* Creates a method getLength(), which invokes the distance() method of the
     MyPoint class on the topLeft variable of the MyRectangle object and passes it
     the topRight variable as a parameter. distance() returns a double, which
     is then returned by getLength().*/
    public double getLength() {
        return topLeft.distance(topRight);
    }

    /* Creates a method getArea(), which invokes the getLength() and getWidth()
     methods on the MyRectangle object, multiplies the results and returns the
     resulting double.*/
    public double getArea() {
        return (this.getLength() * this.getWidth());
    }

    /* Creates a method getPerimeter(), which invokes the getLength() and getWidth()
     methods on the MyRectangle object, adds the results, multiplies it by 2 and
     returns the resulting double.*/
    public double getPerimeter() {
        return (2 * (this.getLength() + this.getWidth()));
    }

    // Creates a method called toString(), which returns the string below:
    public String toString() {
        return ("MyRectangle [Top Left: (" + topLeft + "), Top Right: (" + topRight + "), Bottom Left: (" + bottomLeft
                + "), Bottom Right: ("
                + bottomRight + ")]");
    }

}
