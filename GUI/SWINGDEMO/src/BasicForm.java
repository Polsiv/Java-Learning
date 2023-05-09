import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicForm extends JFrame{
    private JPanel panelMain;
    private JTextField txt;
    private JButton btn;
public BasicForm() {
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            JOptionPane.showMessageDialog(btn, txt.getText() + " Hi there!");
            }
        });
    }
    public static void main(String[] args) {
        BasicForm h= new BasicForm();
        h.setContentPane(h.panelMain);
        h.setTitle("Hi");
        h.setSize(600, 900);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
