package flexbox;

/**
 *
 * @author up817852
 */
public class typeTwo extends boxType{

    /**
     *@param grade pipe grade
     * @param colours pipe colour
     * @param resistance pipe has resistance or not
     * @param length pipe length
     * @param radius pipe radius
     * @param quantity amount of pipes to be ordered
     */
    public typeTwo(int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity){
        super(int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity);
    }

    /**
     *
     * @return name of pipe
     */
    @Override
    public String getName(){
        return "Type Two \n";
    }
}
