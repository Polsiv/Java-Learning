import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {

    private final JPanel buttonJPanel;
    private final JButton[] button;
    private final JPanel midpanel;
    public String[] content = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

    Calculator() {
        super("Calculator");
        button = new JButton[16];

        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(4, 4));
        buttonJPanel.setBackground(Color.BLACK);

        for (int i = 0; i < button.length; ++i) {
            button[i] = new JButton(content[i]);
            buttonJPanel.add(button[i]);
        }

        midpanel = new JPanel();
        midpanel.setLayout(new FlowLayout());
        midpanel.setBackground(Color.WHITE);

        JTextArea input = new JTextArea(1, 1);

        input.setPreferredSize(new Dimension(1, 1));

        midpanel.add(input);
        this.add(midpanel, BorderLayout.CENTER);
        this.add(buttonJPanel, BorderLayout.SOUTH);
    }
}
