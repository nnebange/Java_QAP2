
import java.util.Arrays;

//Creates the public class TestMyLine:
public class TestMyLine {

    // Creates the main() method:
    public static void main(String[] args) {
        // Creates new MyLine and MyPoint objects:
        MyLine l1 = new MyLine(1, 1, 2, 2);
        MyPoint p1 = new MyPoint(3, 3);
        MyPoint p2 = new MyPoint(4, 4);
        MyLine l2 = new MyLine(p1, p2);

        // Runs the tests:
        l1.setBegin(p2);
        System.out.println("Coordinates of Beginning Point are: (" + l1.getBegin() + ")");
        l2.setEnd(p1);
        System.out.println("Coordinates of Ending Point are: (" + l2.getEnd() + ")");
        l2.setBeginX(5);
        System.out.println("X Coordinate of Beginning Point is: " + l2.getBeginX());
        l2.setBeginY(5);
        System.out.println("Y Coordinate of Beginning Point is: " + l2.getBeginY());
        l1.setEndX(6);
        System.out.println("X Coordinate of Ending Point is: " + l1.getEndX());
        l1.setEndY(6);
        System.out.println("Y Coordinate of Ending Point is: " + l1.getEndY());
        l1.setBeginXY(1, 1);
        System.out.println("Coordinates of Beginning Point are: " + Arrays.toString(l1.getBeginXY()));
        l2.setEndXY(2, 2);
        System.out.println("Coordinates of Ending Point are: " + Arrays.toString(l2.getEndXY()));
        System.out.println("Length is: " + l1.getLength());
        System.out.println("Gradient is: " + l1.getGradient());
        System.out.println(l1.toString());
    }
}
