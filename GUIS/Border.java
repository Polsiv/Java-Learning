import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Border{
    public static void main(String[] args) {
        JButton[] buttom = new JButton[4];
        JFrame window = new JFrame("Test layout");

        window.setSize(1000, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

for(int i = 0; i < buttom.length; i++){
    buttom[i] = new JButton("Buttom" + (i + 1));
    /*window.add(buttom[i], window);*/
}

window.add(buttom[0], BorderLayout.NORTH);
window.add(buttom[1], BorderLayout.WEST);
window.add(buttom[2], BorderLayout.SOUTH);
window.add(buttom[3], BorderLayout.EAST);


window.add(new JLabel("This is the middle"), BorderLayout.CENTER);
window.setVisible(true);

buttom[0].addActionListener(new ActionListener() {


    @Override
    public void actionPerformed(ActionEvent e) {
       System.out.println("EL PEPE");
    }
        });
    }
}
