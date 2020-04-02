package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseTable extends JPanel implements ActionListener {

    public AcademyBarFrame frame;

    public JButton table1Button;
    public JButton table2Button;
    public JButton table3Button;

    public int selectedOperation;

    public ChooseTable(AcademyBarFrame frame) {
        this.frame = frame;

        table1Button = new JButton("10");
        table1Button.addActionListener(this);
        add(table1Button);

        table2Button = new JButton("20");
        table2Button.addActionListener(this);
        add(table2Button);

        table3Button = new JButton("30");
        table3Button.addActionListener(this);
        add(table3Button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String tableNumberString = ((JButton)e.getSource()).getText();
        int tableNumer = Integer.parseInt(tableNumberString);

        boolean isOrderFound = false;
        for(Order order : frame.orders) {
            if(order.tableNumber == tableNumer) {
                System.out.println("Намерих поръчка");
                isOrderFound = true;
                orderFoundAction();
                break;
            }
        }

        if(isOrderFound == false) {
            System.out.println("Nqma pory4ka na tazi masa v momenta");
            orderNotFoundAction(tableNumer);
        }

    }

    //
    public void orderFoundAction() {
        //New order 1 -> Изкарвам попъп и му казвам, че вече има поръчка - DONE
        //Existing 2 -> Минавам на следващият екран
        //Get bill 3 -> Минавам на следващият екран
        if(selectedOperation == 1) {
            System.out.println("New Order");
            JOptionPane.showMessageDialog(null,"This table already has order","Error",JOptionPane.ERROR_MESSAGE);
        } else if(selectedOperation == 2) {
            System.out.println("Add to existing");
            frame.showProductPanel();
        } else {
            System.out.println("Get bill");
            //frame.showGetBillPanel();
        }
    }
    public void orderNotFoundAction(int tableNumber) {
        //New order 1 -> Създам една нова поръчка и да я добавя в масива с поръчки да мина на следващият екран
        //Existing 2 -> Трябва да му покажа попъп, че няма поръчка, която да продължи на тази маса и съответно да го попитам дали иска да направи нова поръчка
        //Get bill 3 -> Попъп, че няма поръчка на тази маса и не може да се вади сметката
        if(selectedOperation == 1) {
            System.out.println("New Order");
            Order newOrder = new Order(tableNumber, frame.currentWaitress);
            frame.orders.add(newOrder);
            frame.showProductPanel();
        } else if(selectedOperation == 2) {
            System.out.println("Add to existing");
            int result = JOptionPane.showConfirmDialog(null,"There is no order for this table, would like to create a new one?","Warning",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION) {
                Order newOrder = new Order(tableNumber, frame.currentWaitress);
                frame.orders.add(newOrder);
                frame.showProductPanel();
            }
        } else {
            System.out.println("Get bill");
            JOptionPane.showMessageDialog(null,"There is no order for this table!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

}
