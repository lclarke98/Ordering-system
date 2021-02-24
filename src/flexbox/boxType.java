package flexbox;

/**
 * @author up817852
 */

abstract class boxType  {
    protected int grade, colours;
    protected boolean sealableTop;
    protected double length, width, height, cost, quantity,baseCost,addCost,surfaceArea;
    
    /**
     * @param boxGrade
     * @param boxColours
     * @param boxSealableTop
     * @param boxLength
     * @param boxWidth
     * @param boxHeight
     * @param boxQuantity
     */
    public boxType (int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity) {
        grade = boxGrade;
        colours = boxColours;
        sealableTop = boxSealableTop;
        length = boxLength;
        width = boxWidth;
        height = boxHeight;
        quantity = boxQuantity;
    }

    public double getPrice() {
        return cost;
    }
    
    public double calculateSurfaceArea(double length, double width, double height)
    {
        surfaceArea = 2*((height*length) + (height*width)+(length*width));
        return surfaceArea;
        
    }
    
    public double calculateBaseCost() {
        surfaceArea = calculateSurfaceArea(length, width, height);
        double gradeCosts[] = {0.55, 0.65, 0.82, 0.98, 1.5};

        baseCost = surfaceArea * gradeCosts[grade-1];
        return baseCost;
    }
        
    public double calcAddCost(){    

        addCost += ((sealableTop) ? 1 : 0) * 0.10 * baseCost;

        switch (colours) {
            case 1:
                addCost += 0.12 * baseCost;
                break;
            case 2:
                addCost += 0.15 * baseCost;
                break;
            default : break;
        }
        return addCost;
    } 
    
    public double calculateCost(){
        return (calculateBaseCost()+calcAddCost())* quantity;
    }
    
    abstract double calcBottom ();
    
    abstract double calcCorner ();                     
    
    abstract String getInfo();
}
