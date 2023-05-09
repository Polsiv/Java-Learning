import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;

public class Flow {
    public static void main(String[] args) {
        JFrame window = new JFrame("Test flow");

        Container container = window.getContentPane();
        window.setSize(300, 300);
        container.setLayout(new FlowLayout());
        JButton[] button = new JButton[4];
        
        for(int i = 0; i < button.length; i++){
            button[i] = new JButton("Buttom" + (i + 1));
            window.add(button[i], BorderLayout.CENTER);
            button[i].repaint();
        }
        window.setVisible(true);
    window.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    window.setVisible(true);    

    }
}
