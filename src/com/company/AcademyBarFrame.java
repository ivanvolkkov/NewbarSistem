package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class AcademyBarFrame extends JFrame {

    public LoginPanel loginPanel;
    public OperationPanel operationPanel;
    public ChooseTable tablesPanel;
    public ProductPanel productPanel;

    public ArrayList<Order> orders = new ArrayList<>();
    public ArrayList<Waitress> waitresses = new ArrayList<>();
    public ArrayList<Product> products = new ArrayList<>();
    public Waitress currentWaitress;

    public AcademyBarFrame() {
        super("Academy Bar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        showLoginPanel();
    }

    public void showLoginPanel() {
        loginPanel = new LoginPanel(this);
        loginPanel.setSize(getWidth(), getHeight());
        add(loginPanel);
    }

    public void showOperationPanel() {
        loginPanel.setVisible(false);
        remove(loginPanel);

        operationPanel = new OperationPanel(this);
        operationPanel.setSize(getWidth(), getHeight());
        add(operationPanel);
    }

    public void showTablesPanel(int selectedOperation) {
        operationPanel.setVisible(false);
        remove(operationPanel);

        tablesPanel = new ChooseTable(this);
        tablesPanel.selectedOperation = selectedOperation;
        tablesPanel.setSize(getWidth(), getHeight());
        add(tablesPanel);
    }
    public void showProductPanel(){
        tablesPanel.setVisible(false);
        remove(tablesPanel);

        productPanel = new ProductPanel(this);
        productPanel.setSize(getWidth(),getHeight());
        add(productPanel);

    }
}
