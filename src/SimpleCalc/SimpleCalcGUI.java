package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlCalculator;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;
    public SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    compute();
                }
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI cal = new SimpleCalcGUI();
        cal.setContentPane(cal.pnlCalculator);
        cal.setSize(550,300);
        cal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cal.setVisible(true);
        cal.setTitle("Simple Calculator");
    }
    public void compute(){
        String selectedOp = Objects.requireNonNull(cbOperations.getSelectedItem()).toString();
        int num1 = Integer.parseInt(tfNumber1.getText());
        int num2 = Integer.parseInt(tfNumber2.getText());
        int result = 0;

        switch (selectedOp){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        lblResult.setText(String.valueOf(result));
    }
}
