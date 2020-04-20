package company.vanolincikus.panels;

import company.vanolincikus.models.*;

import javax.swing.*;
import java.awt.event.*;

public class GetBillPanel extends JPanel implements ActionListener {

    private AcademyBarFrame frame;
    public Order order;
    public JLabel priceLable;
    public JButton okButton;

    public GetBillPanel(AcademyBarFrame frame, Order order){
        this.frame = frame;
        this.order = order;
        //
        priceLable = new JLabel(this.order.printBill());
        add(priceLable);
        //
        okButton = new JButton("Ok");
        okButton.addActionListener( this);
        add(okButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.getOrders().remove(0);
        frame.showLoginPanel();
        //order.remove();
       // frame.repaint();
    }

}
