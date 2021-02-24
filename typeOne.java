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
public class typeOne extends boxType {

    /**
     * @param grade pipe grade
     * @param colours pipe colour
     * @param resistance pipe has resistance or not
     * @param length pipe length
     * @param radius pipe radius
     * @param quantity amount of pipes to be ordered
     *
     */
    public typeOne(int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity){
        super(int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity);
    }

    /**
     *
     * @return
     */
    @Override
    public String getName(){
        return "Type One \n";
    }

}
