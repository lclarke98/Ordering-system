/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

import java.util.ArrayList;

/**
 *
 * @author up817852
 */
public class flexBox {
    static ArrayList<boxType> boxes = new ArrayList<boxType>();
    static double newPrice = 0;
    static String boxNames = "";
    static double quanity = 0;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        userInterface = new userInterface();
        ui.setVisible(true);
    }

    /**
     *
     * @return names of the pipe in the arraylist
     */
    public static String getBoxNames(){
        pipes.forEach((p) -> {
            boxNames+=p.getName();
        });
        System.out.println(boxNames);
        return boxNames;
    }

    /**
     *  Used to identify the exact box being ordered, if it is present
     *  it returns true or false if the type of box is not possible to be
     *  ordered.
     *
     * @param grade pipe grade
     * @param colours pipe colour
     * @param insulation pipe has insulation or not
     * @param reinforcement pipe has reinforcement or not
     * @param resistance pipe has resistance or not
     * @param length pipe length
     * @param radius pipe radius
     * @return boolean true if the pipe ordered is possible or false if not
     */
     public static boolean addBox(int grade, int colours, boolean sealableTop, boolean bottomReinforcement, boolean cornerReinforcement, double length, double width, double height, double quantity) {

        if (colours == 0){
            boxType box = new TypeOne(grade,colours,sealableTop,length, width, height, quantity);
            pipes.add(box);
            newPrice +=pipe.getPrice();
            System.out.println(pipe.getClass());
            return true;
        }

        if (colours == 1 ) {
            boxType box = new TypeTwo(grade, colours, sealableTop, length, width, height, quantity);
            pipes.add(box);
            newPrice +=pipe.getPrice();
            System.out.println(pipe.getClass());
            return true;
        }

       if (colours== 2 && bottomReinforcement == false) {
            boxType box = new TypeThree(grade, colours, sealableTop, length, width, height, quantity);
            pipes.add(box);
            newPrice +=pipe.getPrice();
            System.out.println(pipe.getClass());
            return true;
        }

        if (bottomReinforcement == true && cornerReinforcement == false) {
            boxType box = new TypeFour(grade, colours, sealableTop, bottomReinforcement, length, width, height, quantity);
            pipes.add(box);
            newPrice +=pipe.getPrice();
            System.out.println(pipe.getClass());
            return true;
        }

        if (bottomReinforcement == true && cornerReinforcement == true) {
            boxType box = new TypeFive(grade, colours, sealableTop, bottomReinforcement,cornerReinforcement, length, width, height, quantity);
            pipes.add(box);
            newPrice +=pipe.getPrice();
            System.out.println(pipe.getClass());
            return true;
        }
         return false;
     }
}
