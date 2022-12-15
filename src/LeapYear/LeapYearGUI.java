package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computeLeapYear();
            }
        });
    }

    public void computeLeapYear(){
        int year = Integer.parseInt(tfYear.getText());
        if((year%4 == 0 && year%100 != 0) || year%400 == 0){
            JOptionPane.showMessageDialog(panel1, "Leap Year");
        }else{
            JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        LeapYearGUI leapYear = new LeapYearGUI();
        leapYear.setContentPane(leapYear.panel1);
        leapYear.setSize(500,300);
        leapYear.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapYear.setVisible(true);
        leapYear.setTitle("Leap Year Checker");
    }
}


