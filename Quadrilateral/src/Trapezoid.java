/**
 * @author Ebrahim Shahid
 * @version 1.0
 * @since 02-16-2020
 */
public class Trapezoid extends Quadrilateral
{
    double height;

    public Trapezoid( double x1, double y1, double x2, double y2,
                      double x3, double y3, double x4, double y4 )
    {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
    }

    public double getHeight() {
        if ( getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint2().getY() - getPoint3().getY() );
        else
            return Math.abs( getPoint1().getY() - getPoint2().getY() );
    }

    /**
     *
     * The area of the trapezoid is obtained by summing the 2 sides of differing lengths
     * This sum is then multiplied by the unique height of the trapezoids even sides and then dividing that multiplication by 2
     */
    public double getArea(){
        return getSumOfTwoSides() * getHeight() / 2.0;
    }

    public double getSumOfTwoSides() {
        if ( getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint1().getX() - getPoint2().getX() ) +
                    Math.abs( getPoint3().getX() - getPoint4().getX() );
        else
            return Math.abs( getPoint2().getX() - getPoint3().getX() ) +
                    Math.abs( getPoint4().getX() - getPoint1().getX() );
    }

    /**
     *
     * @return to output the coordinates and area of trapezoid
     */
    public String toString() {
        return "\nCoordinates of Trapezoid are: \n" + printCoordinates() +
                "\nHeight is: " + getHeight() + "\nArea is: " + getArea();
    }

} // end class Trapezoid