package FoodOrdering;

import javax.swing.*;

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

    public static void main(String[] args) {
        FoodOrderGUI foodOrder = new FoodOrderGUI();
        foodOrder.setContentPane(foodOrder.pnlFoodOrder);
        foodOrder.setSize(600,450);
        foodOrder.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodOrder.setVisible(true);
        foodOrder.setTitle("Food Ordering System");
    }
}
