import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.ORANGE);
        c.setLayout(new FlowLayout());
        c.add(new JButton("OK"));
        c.add(new JButton("Cancel"));
        c.add(new JButton("Ignore"));
        setSize(300, 150);
        setVisible(true);
    }

    public static void main() {
        new ContentPaneEx();
    }
}
