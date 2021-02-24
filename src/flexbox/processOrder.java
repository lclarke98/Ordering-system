/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author SalimMatazu
 */
public class processOrder {

    userInterface ui;
    DecimalFormat df = new DecimalFormat(".##");
    String error = "";
    double length;
    double width;
    double height;
    int quantity;
    int colours;
    int type;
    int grade;
    boolean bttmInput;
    boolean cornerInput;
    boolean sealTopInput;

    /**
     *
     * @param newUi graphical user interface of the boxes
     */
    public processOrder(userInterface newUi) {
        ui = newUi;
    }

    /**
     * displays dialog showing total boxes ordered
     */
    public void checkOut() {
        JOptionPane.showMessageDialog(new JFrame(), "Thanks for shopping with FlexBox.\nTotal Boxes Ordered:\n" + FlexBox.getBoxInfo() + "Total Cost: £" + df.format(FlexBox.newPrice), "Check Out ", JOptionPane.PLAIN_MESSAGE);
        resetWholeForm();
    }

    /**
     *
     * @return size of the arraylist holding the boxes
     */
    public int getSize() {
        return FlexBox.boxes.size();
    }

    /**
     *
     * @return total price
     */
    public double getNewPrice() {
        return FlexBox.newPrice;
    }

    /**
     * removes texts from the ui
     */
    public void resetForm() {
        ui.lengthInput.setText("");
        ui.heightInput.setText("");
        ui.widthInput.setText("");
        ui.qtyInput.setText("");
        ui.gradeInput.setSelectedIndex(0);
        ui.colorInput.setSelectedIndex(0);
        ui.cornerInput.setSelected(false);
        ui.bttmInput.setSelected(false);
        ui.sealTopInput.setSelected(false);
    }
    
    /**
     * resets the ui
     */
    public void resetWholeForm() {
        FlexBox.newPrice = 0;
        FlexBox.boxes.clear();
        FlexBox.boxNames = " ";
        ui.basketWindow.setText("");
        ui.totalCostWindow.setText("");
        ui.lengthInput.setText("");
        ui.heightInput.setText("");
        ui.widthInput.setText("");
        ui.qtyInput.setText("");
        ui.gradeInput.setSelectedIndex(0);
        ui.colorInput.setSelectedIndex(0);
        ui.cornerInput.setSelected(false);
        ui.bttmInput.setSelected(false);
        ui.sealTopInput.setSelected(false);
    }
    
    /**
     * checks the length the user has entered
     * @return returns true if the user has entered a whole numbers
     */
    public boolean verifyLength() {
        if (ui.lengthInput.getText().equals("")) {
            error += "Length of box not specified! \n";
            return false;
        } else {
            try {
                length = Double.parseDouble(ui.lengthInput.getText());
            } catch (NumberFormatException e) {
                error += "Length of box must be a number! \n";
                return false;
            }

            if (length > 5 || length <= 0) {
                error += "box length must be between 1 and 5 meters! \n";
                return false;
            }
        }
        return true;
    }
    
    /**
     * checks the width the user has entered
     * @return returns true if the user has entered a whole numbers
     */
    public boolean verifyWidth() {
        if (ui.widthInput.getText().equals("")) {
            error += "Width of box not specified! \n";
            return false;
        } else {

            try {
                width = Double.parseDouble(ui.widthInput.getText());
            } catch (NumberFormatException e) {
                error += "Width of box must be a number! \n";
                return false;
            }

            if (width <= 0) {
                error += "Width must be greater 0 \n";
                return false;
            }
        }
        return true;
    }
    
    /**
     * checks the height the user has entered
     * @return returns true if the user has entered a whole number
     */
    public boolean verifyHeight() {
        if (ui.heightInput.getText().equals("")) {
            error += "Height of box not specified! \n";
            return false;
        } else {

            try {
                height = Double.parseDouble(ui.heightInput.getText());
            } catch (NumberFormatException e) {
                error += "Height of box must be a number! \n";
                return false;
            }

            if (height <= 0) {
                error += "Height must be greater 0 \n";
                return false;
            }
        }
        return true;
    }
    
    /**
     * checks the quantity the user has entered
     * @return returns true if the user has entered a whole number
     */
    public boolean verifyQty() {
        if (ui.qtyInput.getText().equals("")) {
            error += "Quantity of box not specified! \n";
            return false;
        } else {

            try {
                quantity = Integer.parseInt(ui.qtyInput.getText());
            } catch (NumberFormatException e) {
                error += "Quantity must be a whole number! \n";
                return false;
            }
        }

        if (quantity <= 0) {
            error += "Quantity must be greater than 0! \n";
            return false;
        }
        return true;
    }
    
    /**
     * Gives the user a message if their order was rejected
     */
    public void gradeOptions() {
        switch (grade) {
            case 1:
                error += "Grade 1 cannot have colors or reinforcements\n";
                break;
            case 2:
                error += "Grade 2 cannot have corner reinforcement and must have 1 color\n";
                break;
            case 3:
                error += "Grade 3 must have at leat 1 color";
                break;
            case 4:
                error += "Grade 4 must have atleast 1 color\n";
                break;
            case 5:
                error += "Grade 5 must have 2 color prints\n";
                break;
            default:
                break;
        }
    }
    
    /**
     * Finds the right box type for the box the customer is ordering
     * @return returns true if an appropriate box type can be found
     */
    public boolean verifyBox() {
        colours = Integer.parseInt(String.valueOf(ui.colorInput.getSelectedItem()));
        grade = Integer.parseInt(String.valueOf(ui.gradeInput.getSelectedItem()));
        bttmInput = ui.bttmInput.isSelected();
        cornerInput = ui.cornerInput.isSelected();
        if (grade >= 1 && grade <= 3 && colours == 0 && bttmInput == false && cornerInput == false) {
            type = 1;
            return true;
        }
        if (grade >= 2 && grade <= 4 && colours == 1 && bttmInput == false && cornerInput == false) {
            type = 2;
            return true;
        }
        if (grade >= 2 && grade <= 5 && colours == 2 && bttmInput == false && cornerInput == false) {
            type = 3;
            return true;
        }
        if (grade >= 2 && grade <= 5 && colours == 2 && bttmInput == true && cornerInput == false) {
            type = 4;
            return true;
        }
        if (grade >= 3 && grade <= 5 && colours == 2 && bttmInput == true && cornerInput == true) {
            type = 5;
            return true;
        }
        gradeOptions();
        return false;
    }
    
    /**
     * Verifies order before it is created
     * @return returns true and creates the instance if all inputs are correct
     */
    public boolean submit() {
        grade = Integer.parseInt(String.valueOf(ui.gradeInput.getSelectedItem()));
        sealTopInput = ui.sealTopInput.isSelected();
        bttmInput = ui.bttmInput.isSelected();
        cornerInput = ui.cornerInput.isSelected();
        if (verifyHeight() == false) {
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (verifyLength() == false) {
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (verifyWidth() == false) {
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (verifyQty() == false) {
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (verifyBox() == false) {
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            FlexBox.addBox(grade, colours, sealTopInput, bttmInput, cornerInput, length, width, height, quantity, type);
            return true;
        }

    }

}
