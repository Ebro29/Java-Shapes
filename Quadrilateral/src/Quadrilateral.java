/**
 * @author Ebrahim Shahid
 * @version 1.0
 * @since 02-16-2020
 */

public class Quadrilateral
/**
 * The Quadrilateral class serves to be a super class
 * This class defines 4 coordinates called points to form the shape of the object
 */
{
    Point point1, point2, point3, point4;
    public Quadrilateral( double x1, double y1, double x2, double y2,
                          double x3, double y3, double x4, double y4 )
    {
        point1 = new Point( x1, y1 );
        point2 = new Point( x2, y2 );
        point3 = new Point( x3, y3 );
        point4 = new Point( x4, y4 );
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    /**
     *
     * The toString and printCoordinates classes uses the parameters passed for points
     * The functions return the coordinates of the points in (x,y) format as doubles
     */
    public String toString() {
        return "Coordinates of Quadrilateral are: \n" + printCoordinates();
    }

    public String printCoordinates() {
        return point1.toString() + ", " + point2.toString() + ", " +
                point3.toString() + ", " + point4.toString();
    }

    /**
     *
     * This is the main method which creates objects of each type
     * 5 objects are created with coordinates as arguments: Quadrilateral, Trapezoid, Parallelogram, Rectangle, and Square
     * This method will output the coordinates, height, width, and area of all objects with the exception of Quadrilateral which is the super class
     */
    public static void main(String [] args) throws IllegalArgumentException{
        //Creating objects with sample coordinates
        Quadrilateral quadrilateral = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.6, 9.9, 2.2, 7.4);
        Trapezoid trapezoid = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
        Parallelogram parallelogram = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
        Rectangle rectangle = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
        Square square = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
        //Outputting the objects based on sample points
        System.out.print(quadrilateral);
        System.out.print(trapezoid);
        System.out.print(parallelogram);
        System.out.print(rectangle);
        System.out.print(square);
    }
} // end class Quadrilateral