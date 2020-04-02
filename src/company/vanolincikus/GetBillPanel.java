package company.vanolincikus;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GetBillPanel extends JPanel implements ActionListener {
    public AcademyBarFrame frame;
    public Order order;
    public JLabel priceLable;
    public JButton okButton;

    public GetBillPanel(AcademyBarFrame frame, Order order){
        this.frame = frame;
        this.order = order;


        priceLable = new JLabel(this.order.printBill());
        add(priceLable);

        okButton = new JButton("Ok");
        okButton.addActionListener( this);
        add(okButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        frame.getBillPanel.setVisible(false);
        remove(frame.getBillPanel);
        order.products.clear();
        frame.showOperationPanel();
    }


}
