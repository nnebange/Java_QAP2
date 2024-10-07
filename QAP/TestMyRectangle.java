

//Creates the public class TestMyRectangle:
public class TestMyRectangle {

    // Creates the main() method:
    public static void main(String[] args)
    {
                // Creates a new MyRectangle object:
                MyRectangle r1 = new MyRectangle(1, 1, 2, 2);

                // Runs the tests:
                System.out.println(r1);
                r1.setTopLeft(3, 3);
                System.out.println("Top Left Point is: (" + r1.getTopLeft() + ")");
                r1.setBottomRight(4, 4);
                System.out.println("Bottom Right is: (" + r1.getBottomRight() + ")");
                System.out.println("Width is: " + r1.getWidth());
                System.out.println("Length is: " + r1.getLength());
                System.out.println("Area is: " + r1.getArea());
                System.out.println("Perimeter is: " + r1.getPerimeter());
                System.out.println(r1.toString());
    }
}
