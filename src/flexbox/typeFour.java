package flexbox;

/**
 * @author up817852
 */

public class typeFour extends boxType {

    protected boolean bottomReinforcement;

     /**
     * @param boxGrade
     * @param boxColours
     * @param boxSealableTop
     * @param boxBtmReinforcement
     * @param boxLength
     * @param boxWidth
     * @param boxHeight
     * @param boxQuantity
     */
    public typeFour(int boxGrade, int boxColours, boolean boxSealableTop, boolean boxBtmReinforcement, double boxLength, double boxWidth, double boxHeight, double boxQuantity){
        super(boxGrade, boxColours,  boxSealableTop, boxLength, boxWidth,  boxHeight,  boxQuantity);
        bottomReinforcement = boxBtmReinforcement;
    }

    @Override
    /**
     * @return All the boxes attributes
     */
    public String getInfo(){
        String gradeInfo = Integer.toString(grade);         
        String coloursInfo = Integer.toString(colours);         
        String sealTopInfo = Boolean.toString(sealableTop);
        String bottomInfo = Boolean.toString(bottomReinforcement);  
        String qtyInfo = Double.toString(quantity);         
        return "Type Four: \n" + "Grade : " + gradeInfo + "\nColours : " + coloursInfo + "\nSealable Top : " + sealTopInfo + "\nBottom Reinfocement: " + bottomInfo + "\nBox Quantity : " + qtyInfo + "\n \n";   
    }
    
    @Override
    /**
     * @return Price for the bottom reinforcements
     */
    public double calcBottom(){
        return 0.13;
    }
    
    @Override
    /**
     * @return Price for the corner reinforcements
     */
    public double calcCorner(){
        return 0;
    }
}
