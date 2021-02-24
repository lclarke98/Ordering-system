/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

/**
 *
 * @author up817852
 */
public class typeFive extends boxType {

    /**
     *
     */

    /**
     *
     */
     protected boolean bottomReinforcement;
     protected boolean cornerReinforcement;

    /**
     * @param grade pipe grade
     * @param colours pipe colour
     * @param insulation pipe has insulation or not
     * @param reinforcement pipe has reinforcement or not
     * @param resistance pipe has resistance or not
     * @param length pipe length
     * @param radius pipe radius
     * @param quantity amount of pipes to be ordered
     *
     */
    public typeFive(int boxGrade, int boxColours, boolean boxSealableTop, boxBtmReinforcement, boxCornerReinforcement, double boxLength, double boxWidth, double boxHeight, double boxQuantity){
        super(int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity);
        bottomReinforcement = boxBtmReinforcement;
        cornerReinforcement = boxCornerReinforcement;
    }




    /**
     *
     * @return name of type
     */
    @Override
    public String getName(){
        return "Type Five \n";
    }


}
