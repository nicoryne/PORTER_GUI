import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {

    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel panelFoodOrderingSystem;

    public FoodOrderingSystem() {


        btnOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double discount = 0;
                double price = 0;

                if(cPizza.isSelected()) {
                    price += 100;
                }

                if(cBurger.isSelected()) {
                    price += 80;
                }

                if(cFries.isSelected()) {
                    price += 65;
                }

                if(cSoftDrinks.isSelected()) {
                    price += 55;
                }

                if(cTea.isSelected()) {
                    price += 50;
                }

                if(cSundae.isSelected()) {
                    price += 40;
                }

                if(rbNone.isSelected()) {
                    discount = 0;
                }

                if(rb5.isSelected()) {
                    discount = 0.05;
                }

                if(rb10.isSelected()) {
                    discount = 0.1;
                }

                if(rb15.isSelected()) {
                    discount = 0.15;
                }

                price -= (discount * price);

                JOptionPane.showMessageDialog(panelFoodOrderingSystem, "The total price is Php " + price);
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.panelFoodOrderingSystem);
        app.setSize(600, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
