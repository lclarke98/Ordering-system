package flexbox;

import java.util.ArrayList;

/**
 * @author up817852
 */

public class FlexBox {
    static ArrayList<boxType> boxes = new ArrayList<boxType>();
    static double newPrice = 0;
    static String boxNames = "";
    static double quanity = 0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        userInterface ui = new userInterface();
        ui.setVisible(true);
    }

    /**
     * @return info of the box in the ArrayList
     */
    public static String getBoxInfo(){
        boxes.forEach((p) -> {
            boxNames+=p.getInfo();
        });
        System.out.println(boxNames);
        return boxNames;
    }

    /**
     * @param grade
     * @param colours
     * @param sealableTop
     * @param bottomReinforcement
     * @param cornerReinforcement
     * @param length
     * @param width
     * @param height
     * @param quantity
     * @param type
     */
     public static void addBox(int grade, int colours, boolean sealableTop, boolean bottomReinforcement, boolean cornerReinforcement, double length, double width, double height, double quantity,int type) {

        if (type == 1){
            boxType box = new typeOne(grade,colours,sealableTop,length, width, height, quantity);
            boxes.add(box);
            newPrice += box.calculateCost();
            System.out.println(box.getClass());
        }

        else if (type == 2) {
            boxType box = new typeTwo(grade, colours, sealableTop, length, width, height, quantity);
            boxes.add(box);
            newPrice += box.calculateCost();
            System.out.println(box.getClass());
        }

        else if (type == 3 ) {
            boxType box = new typeThree(grade, colours, sealableTop, length, width, height, quantity);
            boxes.add(box);
            newPrice += box.calculateCost();
            System.out.println(box.getClass());
        }

        else if (type == 4) {
            boxType box = new typeFour(grade, colours, sealableTop, bottomReinforcement, length, width, height, quantity);
            boxes.add(box);
            newPrice += box.calculateCost() + (box.calcBottom() * box.calculateBaseCost());
            System.out.println(box.getClass());
        }

        else if (type == 5) {
            boxType box = new typeFive(grade, colours, sealableTop, bottomReinforcement,cornerReinforcement, length, width, height, quantity);
            boxes.add(box);
            newPrice += box.calculateCost() + (box.calcBottom() * box.calculateBaseCost())+ (box.calcCorner() * box.calculateBaseCost());
            System.out.println(box.getClass());
        }
        
     }
}