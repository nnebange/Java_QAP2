

/*Creates the MyLine class and the two private instance variables: */
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    /* 
     Creates a constructor that takes in four ints as parameters; x1, y1, x1, y2.
     Creates a new Mypoint object, which is passed x1 and y1 and sets it as the
     begin variable. Creates a second new Mypoint object, which is passed x2 and
     y2 and sets it as the end variable.*/
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);

    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        int[] xy = new int[2];
        xy[0] = begin.getX();
        xy[1] = begin.getY();
        return xy;
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }
    public int[] getEndXY() {
        int[] xy = new int[2];
        xy[0] = end.getX();
        xy[1] = end.getY();
        return xy;
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    // Creates a method called toString(), which returns the string below:
    public String toString() {
        return ("MyLine [begin = (" + this.begin + "), end = (" + this.end + ")]");
    }

}