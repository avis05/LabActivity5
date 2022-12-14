package LeapYear;

import javax.swing.*;
import java.awt.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI leapYear = new LeapYearGUI();
        leapYear.setContentPane(leapYear.panel1);
        leapYear.setSize(500,300);
        leapYear.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapYear.setVisible(true);
        leapYear.setTitle("Leap Year Checker");
    }
}


