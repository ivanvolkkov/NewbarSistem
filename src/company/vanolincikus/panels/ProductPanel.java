package company.vanolincikus.panels;

import company.vanolincikus.models.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductPanel extends JPanel implements ActionListener {
    public AcademyBarFrame frame;
    JButton product1Button;
    JButton product2Button;
    JButton product3Button;
    public Order order;
    public JButton applyButton;
    public JButton eraseButton;


    public ProductPanel(AcademyBarFrame frame, Order order) {
        this.frame = frame;
        this.order = order;

        setLayout(new FlowLayout());

        product1Button = new JButton(frame.products.get(0).name);
        add(product1Button);
        product1Button.addActionListener(this);

        product2Button = new JButton(frame.products.get(1).name);
        add(product2Button);
        product2Button.addActionListener(this);

        product3Button = new JButton(frame.products.get(2).name);
        add(product3Button);
        product3Button.addActionListener(this);

        applyButton = new JButton("Apply");
        add(applyButton);
        applyButton.addActionListener(this);

        eraseButton = new JButton("Erase");
        add(eraseButton);
        eraseButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == product1Button) {
            order.products.add(frame.products.get(0));
        }
        if (e.getSource() == product2Button) {
            order.products.add(frame.products.get(1));
        }
        if (e.getSource() == product3Button) {
            order.products.add(frame.products.get(2));
        }
        if (e.getSource() == applyButton) {
            int result = JOptionPane.showConfirmDialog(null, "You want to add" + order.products.toString() + "to table :" + order.tableNumber + "?",
                    "Confirmation pop up", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
//                frame.orders.add(order);

                frame.productPanel.setVisible(false);
                remove(frame.productPanel);
                frame.showLoginPanel();
            }
        }
        if (e.getSource() == eraseButton) {
            int result = JOptionPane.showConfirmDialog(null, "You want to clear product list for table : " + order.tableNumber + "?", "confirm", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                order.products.clear();
            }
        }else{

        }


    }


}
