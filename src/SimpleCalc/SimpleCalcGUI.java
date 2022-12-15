package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlCalculator;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI cal = new SimpleCalcGUI();
        cal.setContentPane(cal.pnlCalculator);
        cal.setSize(550,300);
        cal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cal.setVisible(true);
        cal.setTitle("Simple Calculator");
    }
}
