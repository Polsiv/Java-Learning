import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Grid{
    public static void main(String[] args) {

        JFrame window = new JFrame("Test flow");
        window.setSize(300, 300);
        
        JPanel control = new JPanel(new GridLayout(2,2));
      
        JButton[] button = new JButton[4];
        
        for(int i = 0; i < button.length; i++){
            button[i] = new JButton("Buttom" + (i + 1));
            control.add(button[i]);
        }
        window.setVisible(true);
    window.add(control);  
    }
}