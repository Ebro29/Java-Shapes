/**
 * @author Ebrahim Shahid
 * @version 1.0
 * @since 02-16-2020
 */
public class Square extends Parallelogram
{

    public Square( double x1, double y1, double x2, double y2,
                   double x3, double y3, double x4, double y4 )
    {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
    }
    public String toString()
    /**
     * toString method will be used to obtain the area ond coordinates of the Square by inheriting getArea from Parallelogram
     */
    {
        return "\nCoordinates of Square are: \n" + printCoordinates() +
                "\nSide is: " + getHeight() + "\nArea is: " + getArea();
    }
} // end class Square