package company.vanolincikus.panels;

import company.vanolincikus.models.*;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel implements ActionListener, MouseListener {

    public JTextField pinField;
    public JButton enterButton;
    public AcademyBarFrame frame;
    public JButton adminPanelButton;


    public LoginPanel(AcademyBarFrame frame) {
        this.frame = frame;

        setLayout(new FlowLayout());

        pinField = new JTextField("Enter pin");
        add(pinField);
        pinField.addMouseListener(this);

        enterButton = new JButton("Enter");
        enterButton.addActionListener(this);
        add(enterButton);


        adminPanelButton = new JButton("to Admin panel");
        adminPanelButton.addActionListener(this);
        add(adminPanelButton);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== adminPanelButton){
            for (Waitress waitress : frame.waitresses) {
                if(pinField.getText().equals(waitress.pinCode)) {
                   if(waitress.position.equals(Waitress.Position.ADMIN)){
                       frame.showAdminPannel();
                   }
                }
            }
        }

        if(pinField.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Pin cannot be less than 4 digits","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Waitress waitress : frame.waitresses) {
            if(pinField.getText().equals(waitress.pinCode)) {
                frame.currentWaitress = waitress;
                frame.showOperationPanel();
                break;
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(pinField.getText().equals("Enter pin")){
            pinField.setText("");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
