package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductPanel extends JPanel implements ActionListener {
    AcademyBarFrame frame;
    JButton product1Button;
    JButton product2Button;
    JButton product3Button;
    Product product;
    Order order;
    JButton applyButton;
    JButton eraseButton;


    public ProductPanel(AcademyBarFrame frame){
        this.frame = frame;
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

        applyButton = new JButton( "Apply");
        add(applyButton);
        applyButton.addActionListener(this);

        eraseButton = new JButton("Erase");
        add(eraseButton);
        eraseButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== product1Button){
            order.products.add(frame.products.get(0));
        }
        else if(e.getSource()== product2Button){
            order.products.add(frame.products.get(1));
        }
        else if(e.getSource()== product3Button){
            order.products.add(frame.products.get(2));
        }


        else if (e.getSource() == applyButton){
            int result = JOptionPane.showConfirmDialog(null,"You want to add"+ order.products.toString() + "to table :" + order.tableNumber + "?",
                    "Confirmation pop up",JOptionPane.YES_NO_OPTION);

            if ( result == JOptionPane.YES_OPTION){
                frame.orders.add(order);
            }
            else{
                remove(order);
            }
        }

        else if (e.getSource() == eraseButton){
            int result = JOptionPane.showConfirmDialog(null,"You want to clear product list for table : "+ order.tableNumber +"?","confirm",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                order.products.clear();
            }
        }


    }

    private void remove(Order order) {
        remove(order);
    }

}
