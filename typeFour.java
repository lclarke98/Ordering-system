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
public class typeFour extends boxType {

    /**
     *
     */
    protected boolean bottomReinforcement;

    /**
     *@param grade pipe grade
     * @param colours pipe colour
     * @param insulation pipe has insulation or not
     * @param resistance pipe has resistance or not
     * @param length pipe length
     * @param radius pipe radius
     * @param quantity amount of pipes to be ordered
     *
     */
    public typeFour(int boxGrade, int boxColours, boolean boxSealableTop, boxBtmReinforcement, double boxLength, double boxWidth, double boxHeight, double boxQuantity){
        super(int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity);
        bottomReinforcement = boxBtmReinforcement;
    }




    /**
     *
     * @return name of pipe
     */
    @Override
    public String getName(){
        return "Type Four \n";
    }
}
