/**
 * @author Ebrahim Shahid
 * @version 1.0
 * @since 02-16-2020
 */

// Class Parallelogram definition

public class Parallelogram extends Trapezoid
{
    /**
     *
     * @params x1 - x4, and y1 - y4 will be used to plot coordinate points to draw the shape
     * Using getWidth method will obtain the width of the parallelogram and then the area will be calculated with some inheritence from the trapezoid class
     */
    public Parallelogram( double x1, double y1, double x2, double y2,
                          double x3, double y3, double x4, double y4 )
    {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
    }

    public double getWidth() {
        if ( getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint1().getX() - getPoint2().getX() );
        else
            return Math.abs( getPoint2().getX() - getPoint3().getX() );
    }

    public String toString() {
        return "\nCoordinates of Parallelogram are: \n" +
                printCoordinates() + "\nWidth is: " + getWidth() +
                "\nHeight is: " + getHeight() + "\nArea is: " + getArea();
    }

}
 // end class Parallelogram


