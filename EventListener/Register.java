import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame {
    private final JTextField username;
    private final JPasswordField pass;
    private final JPasswordField confirm;
    private final JButton button;

    private final JLabel usernameDisplay;
    private final JLabel passwordDisplay;
    private final JLabel passwordConfirmDisplay;

    private final JPanel dataPanel;

    public Register() {
        super("Register");

        this.dataPanel = new JPanel(new GridLayout(3, 2));
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.setEnabled(false);

        this.usernameDisplay = new JLabel("Username:");
        this.username = new JTextField();

        this.passwordDisplay = new JLabel("Password: ");
        this.pass = new JPasswordField();

        this.passwordConfirmDisplay = new JLabel("Confirm Password: ");
        this.confirm = new JPasswordField();

        dataPanel.add(usernameDisplay);
        dataPanel.add(username);
        dataPanel.add(passwordDisplay);
        dataPanel.add(pass);
        dataPanel.add(passwordConfirmDisplay);
        dataPanel.add(confirm);
       
        
        add(dataPanel);
        add(button);

        confirm.addActionListener(evt -> {
            String password1 = String.valueOf(pass.getPassword());
            String confirm1 = String.valueOf(confirm.getPassword());

            System.out.println(password1);
            System.out.println(confirm1);

         boolean confirmation = Arrays.equals(pass.getPassword(), confirm.getPassword());

         if (confirmation){
            button.setEnabled(true);
         }
 
        });
    }
}
