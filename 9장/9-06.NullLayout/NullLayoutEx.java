import java.awt.*;
import javax.swing.*;

public class NullLayoutEx extends JFrame {
    public NullLayoutEx() {
        setTitle("NullLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        JLabel l = new JLabel("Hello, Press Buttons!");
        l.setLocation(130, 50);
        l.setSize(200, 20);
        c.add(l);
        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            c.add(b);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullLayoutEx();
    }
}
