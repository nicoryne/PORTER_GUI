import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LeapYearChecker extends JFrame{

    private JButton btnCheckYear;
    private JTextField tfYear;
    private JPanel panelLeapYear;


    public LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = 0;
                try {
                    year = Integer.parseInt(tfYear.getText());
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(panelLeapYear, "Please enter a valid input!");
                    return;
                }
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    JOptionPane.showMessageDialog(panelLeapYear, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(panelLeapYear, "Not a leap year");

                }


            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.panelLeapYear);
        app.setSize(400, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }

}
