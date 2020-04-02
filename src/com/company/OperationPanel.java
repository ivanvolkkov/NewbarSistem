package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationPanel extends JPanel implements ActionListener {

    public JButton newOrderButton;
    public JButton addToExistingButton;
    public JButton getBillButton;

    public AcademyBarFrame frame;

    public OperationPanel(AcademyBarFrame frame) {
        this.frame = frame;

        newOrderButton = new JButton("NEW ORDER");
        newOrderButton.addActionListener(this);
        add(newOrderButton);

        addToExistingButton = new JButton("ADD TO EXISTING ORDER");
        addToExistingButton.addActionListener(this);
        add(addToExistingButton);

        getBillButton = new JButton("GET BILL");
        getBillButton.addActionListener(this);
        add(getBillButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newOrderButton) {
            newOrderAction();
        } else if(e.getSource() == addToExistingButton) {
            addToExistingOrderAction();
        } else if(e.getSource() == getBillButton) {
            getBillAction();
        }
    }

    public void newOrderAction() {
        frame.showTablesPanel(1);
    }
    public void addToExistingOrderAction() {
        frame.showTablesPanel(2);
    }
    public void getBillAction() {
        frame.showTablesPanel(3);
    }

}
