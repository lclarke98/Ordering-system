package flexbox;

/**
 * @author up817852
 */

public class typeFive extends boxType {

     protected boolean bottomReinforcement;
     protected boolean cornerReinforcement;

    /**
     * @param boxGrade
     * @param boxColours
     * @param boxSealableTop
     * @param boxBtmReinforcement
     * @param boxCornerReinforcement
     * @param boxLength
     * @param boxWidth
     * @param boxHeight
     * @param boxQuantity
     */
    public typeFive(int boxGrade, int boxColours, boolean boxSealableTop, boolean boxBtmReinforcement, boolean boxCornerReinforcement, double boxLength, double boxWidth, double boxHeight, double boxQuantity){
        super(boxGrade, boxColours, boxSealableTop, boxLength, boxWidth, boxHeight, boxQuantity);
        bottomReinforcement = boxBtmReinforcement;
        cornerReinforcement = boxCornerReinforcement;
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
        String cornerInfo = Boolean.toString(cornerReinforcement);
        String qtyInfo = Double.toString(quantity);         
        return "Type Five: \n" + "Grade : " + gradeInfo + "\nColours : " + coloursInfo + "\nSealable Top : " + sealTopInfo + "\nBottom Reinforcement : " + bottomInfo + "\nCorner Reinforcement : " + cornerInfo + "\nBox Quantity : " + qtyInfo + "\n \n"; 
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
        return 0.12;
    }

}
