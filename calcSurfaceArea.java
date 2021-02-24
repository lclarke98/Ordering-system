
/**
 * Write a description of class calcSurfaceArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calcSurfaceArea
{
    // instance variables - replace the example below with your own
    public int surfaceArea;

    /**
     * Constructor for objects of class calcSurfaceArea
     */
    public calcSurfaceArea()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int calculateSurfaceArea(int length, int width, int height)
    {
        surfaceArea = (2*(height*length + height*width+length*width));
        System.out.println(surfaceArea);
        return surfaceArea;
    }
}
