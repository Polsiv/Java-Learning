import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.*;


class PanelFrame extends JFrame{

    private final JPanel buttonJPanel;
    private final JButton[] button;
    private final JPanel midPanel;
    
    PanelFrame(){
        super("Show panel demostracion");
        button = new JButton[5];

        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, button.length));

        for(int i = 0; i < button.length; i++){
            button[i] = new JButton("Button" + (i + 1));
            buttonJPanel.add(button[i]);
        }
        midPanel = new JPanel();
        midPanel.setLayout(new FlowLayout());

        JTextArea comments = new JTextArea();
        JLabel lbl_comments = new JLabel("Comments!");

        midPanel.add(lbl_comments);
        midPanel.add(comments);
        this.add(midPanel, BorderLayout.CENTER);

        this.add(buttonJPanel, BorderLayout.SOUTH);
    }
}
