package company.vanolincikus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel implements ActionListener {

    public JTextField pinField;
    public JButton enterButton;
    public AcademyBarFrame frame;

    public LoginPanel(AcademyBarFrame frame) {
        this.frame = frame;

        setLayout(new FlowLayout());

        pinField = new JTextField("Enter pin");
        add(pinField);

        enterButton = new JButton("Enter");
        enterButton.addActionListener(this);
        add(enterButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
}
