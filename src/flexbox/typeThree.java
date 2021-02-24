package flexbox;

/**
 * @author up817852
 */

public class typeThree extends boxType{
    
     /**
     * @param boxGrade
     * @param boxColours
     * @param boxSealableTop
     * @param boxLength
     * @param boxWidth
     * @param boxHeight
     * @param boxQuantity
     */

    public typeThree(int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity){
        super(boxGrade, boxColours, boxSealableTop, boxLength, boxWidth, boxHeight, boxQuantity);
    }
    
    @Override
    /**
     * @return All the boxes attributes
     */
    public String getInfo(){
        String gradeInfo = Integer.toString(grade);         
        String coloursInfo = Integer.toString(colours);         
        String sealTopInfo = Boolean.toString(sealableTop);         
        String qtyInfo = Double.toString(quantity);         
        return "Type Three: \n" + "Grade : " + gradeInfo + "\nColours : " + coloursInfo + "\nSealable Top : " + sealTopInfo + "\nBox Quantity : " + qtyInfo + "\n \n";   
    }
    
    @Override
    /**
     * @return Price for the bottom reinforcements
     */
    public double calcBottom(){
        return 0;
    }
    
    @Override
    /**
     * @return Price for the corner reinforcements
     */
    public double calcCorner(){
        return 0;
    }
}
