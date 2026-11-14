import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEx extends JFrame {
    public ButtonEx() {
        setTitle("ImageButton Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
        ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
        ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
        JButton b = new JButton("call~~", normalIcon);
        b.setRolloverIcon(rolloverIcon);
        b.setPressedIcon(pressedIcon);
        c.add(b);
        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEx();
    }
}
