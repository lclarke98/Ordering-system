import java.util.*;
/**
 * Write a description of class Box here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Box
{
    // instance variables - replace the example below with your own
    private int width, length, height, grade, color, type, qty;
    private boolean corner, bottom, sealable;
    public int surfaceArea, newType;

    /**
     * Constructor for objects of class Box
     */
    public Box(int boxWidth, int boxLength, int boxHeight, int boxGrade, int numColor, int boxType, int orderQty, boolean cornerReinfocement, boolean bottomReinfocement, boolean boxSealable)
    {
        width = boxWidth;
        length = boxLength;
        height = boxHeight;
        grade = boxGrade;
        color = numColor;
        type = boxType;
        qty = orderQty;
        corner = cornerReinfocement;
        bottom = bottomReinfocement;
        sealable = boxSealable;
    }
    
    public int getSurfaceArea(){
        calcSurfaceArea ord1 = new calcSurfaceArea();
        surfaceArea = ord1.calculateSurfaceArea(length,width,height);
        return surfaceArea; // check this later
    }
    
    public int getBoxType(){
        boxType type = new boxType();
        newType = type.calculateBoxType(color, bottom, corner);
        updateType();
        return newType;
    }
    
    public void process(){
        getSurfaceArea();
        getBoxType();
    }
    
    public void updateType(){
        type = newType;
    }
}
