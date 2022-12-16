package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel pnlFoodOrder;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    static class selectFoodException extends Exception {
        public selectFoodException (){
            super();
        }
    }
    static class selectDiscountException extends Exception {
        public selectDiscountException (){
            super();
        }
    }
    public FoodOrderGUI() throws Exception{
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (!cPizza.isSelected() && !cBurger.isSelected() && !cFries.isSelected() &&
                        !cSoftDrinks.isSelected() && !cTea.isSelected() && !cSundae.isSelected()){
                        throw (new selectFoodException());
                    }
                    if (!rbNone.isSelected() && !rb5.isSelected() && !rb10.isSelected() && !rb15.isSelected()){
                        throw (new selectDiscountException());
                    }
                        computeOrder();

                }catch (selectFoodException a) {
                    JOptionPane.showMessageDialog(pnlFoodOrder, "Please select your Food order");
                }catch (selectDiscountException a){
                    JOptionPane.showMessageDialog(pnlFoodOrder, "Please select your Discount");
                }catch (Exception a){
                    JOptionPane.showMessageDialog(pnlFoodOrder, "Select your order");
                }
            }
        });
        rbNone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbNone.isSelected()){
                    rb5.setSelected(false);
                    rb10.setSelected(false);
                    rb15.setSelected(false);
                }
            }
        });
        rb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb5.isSelected()){
                    rbNone.setSelected(false);
                    rb10.setSelected(false);
                    rb15.setSelected(false);
                }
            }
        });
        rb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb10.isSelected()){
                    rbNone.setSelected(false);
                    rb5.setSelected(false);
                    rb15.setSelected(false);
                }
            }
        });
        rb15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb15.isSelected()){
                    rbNone.setSelected(false);
                    rb5.setSelected(false);
                    rb10.setSelected(false);
                }
            }
        });
    }
    public static void main(String[] args) throws Exception{
        FoodOrderGUI foodOrder = new FoodOrderGUI();
        foodOrder.setContentPane(foodOrder.pnlFoodOrder);
        foodOrder.setSize(600,450);
        foodOrder.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodOrder.setVisible(true);
        foodOrder.setTitle("Food Ordering System");
    }

    public void computeOrder(){
        double total = 0;
        int subTotal = 0;
        String formattedValue;

        if(cPizza.isSelected()){
            subTotal += 100;
        }

        if(cBurger.isSelected()){
            subTotal += 80;
        }

        if(cFries.isSelected()){
            subTotal += 65;
        }

        if(cSoftDrinks.isSelected()){
            subTotal += 55;
        }

        if(cTea.isSelected()){
            subTotal += 50;
        }

        if(cSundae.isSelected()){
            subTotal += 40;
        }

        if(rbNone.isSelected()){
            JOptionPane.showMessageDialog(pnlFoodOrder, "The total price is Php " + subTotal);
        }else if(rb5.isSelected()){
            total = subTotal- (subTotal*0.05);
            formattedValue = String.format("%.2f", total);
            JOptionPane.showMessageDialog(pnlFoodOrder,"The total price is Php " + formattedValue);
        }else if(rb10.isSelected()){
            total = subTotal- (subTotal*0.10);
            formattedValue = String.format("%.2f", total);
            JOptionPane.showMessageDialog(pnlFoodOrder,"The total price is Php " + formattedValue);
        }else if(rb15.isSelected()){
            total = subTotal- (subTotal*0.15);
            formattedValue = String.format("%.2f", total);
            JOptionPane.showMessageDialog(pnlFoodOrder,"The total price is Php " + formattedValue);
        }
    }
}
