

/*Creates the MyPoint class and the two private instance variables:*/
public class MyPoint {
    private int x;
    private int y;

    /* Creates an empty constructor, and the variables are set to 0.*/
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    /*
     Creates a constructor that takes two ints, x and y, as parameters, and
     assigns them to the x and y variables of the new object.*/
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* Creates a constructor that takes a MyPoint object, p, as a parameter. The x
     variable of p is assigned to the x value of the new object, and the y
     variable of p is assigned to the y value.*/
    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }

    /*  Creates a get method which returns the int x variable of the object the
     method is invoked on.*/
    public int getX() {
        return x;
    }

    /*  Creates a get method which returns the int y variable of the object the
     method is invoked on.*/
    public int getY() {
        return y;
    }

    /*  Creates a set method, which takes an int, x, as a parameter and sets it as
     the x variable of the object the method is invoked on.*/
    public void setX(int x) {
        this.x = x;
    }

    /*  Creates a set method, which takes an int, y, as a parameter and sets it as
     the y variable of the object the method is invoked on.*/
    public void setY(int y) {
        this.y = y;
    }

    /* 
     Creates a set method, which takes two ints, x and y, as parameters, and sets
     them as the x and y variables of the object the method is invoked on.*/
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* Creates a method distance(), which takes two ints, x and y, as parameters.
     The x parameter is subtracted from the x variable of the object the method is
     invoked on, and the outcome is assigned to an int, xDiff. The y parameter is
     subtracted from the y variable of the object the method is invoked on, and
     the outcome is assigned to an int, yDiff. XDiff and YDiff are passed into an
     formula using the inbuilt math.sqrt()/ method, and the resulting double is
     returned.*/
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return (Math.sqrt((xDiff * xDiff) + (yDiff * yDiff)));
    }

    /* Creates a method distance(), which takes a MyPoint object, p, as a parameter.
     The x variable of the p parameter is subtracted from the x variable of the
     object the method is invoked on, and the outcome is assigned to an int,
     xDiff. The y variable of the p parameter is subtracted from the y variable of
     the object the method is invoked on, and the outcome is assigned to an int,
     yDiff. XDiff and YDiff are passed into an formula using the inbuilt
     math.sqrt()/ method, and the resulting double is returned.*/
    public double distance(MyPoint p) {
        int xDiff = this.x - p.x;
        int yDiff = this.y - p.y;
        return (Math.sqrt((xDiff * xDiff) + (yDiff * yDiff)));
    }

    /* Creates a method distance(), which takes no parameters.
     The x variable of the object the method is invoked on is assigned to an int,
     xDiff, and The y variable of the object the method is invoked on is assigned
     to an int yDiff. XDiff and YDiff are passed into an formula using the inbuilt
     math.sqrt()/ method, and the resulting double is returned.*/
    public double distance() {
        int xDiff = this.x;
        int yDiff = this.y;
        return (Math.sqrt((xDiff * xDiff) + (yDiff * yDiff)));
    }

    /*Creates a method called toString(), which returns the string below:*/
    public String toString() {
        return (this.x + "," + this.y);
    }

}
