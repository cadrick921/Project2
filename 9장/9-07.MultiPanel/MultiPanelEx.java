import java.awt.*;
import javax.swing.*;

public class MultiPanelEx extends JFrame {
    public MultiPanelEx() {
        setTitle("MultiPanel Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }

    public class NorthPanel extends JPanel {
        public NorthPanel() {
            setBackground(Color.LIGHT_GRAY);
            setLayout(new FlowLayout());
            add(new JButton("Open"));
            add(new JButton("Read"));
            add(new JButton("Close"));
        }
    }

    public class CenterPanel extends JPanel {
        JLabel[] ar = { new JLabel("Hello"), new JLabel("Java"), new JLabel("Love") };

        public CenterPanel() {
            setLayout(null);
            for (int i = 0; i < ar.length; i++) {
                int x = (int) (Math.random() * 200);
                int y = (int) (Math.random() * 200);
                ar[i].setLocation(x, y);
                ar[i].setSize(100, 20);
                add(ar[i]);
            }
        }
    }

    public static void main(String[] args) {
        new MultiPanelEx();
    }
}
