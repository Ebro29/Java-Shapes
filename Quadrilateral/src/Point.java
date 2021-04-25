/**
 * @author Ebrahim Shahid
 * @version 1.0
 * @since 02-16-2020
 */
//Point class
    public class Point
        /**
         * This will format input of coordinates to be in (X, Y) format as doubles with the toString method
         */
    {
        private double x, y;

        public Point( double xCoordinate, double yCoordinate )
        {
            x = xCoordinate;
            y = yCoordinate;
        }

        public double getX()
        {
            return x;
        }

        public double getY()
        {
            return y;
        }

        public String toString()
        {
            return "( " + getX() + ", " + getY() + " )";
        }
    } // end class Point
