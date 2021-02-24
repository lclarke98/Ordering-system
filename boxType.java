/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinegui;

/**
 *
 * @author up817852
 */


abstract class boxType  {
    protected int grade, colours;
    protected boolean sealableTop;
    protected double length, width, height, price, quantity;

    public boxType (int boxGrade, int boxColours, boolean boxSealableTop, double boxLength, double boxWidth, double boxHeight, double boxQuantity) {
        grade = boxGrade;
        colours = boxColours;
        sealableTop = boxSealableTop;
        length = boxLength* 39.37;
        width = boxWidth;
        height = boxHeight;
        quantity = boxQuantity;
        double surfaceArea = 0; // add method
        price = calculatePrice(surfaceArea);
    }

    public int getGrade(){
        return grade;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

     public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public int getColours() {
        return colours;
    }

    public void setColours(int newColours) {
        colours = newColours;
    }


    public boolean isSealTop() {
        return sealableTop;
    }

    public void setSealTop(boolean newSealableTop) {
        sealableTop = newSealableTop;
    }

    public double calculatePrice(double surfaceArea) {

        double gradeCosts[] = {0.00, 0.40, 0.60, 0.75, 0.80, 0.95};

        double basePrice = volume * gradeCosts[grade];
        double boxPrice = basePrice;

        pipePrice += ((sealableTop) ? 1 : 0) * 0.14 * basePrice;

        switch (colours) {
            case 1:
                pipePrice += 0.12 * basePrice;
                break;
            case 2:
                pipePrice += 0.16 * basePrice;
                break;
            default : break;
        }

        boxPrice *= 100;
        boxPrice = Math.round(pipePrice);
        boxPrice = (double)pipePrice / (double)100;

        return boxPrice * quantity;
    }

    abstract String getName();

}
