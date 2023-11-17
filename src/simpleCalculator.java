import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleCalculator extends JFrame {
    private JButton btnCompute;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JPanel panelCalculator;
    private JTextField label1stNumber;
    private JLabel tf1stNumber;
    private JLabel label2ndNumber;
    private JLabel labelResult;

    public simpleCalculator() {


        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first_num = 0;
                double second_num = 0;
                try {
                    first_num = Double.parseDouble(tfNumber1.getText());
                    second_num = Double.parseDouble(tfNumber2.getText());
                } catch (Exception f){
                    JOptionPane.showMessageDialog(panelCalculator, "Please enter a valid input!");
                    return;
                }

                if(cbOperations.getSelectedIndex() == 0) {
                    //ADDITION
                    label1stNumber.setText(String.valueOf(first_num + second_num));
                } else if(cbOperations.getSelectedIndex() == 1) {
                    //SUBTRACTION
                    label1stNumber.setText(String.valueOf(first_num - second_num));
                } else if(cbOperations.getSelectedIndex() == 2) {
                    //MULTIPLICATION
                    label1stNumber.setText(String.valueOf(first_num * second_num));
                } else if(cbOperations.getSelectedIndex() == 3) {
                    //DIVISION
                    if(second_num == 0) {
                        JOptionPane.showMessageDialog(panelCalculator, "Invalid divisor");
                    } else {
                        label1stNumber.setText(String.valueOf(first_num / second_num));
                    }
                } else {
                    JOptionPane.showMessageDialog(panelCalculator, "Please select a valid operation!");
                }
            }
        });
    }

    public static void main(String[] args) {
        simpleCalculator app = new simpleCalculator();
        app.setContentPane(app.panelCalculator);
        app.setSize(800, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
