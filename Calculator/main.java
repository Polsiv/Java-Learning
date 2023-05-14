import java.awt.Color;

import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        Calculator mypanel = new Calculator();
        mypanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mypanel.setSize(300, 200);
        mypanel.setBackground(Color.WHITE);
        mypanel.setVisible(true);
    }
}