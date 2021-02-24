/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SalimMatazu
 */
public class Controller {
    userInterface ui;

    /**
     *
     * @param ui graphical user interface of the pipe
     */
    public Controller(userInterface newUi){
        ui = newUi;
    }

    /**
     * displays dialog showing total pipes ordered
     */
    public void checkOut(){
        JOptionPane.showMessageDialog(new JFrame(), "Thanks for shopping with FlexBox.\nTotal Boxes Ordered:\n"+flexBox.getBoxNames()+flexBox.newPrice, "Check Out ", JOptionPane.PLAIN_MESSAGE);
        resetWholeForm();
    }

    /**
     *
     * @return size of the arraylist holding the pipes
     */
    public Integer getSize(){
       return flexBox.pipes.size();
    }

    /**
     *
     * @return total price
     */
    public Double getNewPrice(){
        return flexBox.newPrice;
    }

    /**
     * removes texts from the gui
     */
    public void resetForm(){
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

     public void resetWholeForm(){
        flexBox.newPrice = 0;
        flexBox.pipes.clear();
        flexBox.pipeNames = " ";
        ui.textCart.setText("");
        ui.textCost.setText("");
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
     * handles and validates  all inputs for the gui
     */
    public void validateInputs(){
        String error = "";
        double length = 0;
        double width = 0;
        double height = 0;
        int quantity = 0;
        int colours;
        int grade = Integer.parseInt(String.valueOf(ui.gradeInput.getSelectedItem()));
        if (String.valueOf(ui.colorInput.getSelectedItem()).equalsIgnoreCase("none")){
            colours = 0;
        }
        else {
            colours = Integer.parseInt(String.valueOf(ui.colorInput.getSelectedItem()));
        }
        boolean sealTopInput = ui.checkInner.isSelected();
        boolean bttmInput = ui.checkOuter.isSelected();
        boolean cornerInput = ui.checkRes.isSelected();


        if (ui.lengthInput.getText().equals("")){
            error += "Length of box not specified! \n";
        }
        else{
            try {
                length = Double.parseDouble(ui.lengthInput.getText());
            } catch (NumberFormatException e){
                error += "Length of box must be a number! \n";
            }

            if (length > 6 || length <= 0){
                error += "box length must be between 1 and 6 meters! \n";
            }
        }


        if (ui.widthInput.getText().equals("")){
            error += "Width of box not specified! \n";
        }
        else {

            try {
                width = Double.parseDouble(ui.widthInput.getText());
            } catch (NumberFormatException e){
                error += "Width of box must be a number! \n";
            }

            if (width <= 0){
                error += "Width must be greater 0 \n";
            }
        }
        ////////////////////////////////////////////////////////////////////////
        if (ui.heightInput.getText().equals("")){
            error += "Height of box not specified! \n";
        }
        else {

            try {
                height = Double.parseDouble(ui.heightInput.getText());
            } catch (NumberFormatException e){
                error += "Height of box must be a number! \n";
            }

            if (height <= 0){
                error += "Height must be greater 0 \n";
            }
        }

        if (ui.qtyInput.getText().equals("")){
            error += "Quantity of box not specified! \n";
        }
        else {

            try {
                quantity = Integer.parseInt(ui.qtyInput.getText());
            } catch (NumberFormatException e){
                error += "Quantity must be a whole number! \n";
            }
        }

        if (quantity <= 0){
                error += "Quantity must be greater than 0! \n";
        }


        if (!error.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);

        }

        else {
            if(!PipeModel.addBox(grade, colours, sealTopInput,  bottmInput cornerInput, length, width, height,  quantity)) {
                JOptionPane.showMessageDialog(new JFrame(), "Box type cannot be ordered! \nTry different inputs.", "Invalid box", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(new JFrame(), "Box successfully added to order!", "Box added", JOptionPane.PLAIN_MESSAGE);
            }
        }



    }

}
