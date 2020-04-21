package company.vanolincikus.panels;

import javax.swing.*;
import javax.swing.table.*;





public class AdminPanel extends JPanel {
    AcademyBarFrame frame;
    public JTable table;
    public DefaultTableModel tableModel;

    public AdminPanel(AcademyBarFrame frame){
        this.frame = frame;


        table = new JTable();
        JScrollPane pane = new JScrollPane();

        String columns[]= {"Name","Pincode"};
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columns);
        table.setModel(tableModel);
        pane.setViewportView(table);
        add(pane);
    }

}
