import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame {
    private final JTextField textarea1;
    private final JTextField textarea2;
    private final JTextField textarea3;
    private final JPasswordField pass;

    public Text() {
        super("Text Demo");
        setLayout(new FlowLayout());

        textarea1 = new JTextField(10);
        textarea2 = new JTextField("Enter whatever you want");
        textarea3 = new JTextField("You can't edit this text", 20);
        textarea3.setEditable(false);

        pass = new JPasswordField(10);

        add(textarea1);
        add(textarea2);
        add(textarea3);
        add(pass);

        TextManager manager = new TextManager();

        textarea1.addActionListener(manager);
        textarea2.addActionListener(manager);
        textarea3.addActionListener(manager);
        pass.addActionListener(manager);
    }

    private class TextManager implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            String output = "This text field displays: " + evt.getActionCommand();
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
